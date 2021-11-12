/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.discovery;

import de.onvif.de.onvif.traits.implmentation.SoapLedger;
import de.onvif.de.onvif.traits.SoapBookkeeping;
import de.onvif.soap.OnvifDevice;
import de.onvif.soap.SOAP;
import de.onvif.soap.exception.SOAPFaultException;
import java.net.ConnectException;
import java.net.URL;
import java.util.List;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import org.onvif.ver10.schema.Profile;

/**
 *    This is a class to contain the ONVIF device connections.  Since Strings in Java are immutable, the values can't 
 * wiped.  If security is an issue, then you should secure the platform this is running on top.
 * @author jmccay
 */
public class OnvifDevicePointer 
        extends URLDevicePointer
        implements SoapBookkeeping 
{

    private String user = null;
    private String password = null;
    private OnvifDevice device = null;
    private List<Profile> profiles;
    private String snapshotUrl;
    
    private SoapLedger<SOAPMessage> ledger;

    
    /**
     * Constructor for a device requiring a password
     * @param address
     * @param user
     * @param password 
     */
    public OnvifDevicePointer(URL address, String user, String password) 
    {
        super(address);
        this.password = password;
        this.user = user;
    
        try {
            
            this.device = new OnvifDevice(address.getHost(), user, password);
//            this.ledger = device.getLedger();
            this.ledger = SoapBookkeeping.createLedger();
            super.setName(device.getName());
			profiles = device.getDevices().getProfiles();
 			this.snapshotUrl = device.getMedia().getSnapshotUri(profiles.get(0).getToken());
            
        } catch (ConnectException | SOAPException | SOAPFaultException e) {
            throw new RuntimeException("no onvif device or device not configured", e);
        }
    }

    /**
     * Constructor for just the URL.  It is still possible to pass the user and password through setters?
     * @param deviceUrl 
     */
    public OnvifDevicePointer(URL deviceUrl)  
    {
        this(deviceUrl, null, null);
    }
    
    /**
     * Constructor for just the URL.It is still possible to pass the user and password through setters?
     * @param device
     */
    public OnvifDevicePointer(OnvifDevice device) {
        super(device.getDeviceUri());
        try {
            this.device = device;
            this.ledger = device.getLedger();
            super.setName(device.getName());
            profiles = device.getDevices().getProfiles();
            this.snapshotUrl = device.getMedia().getSnapshotUri(profiles.get(0).getToken());
        } catch (ConnectException | SOAPException | SOAPFaultException e) {
            throw new RuntimeException("no onvif device or device not configured", e);
        }
    } 
    
    /**
     * Returns the User value used to connect to the ONVIF device.
     * @return User.
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the user value to the value of user.
     * @param user The user id to pass into the ONVIF device.
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Returns the password contained in the object.
     * @return The password contained in the object.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password to be used in the connection.
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public OnvifDevice getDevice() {
        return device;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    @Override
    public SoapLedger<SOAPMessage> getLedger() {
        return this.ledger;
    }

    @Override
    public SOAP getSoap() {
        return this.device.getSoap();
    }

    @Override
    public void setLedger(SoapLedger<SOAPMessage> ledger) {
        this.ledger = ledger;
    }
    
    
    
}
