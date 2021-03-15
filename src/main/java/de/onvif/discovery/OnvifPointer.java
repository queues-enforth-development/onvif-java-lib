package de.onvif.discovery;

import java.net.ConnectException;
import java.net.URL;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.schema.Profile;

import de.onvif.soap.OnvifDevice;

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
			final Profile profile = profiles.get(0);
			this.snapshotUrl = device.getMedia().getSnapshotUri(profile.getToken());
		} catch (ConnectException | SOAPException e) {
			throw new RuntimeException("no onvif device or device not configured", e);
		}
	}
    
    /**
     *
     * @param service
     */
    public OnvifPointer(URL service) {
		this(service.getHost());
	}

    /**
     *
     * @return
     * @throws SOAPException
     * @throws ConnectException
     */
    public OnvifDevice getOnvifDevice() throws SOAPException, ConnectException {
		return new OnvifDevice(getAddress());
	}

    @Override
	public String toString() {
		return String.format("ONVIF: %s@%s", super.getName(), getAddress());
	}
}
