/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.discovery;

import de.onvif.soap.OnvifDevice;
import java.net.ConnectException;
import java.net.URL;
import java.util.List;
import javax.xml.soap.SOAPException;
import org.onvif.ver10.schema.Profile;

/**
 *    This is a class to contain the ONVIF device connections.  Since Strings in Java are immutable, the values can't 
 * wiped.  If security is an issue, then you should secure the platform this is running on top.
 * @author jmccay
 */
public class OnvifDevicePointer 
        extends URLDevicePointer 
{

    private String user = null;
    private String password = null;
    private OnvifDevice device;
    private List<Profile> profiles;
    private String snapshotUrl;
    
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
            super.setName(device.getName());
			profiles = device.getDevices().getProfiles();
 			this.snapshotUrl = device.getMedia().getSnapshotUri(profiles.get(0).getToken());
            
        } catch (ConnectException | SOAPException e) {
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
    
    
}
