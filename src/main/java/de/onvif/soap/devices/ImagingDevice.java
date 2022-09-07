package de.onvif.soap.devices;

import java.net.ConnectException;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.schema.AbsoluteFocus;
import org.onvif.ver10.schema.FocusMove;
import org.onvif.ver10.schema.ImagingOptions20;
import org.onvif.ver10.schema.ImagingSettings20;
import org.onvif.ver20.imaging.wsdl.GetImagingSettings;
import org.onvif.ver20.imaging.wsdl.GetImagingSettingsResponse;
import org.onvif.ver20.imaging.wsdl.GetOptions;
import org.onvif.ver20.imaging.wsdl.GetOptionsResponse;
import org.onvif.ver20.imaging.wsdl.Move;
import org.onvif.ver20.imaging.wsdl.MoveResponse;
import org.onvif.ver20.imaging.wsdl.SetImagingSettings;
import org.onvif.ver20.imaging.wsdl.SetImagingSettingsResponse;

import de.onvif.soap.OnvifDevice;
import de.onvif.soap.SOAP;
import de.onvif.soap.exception.SOAPFaultException;
import java.util.logging.Level;
import java.util.logging.Logger;
import de.onvif.de.onvif.traits.SoapUser;

/**
 *
 *
 */
public class ImagingDevice 
        implements SoapUser
{
    private static final Logger LOGGER = Logger.getLogger(ImagingDevice.class.getPackage().getName());

	@SuppressWarnings("unused")
	private final OnvifDevice onvifDevice;
	private final SOAP soap;

    /**
     *
     * @param onvifDevice
     */
    public ImagingDevice(OnvifDevice onvifDevice) {
		this.onvifDevice = onvifDevice;
		this.soap = onvifDevice.getSoap();

	}

    /**
     *
     * @param videoSourceToken
     * @return
     */
    public ImagingOptions20 getOptions(String videoSourceToken) {
		if (videoSourceToken == null) {
			return null;
		}

		GetOptions request = new GetOptions();
		GetOptionsResponse response = new GetOptionsResponse();

		request.setVideoSourceToken(videoSourceToken);

		try {
			response = (GetOptionsResponse) soap.createSOAPImagingRequest(request, response, false);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LOGGER.log(Level.WARNING,"An error occurred in getOptions.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getImagingOptions();
	}

    /**
     *
     * @param videoSourceToken
     * @param absoluteFocusValue
     * @return
     */
    public boolean moveFocus(String videoSourceToken, float absoluteFocusValue) {
		if (videoSourceToken == null) {
			return false;
		}

		Move request = new Move();
		MoveResponse response = new MoveResponse();

		AbsoluteFocus absoluteFocus = new AbsoluteFocus();
		absoluteFocus.setPosition(absoluteFocusValue);

		FocusMove focusMove = new FocusMove();
		focusMove.setAbsolute(absoluteFocus);

		request.setVideoSourceToken(videoSourceToken);
		request.setFocus(focusMove);

		try {
			response = (MoveResponse) soap.createSOAPImagingRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LOGGER.log(Level.WARNING,"An error occurred in moveFucus.",e);
			return false;
		}

		return response != null;
	}

    /**
     *
     * @param videoSourceToken
     * @return
     */
    public ImagingSettings20 getImagingSettings(String videoSourceToken) {
		if (videoSourceToken == null) {
			return null;
		}

		GetImagingSettings request = new GetImagingSettings();
		GetImagingSettingsResponse response = new GetImagingSettingsResponse();

		request.setVideoSourceToken(videoSourceToken);

		try {
			response = (GetImagingSettingsResponse) soap.createSOAPImagingRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LOGGER.log(Level.WARNING,"An error occurred in getImageSettings.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getImagingSettings();
	}

    /**
     *
     * @param videoSourceToken
     * @param imagingSettings
     * @return
     */
    public boolean setImagingSettings(String videoSourceToken, ImagingSettings20 imagingSettings) {
		if (videoSourceToken == null) {
			return false;
		}

		SetImagingSettings request = new SetImagingSettings();
		SetImagingSettingsResponse response = new SetImagingSettingsResponse();

		request.setVideoSourceToken(videoSourceToken);
		request.setImagingSettings(imagingSettings);

		try {
			response = (SetImagingSettingsResponse) soap.createSOAPImagingRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LOGGER.log(Level.WARNING,"An error occurred in setImageSettings.",e);
			return false;
		}

		return response != null;
	}

    @Override
    public SOAP getSoap() {
        return soap;
    }
}

