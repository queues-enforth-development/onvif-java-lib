package de.onvif.soap.devices;

import java.net.ConnectException;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.media.wsdl.GetSnapshotUri;
import org.onvif.ver10.media.wsdl.GetSnapshotUriResponse;
import org.onvif.ver10.media.wsdl.GetStreamUri;
import org.onvif.ver10.media.wsdl.GetStreamUriResponse;
import org.onvif.ver10.media.wsdl.GetVideoEncoderConfigurationOptions;
import org.onvif.ver10.media.wsdl.GetVideoEncoderConfigurationOptionsResponse;
import org.onvif.ver10.media.wsdl.GetVideoSources;
import org.onvif.ver10.media.wsdl.GetVideoSourcesResponse;
import org.onvif.ver10.media.wsdl.SetVideoEncoderConfiguration;
import org.onvif.ver10.media.wsdl.SetVideoEncoderConfigurationResponse;
import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.StreamSetup;
import org.onvif.ver10.schema.StreamType;
import org.onvif.ver10.schema.Transport;
import org.onvif.ver10.schema.TransportProtocol;
import org.onvif.ver10.schema.VideoEncoderConfiguration;
import org.onvif.ver10.schema.VideoEncoderConfigurationOptions;
import org.onvif.ver10.schema.VideoSource;

import de.onvif.soap.OnvifDevice;
import de.onvif.soap.SOAP;
import de.onvif.soap.exception.SOAPFaultException;
import de.onvif.de.onvif.traits.SoapUser;

/**
 *
 *
 */
public class MediaDevice 
        implements SoapUser
{
	private final OnvifDevice onvifDevice;
	private final SOAP soap;

    /**
     *
     * @param onvifDevice -
     */
    public MediaDevice(OnvifDevice onvifDevice) {
		this.onvifDevice = onvifDevice;
		this.soap = onvifDevice.getSoap();

	}

    /**
     *
     * @param profileNumber -
     * @return -
     * @throws ConnectException -
     * @throws SOAPException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     * @deprecated
     */
    @Deprecated
	public String getHTTPStreamUri(int profileNumber) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.HTTP);
		setup.setTransport(transport);
		return getStreamUri(setup, profileNumber);
	}

    /**
     *
     * @param profileToken -
     * @return -
     * @throws ConnectException -
     * @throws SOAPException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     */
    public String getHTTPStreamUri(String profileToken) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
        // get profile token...
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.HTTP);
		setup.setTransport(transport);
		return getStreamUri(profileToken, setup);
	}

    /**
     *
     * @param profileNumber -
     * @return -
     * @throws ConnectException -
     * @throws SOAPException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     * @deprecated
     */
    @Deprecated
	public String getUDPStreamUri(int profileNumber) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.UDP);
		setup.setTransport(transport);
		return getStreamUri(setup, profileNumber);
	}

    /**
     *
     * @param profileToken -
     * @return -
     * @throws ConnectException -
     * @throws SOAPException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     */
    public String getUDPStreamUri(String profileToken) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.UDP);
		setup.setTransport(transport);
		return getStreamUri(profileToken, setup);
	}

    /**
     *
     * @param profileNumber -
     * @return -
     * @throws ConnectException -
     * @throws SOAPException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     * @deprecated
     */
    @Deprecated
	public String getTCPStreamUri(int profileNumber) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.TCP);
		setup.setTransport(transport);
		return getStreamUri(setup, profileNumber);
	}

    /**
     *
     * @param profileToken -
     * @return -
     * @throws ConnectException -
     * @throws SOAPException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     */
    public String getTCPStreamUri(String profileToken) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.TCP);
		setup.setTransport(transport);
		return getStreamUri(profileToken, setup);
	}

    /**
     *
     * @param profileNumber -
     * @return -
     * @throws ConnectException -
     * @throws SOAPException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     * @deprecated
     */
    @Deprecated
	public String getRTSPStreamUri(int profileNumber) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.TCP);
		setup.setTransport(transport);
		return getStreamUri(setup, profileNumber);
	}

    /**
     *
     * @param profileToken -
     * @return -
     * @throws ConnectException -
     * @throws SOAPException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     */
    public String getRTSPStreamUri(String profileToken) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		StreamSetup setup = new StreamSetup();
		setup.setStream(StreamType.RTP_UNICAST);
		Transport transport = new Transport();
		transport.setProtocol(TransportProtocol.TCP);
		setup.setTransport(transport);
		return getStreamUri(profileToken, setup);
	}

    /**
     *
     * @param streamSetup -
     * @param profileNumber -
     * @return -
     * @throws ConnectException -
     * @throws SOAPException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     * @deprecated
     */
    @Deprecated
	public String getStreamUri(StreamSetup streamSetup, int profileNumber) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		Profile profile = onvifDevice.getDevices().getProfiles().get(profileNumber);
		return getStreamUri(profile, streamSetup);
	}

    /**
     *
     * @param profile -
     * @param streamSetup -
     * @return -
     * @throws ConnectException -
     * @throws SOAPException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     * @deprecated
     */
    @Deprecated
	public String getStreamUri(Profile profile, StreamSetup streamSetup) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		return getStreamUri(profile.getToken(), streamSetup);
	}

    /**
     *
     * @param profileToken -
     * @param streamSetup -
     * @return -
     * @throws SOAPException -
     * @throws ConnectException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     */
    public String getStreamUri(String profileToken, StreamSetup streamSetup) 
            throws SOAPException, ConnectException, SOAPFaultException 
    {
		GetStreamUri request = new GetStreamUri();
		GetStreamUriResponse response = new GetStreamUriResponse();

		request.setProfileToken(profileToken);
		request.setStreamSetup(streamSetup);

		try {
			response = (GetStreamUriResponse) soap.createSOAPMediaRequest(request, response, false);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			throw e;
		}

		if (response == null) {
			return null;
		}

		return onvifDevice.replaceLocalIpWithProxyIp(response.getMediaUri().getUri());
	}

    /**
     *
     * @param profile -
     * @return -
     */
    public static VideoEncoderConfiguration getVideoEncoderConfiguration(Profile profile) {
		return profile.getVideoEncoderConfiguration();
	}

    /**
     *
     * @param profileToken -
     * @return -
     * @throws SOAPException -
     * @throws ConnectException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     */
    public VideoEncoderConfigurationOptions getVideoEncoderConfigurationOptions(String profileToken) 
            throws SOAPException, ConnectException, SOAPFaultException 
    {
		GetVideoEncoderConfigurationOptions request = new GetVideoEncoderConfigurationOptions();
		GetVideoEncoderConfigurationOptionsResponse response = new GetVideoEncoderConfigurationOptionsResponse();

		request.setProfileToken(profileToken);

		try {
			response = (GetVideoEncoderConfigurationOptionsResponse) soap.createSOAPMediaRequest(request, response, false);
		} catch (SOAPException | ConnectException e) {
			throw e;
		}

		if (response == null) {
			return null;
		}

		return response.getOptions();
	}

    /**
     *
     * @param videoEncoderConfiguration -
     * @return -
     * @throws SOAPException -
     * @throws ConnectException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     */
    public boolean setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) 
            throws SOAPException, ConnectException, SOAPFaultException 
    {
		SetVideoEncoderConfiguration request = new SetVideoEncoderConfiguration();
		SetVideoEncoderConfigurationResponse response = new SetVideoEncoderConfigurationResponse();

		request.setConfiguration(videoEncoderConfiguration);
		request.setForcePersistence(true);

		try {
			response = (SetVideoEncoderConfigurationResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException e) {
			throw e;
		}

		return response != null;
	}

    /**
     *
     * @param profileToken -
     * @return -
     * @throws SOAPException -
     * @throws ConnectException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     */
    public String getSceenshotUri(String profileToken) 
            throws SOAPException, ConnectException, SOAPFaultException 
    {
		return getSnapshotUri(profileToken);
	}

    /**
     *
     * @param profileToken -
     * @return -
     * @throws SOAPException -
     * @throws ConnectException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     */
    public String getSnapshotUri(String profileToken) 
            throws SOAPException, ConnectException, SOAPFaultException 
    {
		GetSnapshotUri request = new GetSnapshotUri();
		GetSnapshotUriResponse response = new GetSnapshotUriResponse();

		request.setProfileToken(profileToken);

		try {
			response = (GetSnapshotUriResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException e) {
			throw e;
		}

		if (response == null || response.getMediaUri() == null) {
			return null;
		}

		return onvifDevice.replaceLocalIpWithProxyIp(response.getMediaUri().getUri());
	}

    /**
     *
     * @return -
     * @throws SOAPException -
     * @throws ConnectException -
     * @throws de.onvif.soap.exception.SOAPFaultException -
     */
    public List<VideoSource> getVideoSources() 
            throws SOAPException, ConnectException, SOAPFaultException 
    {
		GetVideoSources request = new GetVideoSources();
		GetVideoSourcesResponse response = new GetVideoSourcesResponse();

		try {
			response = (GetVideoSourcesResponse) soap.createSOAPMediaRequest(request, response, false);
		} catch (SOAPException | ConnectException e) {
			throw e;
		}

		if (response == null) {
			return null;
		}

		return response.getVideoSources();
	}

    @Override
    public SOAP getSoap() {
        return soap;
    }

}
