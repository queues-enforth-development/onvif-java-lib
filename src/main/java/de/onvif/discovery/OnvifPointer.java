package de.onvif.discovery;

import java.net.ConnectException;
import java.net.URL;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.schema.Profile;

import de.onvif.soap.OnvifDevice;
import de.onvif.soap.exception.SOAPFaultException;

/**
 * @author th
 * @date 2015-06-19
 */
public class OnvifPointer extends URLDevicePointer {
//	private final String address;
//	private final String name;

    /**
     *
     * @return
     */
    public String getSnapshotUrl() {
		return snapshotUrl;
	}

    /**
     *
     * @return
     */
    @Override
    public String getName() {
		return super.getName();
	}

    /**
     * 
     * @return
     */
    public String getAddress() {
		return getURLAddress().toString();
	}

	private final String snapshotUrl;

    /**
     *
     * @param address
     */
    public OnvifPointer(String address) {
        super(address);
		try {
			final OnvifDevice device = new OnvifDevice(address);
			super.setName(device.getName());
			final List<Profile> profiles = device.getDevices().getProfiles();
			final Profile profile = (null!=profiles)? ((profiles.size() > 0)? profiles.get(0):null):null;
			this.snapshotUrl = device.getMedia().getSnapshotUri(profile.getToken());
		} catch (ConnectException | SOAPException | SOAPFaultException e) {
			throw new RuntimeException("no onvif device or device not configured", e);
		}
	}
    
    /**
     *
     * @param service
     */
    public OnvifPointer(URL service) {
		this(service.getHost());
        String s = service.getHost();
        String t = service.getAuthority();
	}

    /**
     *
     * @return
     * @throws SOAPException
     * @throws ConnectException
     * @throws de.onvif.soap.exception.SOAPFaultException
     */
    public OnvifDevice getOnvifDevice() 
            throws SOAPException, ConnectException, SOAPFaultException 
    {
		return new OnvifDevice(getAddress());
	}

    @Override
	public String toString() {
		return String.format("ONVIF: %s@%s", super.getName(), getAddress());
	}
}
