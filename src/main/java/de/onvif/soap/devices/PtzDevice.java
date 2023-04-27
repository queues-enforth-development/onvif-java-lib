package de.onvif.soap.devices;

import java.net.ConnectException;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.schema.FloatRange;
import org.onvif.ver10.schema.PTZConfiguration;
import org.onvif.ver10.schema.PTZNode;
import org.onvif.ver10.schema.PTZPreset;
import org.onvif.ver10.schema.PTZSpaces;
import org.onvif.ver10.schema.PTZSpeed;
import org.onvif.ver10.schema.PTZStatus;
import org.onvif.ver10.schema.PTZVector;
import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.Vector1D;
import org.onvif.ver10.schema.Vector2D;
import org.onvif.ver20.ptz.wsdl.AbsoluteMove;
import org.onvif.ver20.ptz.wsdl.AbsoluteMoveResponse;
import org.onvif.ver20.ptz.wsdl.ContinuousMove;
import org.onvif.ver20.ptz.wsdl.ContinuousMoveResponse;
import org.onvif.ver20.ptz.wsdl.GetNode;
import org.onvif.ver20.ptz.wsdl.GetNodeResponse;
import org.onvif.ver20.ptz.wsdl.GetNodes;
import org.onvif.ver20.ptz.wsdl.GetNodesResponse;
import org.onvif.ver20.ptz.wsdl.GetPresets;
import org.onvif.ver20.ptz.wsdl.GetPresetsResponse;
import org.onvif.ver20.ptz.wsdl.GetStatus;
import org.onvif.ver20.ptz.wsdl.GetStatusResponse;
import org.onvif.ver20.ptz.wsdl.GotoPreset;
import org.onvif.ver20.ptz.wsdl.GotoPresetResponse;
import org.onvif.ver20.ptz.wsdl.RelativeMove;
import org.onvif.ver20.ptz.wsdl.RelativeMoveResponse;
import org.onvif.ver20.ptz.wsdl.RemovePreset;
import org.onvif.ver20.ptz.wsdl.RemovePresetResponse;
import org.onvif.ver20.ptz.wsdl.SetHomePosition;
import org.onvif.ver20.ptz.wsdl.SetHomePositionResponse;
import org.onvif.ver20.ptz.wsdl.SetPreset;
import org.onvif.ver20.ptz.wsdl.SetPresetResponse;
import org.onvif.ver20.ptz.wsdl.Stop;
import org.onvif.ver20.ptz.wsdl.StopResponse;

import de.onvif.soap.OnvifDevice;
import de.onvif.soap.SOAP;
import de.onvif.soap.exception.SOAPFaultException;
import de.onvif.de.onvif.traits.SoapUser;

/**
 *
 *
 */
public class PtzDevice 
        implements de.onvif.LoggerInterface, SoapUser
{
	private final OnvifDevice onvifDevice;
	private final SOAP soap;

    /**
     *
     * @param onvifDevice - 
     */
    public PtzDevice(OnvifDevice onvifDevice) {
		this.onvifDevice = onvifDevice;
		this.soap = onvifDevice.getSoap();

	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public boolean isPtzOperationsSupported(String profileToken) {
		return getPTZConfiguration(profileToken) != null;
	}

	/**
	 * @param profileToken - 
	 * @return  -If is null, PTZ operations are not supported
	 */
	public PTZConfiguration getPTZConfiguration(String profileToken) {
        PTZConfiguration result;
		if (profileToken == null || profileToken.equals("")) {
			return null;
		}
		Profile profile = onvifDevice.getDevices().getProfile(profileToken);
		if (profile == null) {
			throw new IllegalArgumentException("No profile available for token: "+profileToken);
		}
        result = profile.getPTZConfiguration();

        return result;
	}

    /**
     *
     * @return -
     */
    public List<PTZNode> getNodes() {
		GetNodes request = new GetNodes();
		GetNodesResponse response = new GetNodesResponse();

		try {
			response = (GetNodesResponse) soap.createSOAPDeviceRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			logger.logError(e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getPTZNode();
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public PTZNode getNode(String profileToken) {
		return getNode(getPTZConfiguration(profileToken));
	}

    /**
     *
     * @param ptzConfiguration - 
     * @return -
     */
    public PTZNode getNode(PTZConfiguration ptzConfiguration) {
		GetNode request = new GetNode();
		GetNodeResponse response = new GetNodeResponse();

		if (ptzConfiguration == null) {
			return null; // no PTZ support
		}

        String nodeToken = ptzConfiguration.getNodeToken();
		request.setNodeToken(nodeToken);

		try {
			response = (GetNodeResponse) soap.createSOAPDeviceRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {

			logger.logError(e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getPTZNode();
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public FloatRange getPanSpaces(String profileToken) {
		PTZNode node = getNode(profileToken);

		PTZSpaces ptzSpaces = node.getSupportedPTZSpaces();
		return ptzSpaces.getAbsolutePanTiltPositionSpace().get(0).getXRange();
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public FloatRange getTiltSpaces(String profileToken) {
		PTZNode node = getNode(profileToken);

		PTZSpaces ptzSpaces = node.getSupportedPTZSpaces();
		return ptzSpaces.getAbsolutePanTiltPositionSpace().get(0).getYRange();
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public FloatRange getZoomSpaces(String profileToken) {
		PTZNode node = getNode(profileToken);

		PTZSpaces ptzSpaces = node.getSupportedPTZSpaces();
		return ptzSpaces.getAbsoluteZoomPositionSpace().get(0).getXRange();
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public boolean isAbsoluteMoveSupported(String profileToken) {
		Profile profile = onvifDevice.getDevices().getProfile(profileToken);
		try {
			if (profile.getPTZConfiguration().getDefaultAbsolutePantTiltPositionSpace() != null) {
				return true;
			}
		} catch (NullPointerException e) {
		}
		return false;
	}

	/**
	 * 
     * @param profileToken - 
	 * @param x - 
	 *            Pan-Position
	 * @param y - 
	 *            Tilt-Position
	 * @param zoom - 
	 *            Zoom
	 * @see de.onvif.soap.devices.PtzDevice#getPanSpaces(String) 
     * @see de.onvif.soap.devices.PtzDevice#getTiltSpaces(String)
     * @see de.onvif.soap.devices.PtzDevice#getZoomSpaces(String)
	 * @return  -True if move successful
	 * @throws SOAPException -
     * @throws java.net.ConnectException
     * @throws de.onvif.soap.exception.SOAPFaultException
	 */
	public boolean absoluteMove(String profileToken, float x, float y, float zoom) 
            throws SOAPException, SOAPFaultException, ConnectException 
    {
        // Do we have a node?
        PTZNode node = getNode(profileToken);
        if (node != null) {
            FloatRange xRange = node.getSupportedPTZSpaces().getAbsolutePanTiltPositionSpace().get(0).getXRange();
            FloatRange yRange = node.getSupportedPTZSpaces().getAbsolutePanTiltPositionSpace().get(0).getYRange();
            FloatRange zRange = node.getSupportedPTZSpaces().getAbsoluteZoomPositionSpace().get(0).getXRange();

            if (zoom < zRange.getMin() || zoom > zRange.getMax()) {
                throw new IllegalArgumentException("Bad value for zoom: " + zoom);
            }
            if (x < xRange.getMin() || x > xRange.getMax()) {
                throw new IllegalArgumentException("Bad value for pan:/x " + x);
            }
            if (y < yRange.getMin() || y > yRange.getMax()) {
                throw new IllegalArgumentException("Bad value for tilt/y: " + y);
            }
        }

		AbsoluteMove request = new AbsoluteMove();
		AbsoluteMoveResponse response = new AbsoluteMoveResponse();

		Vector2D panTiltVector = new Vector2D();
		panTiltVector.setX(x);
		panTiltVector.setY(y);
		Vector1D zoomVector = new Vector1D();
		zoomVector.setX(zoom);

		PTZVector ptzVector = new PTZVector();
		ptzVector.setPanTilt(panTiltVector);
		ptzVector.setZoom(zoomVector);
		request.setPosition(ptzVector);

		request.setProfileToken(profileToken);

		try {
			response = (AbsoluteMoveResponse) soap.createSOAPPtzRequest(request, response, true);
		} catch (SOAPException e) {
			throw e;
		} catch (ConnectException | SOAPFaultException e) {
			logger.logError(e);
            throw e;
		}

		return response != null;
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public boolean isRelativeMoveSupported(String profileToken) {
		Profile profile = onvifDevice.getDevices().getProfile(profileToken);
		try {
			if (profile.getPTZConfiguration().getDefaultRelativePanTiltTranslationSpace() != null) {
				return true;
			}
		} catch (NullPointerException e) {
		}
		return false;
	}

    /**
     *
     * @param profileToken - 
     * @param x - 
     * @param y - 
     * @param zoom - 
     * @return -
     */
    public boolean relativeMove(String profileToken, float x, float y, float zoom) {
		RelativeMove request = new RelativeMove();
		RelativeMoveResponse response = new RelativeMoveResponse();

		Vector2D panTiltVector = new Vector2D();
		panTiltVector.setX(x);
		panTiltVector.setY(y);
		Vector1D zoomVector = new Vector1D();
		zoomVector.setX(zoom);

		PTZVector translation = new PTZVector();
		translation.setPanTilt(panTiltVector);
		translation.setZoom(zoomVector);

		request.setProfileToken(profileToken);
		request.setTranslation(translation);

		try {
			response = (RelativeMoveResponse) soap.createSOAPPtzRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			logger.logError(e);
			return false;
		}

		return response != null;
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public boolean isContinuosMoveSupported(String profileToken) {
		Profile profile = onvifDevice.getDevices().getProfile(profileToken);
		try {
			if (profile.getPTZConfiguration().getDefaultContinuousPanTiltVelocitySpace() != null) {
				return true;
			}
		} catch (NullPointerException e) {
		}
		return false;
	}

    /**
     *
     * @param profileToken - 
     * @param x - 
     * @param y - 
     * @param zoom - 
     * @return -
     */
    public boolean continuousMove(String profileToken, float x, float y, float zoom) {
		ContinuousMove request = new ContinuousMove();
		ContinuousMoveResponse response = new ContinuousMoveResponse();

		Vector2D panTiltVector = new Vector2D();
		panTiltVector.setX(x);
		panTiltVector.setY(y);
		Vector1D zoomVector = new Vector1D();
		zoomVector.setX(zoom);

		PTZSpeed ptzSpeed = new PTZSpeed();
		ptzSpeed.setPanTilt(panTiltVector);
		ptzSpeed.setZoom(zoomVector);
		request.setVelocity(ptzSpeed);

		request.setProfileToken(profileToken);

		try {
			response = (ContinuousMoveResponse) soap.createSOAPPtzRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			logger.logError(e);
			return false;
		}

		return response != null;
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public boolean stopMove(String profileToken) {
		Stop request = new Stop();
		request.setPanTilt(true);
		request.setZoom(true);
		StopResponse response = new StopResponse();

		request.setProfileToken(profileToken);

		try {
			response = (StopResponse) soap.createSOAPPtzRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			logger.logError(e);
			return false;
		}

		return response != null;
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public PTZStatus getStatus(String profileToken) {
		GetStatus request = new GetStatus();
		GetStatusResponse response = new GetStatusResponse();

		request.setProfileToken(profileToken);

		try {
			response = (GetStatusResponse) soap.createSOAPPtzRequest(request, response, false);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			logger.logError(e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getPTZStatus();
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public PTZVector getPosition(String profileToken) {
		PTZStatus status = getStatus(profileToken);

		if (status == null) {
			return null;
		}

		return status.getPosition();
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public boolean setHomePosition(String profileToken) {
		SetHomePosition request = new SetHomePosition();
		SetHomePositionResponse response = new SetHomePositionResponse();

		request.setProfileToken(profileToken);

		try {
			response = (SetHomePositionResponse) soap.createSOAPPtzRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			logger.logError(e);
			return false;
		}

		return response != null;
	}

    /**
     *
     * @param profileToken - 
     * @return -
     */
    public List<PTZPreset> getPresets(String profileToken) {
		GetPresets request = new GetPresets();
		GetPresetsResponse response = new GetPresetsResponse();

		request.setProfileToken(profileToken);

		try {
			response = (GetPresetsResponse) soap.createSOAPPtzRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			logger.logError(e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getPreset();
	}

    /**
     *
     * @param presetName - 
     * @param presetToken - 
     * @param profileToken - 
     * @return -
     */
    public String setPreset(String presetName, String presetToken, String profileToken) {
		SetPreset request = new SetPreset();
		SetPresetResponse response = new SetPresetResponse();

		request.setProfileToken(profileToken);
		request.setPresetName(presetName);
		request.setPresetToken(presetToken);

		try {
			response = (SetPresetResponse) soap.createSOAPPtzRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			logger.logError(e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getPresetToken();
	}

    /**
     *
     * @param presetName - 
     * @param profileToken - 
     * @return -
     */
    public String setPreset(String presetName, String profileToken) {
		return setPreset(presetName, null, profileToken);
	}

    /**
     *
     * @param presetToken - 
     * @param profileToken - 
     * @return -
     */
    public boolean removePreset(String presetToken, String profileToken) {
		RemovePreset request = new RemovePreset();
		RemovePresetResponse response = new RemovePresetResponse();

		request.setProfileToken(profileToken);
		request.setPresetToken(presetToken);

		try {
			response = (RemovePresetResponse) soap.createSOAPPtzRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			logger.logError(e);
			return false;
		}

		return response != null;
	}

    /**
     *
     * @param presetToken - 
     * @param profileToken - 
     * @return -
     */
    public boolean gotoPreset(String presetToken, String profileToken) {
		GotoPreset request = new GotoPreset();
		GotoPresetResponse response = new GotoPresetResponse();

		request.setProfileToken(profileToken);
		request.setPresetToken(presetToken);

		try {
			response = (GotoPresetResponse) soap.createSOAPPtzRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			logger.logError(e);
			return false;
		}

		return response != null;
	}

    @Override
    public SOAP getSoap() {
        return soap;
    }
}
