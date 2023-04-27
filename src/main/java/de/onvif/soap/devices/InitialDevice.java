package de.onvif.soap.devices;

import de.onvif.LibLogger;
import de.onvif.LoggerInterface;
import java.net.ConnectException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.device.wsdl.GetCapabilities;
import org.onvif.ver10.device.wsdl.GetCapabilitiesResponse;
import org.onvif.ver10.device.wsdl.GetDeviceInformation;
import org.onvif.ver10.device.wsdl.GetDeviceInformationResponse;
import org.onvif.ver10.device.wsdl.GetHostname;
import org.onvif.ver10.device.wsdl.GetHostnameResponse;
import org.onvif.ver10.device.wsdl.GetScopes;
import org.onvif.ver10.device.wsdl.GetScopesResponse;
import org.onvif.ver10.device.wsdl.GetServices;
import org.onvif.ver10.device.wsdl.GetServicesResponse;
import org.onvif.ver10.device.wsdl.GetSystemDateAndTime;
import org.onvif.ver10.device.wsdl.GetSystemDateAndTimeResponse;
import org.onvif.ver10.device.wsdl.GetUsers;
import org.onvif.ver10.device.wsdl.GetUsersResponse;
import org.onvif.ver10.device.wsdl.Service;
import org.onvif.ver10.device.wsdl.SetHostname;
import org.onvif.ver10.device.wsdl.SetHostnameResponse;
import org.onvif.ver10.device.wsdl.SystemReboot;
import org.onvif.ver10.device.wsdl.SystemRebootResponse;
import org.onvif.ver10.media.wsdl.CreateProfile;
import org.onvif.ver10.media.wsdl.CreateProfileResponse;
import org.onvif.ver10.media.wsdl.GetProfile;
import org.onvif.ver10.media.wsdl.GetProfileResponse;
import org.onvif.ver10.media.wsdl.GetProfiles;
import org.onvif.ver10.media.wsdl.GetProfilesResponse;
import org.onvif.ver10.schema.Capabilities;
import org.onvif.ver10.schema.Date;
import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.Scope;
import org.onvif.ver10.schema.Time;
import org.onvif.ver10.schema.User;

import de.onvif.soap.OnvifDevice;
import de.onvif.soap.SOAP;
import de.onvif.soap.exception.SOAPFaultException;
import java.util.Optional;
import java.util.logging.Level;
import de.onvif.de.onvif.traits.SoapUser;

/**
 *
 *
 */
@SuppressWarnings("javadoc")
public class InitialDevice
        implements LoggerInterface, SoapUser
{
    private Throwable lastException = null;
	private final SOAP soap;
	private final OnvifDevice onvifDevice;

    /**
     *
     * @param onvifDevice -
     */
    public InitialDevice(OnvifDevice onvifDevice) {
		this.onvifDevice = onvifDevice;
		this.soap = onvifDevice.getSoap();

	}

    /**
     *
     * @return -
     */
    public java.util.Date getDate() {
		Calendar cal;

		GetSystemDateAndTimeResponse response = new GetSystemDateAndTimeResponse();

		try {
            resetLastException();
            response = (GetSystemDateAndTimeResponse) soap.createSOAPDeviceRequest(new GetSystemDateAndTime(), response, false);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getDate.",e);
			return null;
		}

		Date date = response.getSystemDateAndTime().getUTCDateTime().getDate();
		Time time = response.getSystemDateAndTime().getUTCDateTime().getTime();
		cal = new GregorianCalendar(date.getYear(), date.getMonth() - 1, date.getDay(), time.getHour(), time.getMinute(), time.getSecond());

		return cal.getTime();
	}

    /**
     *
     * @return -
     */
    public Optional<GetDeviceInformationResponse> getDeviceInformation() {

        boolean hasError = false;
		GetDeviceInformation getDeviceInfo = new GetDeviceInformation();
		GetDeviceInformationResponse response = new GetDeviceInformationResponse();
		try {
            resetLastException();
			response = (GetDeviceInformationResponse) soap.createSOAPDeviceRequest(getDeviceInfo, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {

/*
            Throwable cause = e.getCause();
            boolean unAuthorized = false;
            Matcher matcher;
            String message;

            // check if the response is unauthorized.
            do {
                if (null!=cause) {
                    message = cause.getMessage();
                    matcher = UNAUTHORIZED_REGEX.matcher(message);
                    if (matcher.find()) {
                        unAuthorized = true;
                        // maybe put a break here?
                    }
                    cause = cause.getCause();
                }
            } while (null != cause && !unAuthorized);

            // check for the hostname.
            if (unAuthorized) {
                Optional<GetHostnameResponse> result = getHostnameResponse();
            } else {
                LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getDeviceInformation.",e);
                hasError = true;
            }
*/
            setLastException(e);
            hasError = true;
		}

             Optional<GetDeviceInformationResponse> result = Optional.ofNullable(((hasError)? null:response));

		return result;
	}

    protected Optional<GetHostnameResponse> getHostnameResponse() {
        boolean hasError = false;
        GetHostname getHostname = new GetHostname();
        GetHostnameResponse response = new GetHostnameResponse();

        try {
            resetLastException();
			response = (GetHostnameResponse) soap.createSOAPDeviceRequest(getHostname, response, true);
        } catch (SOAPException | ConnectException | SOAPFaultException e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getDate.",e);
            hasError = true;
        }

        Optional<GetHostnameResponse> result = Optional.ofNullable( ((hasError)? null:response) );

        return result;
    }

    public Optional<String> getHostname() {
        return getHostname(true);
    }

    /**
     *
     * @param useAuthentication -
     * @return -
     */
    public Optional<String> getHostname(boolean useAuthentication) {
        boolean hasError = false;
		GetHostname getHostname = new GetHostname();
		GetHostnameResponse response = new GetHostnameResponse();
		try {
            resetLastException();

			response = (GetHostnameResponse) soap.createSOAPDeviceRequest(getHostname, response, useAuthentication);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getHostname.",e);
            hasError = true;
		}

        Optional<String> result = Optional.ofNullable(( (hasError)? null:response.getHostnameInformation().getName() ));

		return result;
	}

    /**
     *
     * @param hostname -
     * @return -
     */
    public boolean setHostname(String hostname) {
		SetHostname setHostname = new SetHostname();
		setHostname.setName(hostname);
		SetHostnameResponse response = new SetHostnameResponse();
		try {
            resetLastException();
			soap.createSOAPDeviceRequest(setHostname, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.setHostname.",e);
			return false;
		}

		return true;
	}

    /**
     *
     * @return -
     */
    public List<User> getUsers() {
		GetUsers getUsers = new GetUsers();
		GetUsersResponse response = new GetUsersResponse();
		try {
            resetLastException();
			response = (GetUsersResponse) soap.createSOAPDeviceRequest(getUsers, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getUsers.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getUser();
	}

    /**
     *
     * @return -
     * @throws ConnectException
     * @throws SOAPException
     * @throws de.onvif.soap.exception.SOAPFaultException
     */
    public Capabilities getCapabilities()
            throws ConnectException, SOAPException, SOAPFaultException
    {
		GetCapabilities getCapabilities = new GetCapabilities();
		GetCapabilitiesResponse response = new GetCapabilitiesResponse();

		try {
            resetLastException();
			response = (GetCapabilitiesResponse) soap.createSOAPRequest(getCapabilities, response, onvifDevice.getDeviceUri(), false);
		} catch (SOAPException | SOAPFaultException  e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getgetCapabilities.",e);
			throw e;
		}

		if (response == null) {
			return null;
		}

		return response.getCapabilities();
	}

    /**
     *
     * @return -
     */
    public List<Profile> getProfiles() {
		GetProfiles request = new GetProfiles();
		GetProfilesResponse response = new GetProfilesResponse();

		try {
            resetLastException();
			response = (GetProfilesResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getProfiles.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getProfiles();
	}

    /**
     *
     * @param profileToken -
     * @return -
     */
    public Profile getProfile(String profileToken) {
		GetProfile request = new GetProfile();
		GetProfileResponse response = new GetProfileResponse();

		request.setProfileToken(profileToken);

		try {
            resetLastException();
			response = (GetProfileResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getProfile.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getProfile();
	}

    /**
     *
     * @param name -
     * @return -
     */
    public Profile createProfile(String name) {
		CreateProfile request = new CreateProfile();
		CreateProfileResponse response = new CreateProfileResponse();

		request.setName(name);

		try {
            resetLastException();
			response = (CreateProfileResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.createProfile.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getProfile();
	}

    /**
     *
     * @param includeCapability -
     * @return -
     */
    public List<Service> getServices(boolean includeCapability) {
		GetServices request = new GetServices();
		GetServicesResponse response = new GetServicesResponse();

		request.setIncludeCapability(includeCapability);

		try {
            resetLastException();
			response = (GetServicesResponse) soap.createSOAPDeviceRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getServices.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getService();
	}

    /**
     *
     * @return -
     */
    public List<Scope> getScopes() {
		GetScopes request = new GetScopes();
		GetScopesResponse response = new GetScopesResponse();

		try {
            resetLastException();
			response = (GetScopesResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            setLastException(e);
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getScope.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

		return response.getScopes();
	}

    /**
     *
     * @return -
     * @throws ConnectException
     * @throws SOAPException
     * @throws de.onvif.soap.exception.SOAPFaultException
     */
    public String reboot()
            throws ConnectException, SOAPException, SOAPFaultException
    {
		SystemReboot request = new SystemReboot();
		SystemRebootResponse response = new SystemRebootResponse();

		try {
            resetLastException();
			response = (SystemRebootResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			throw e;
		}

		if (response == null) {
			return null;
		}

		return response.getMessage();
	}

    @Override
    public SOAP getSoap() {
        return soap;
    }

    public Throwable getLastException() {
        Throwable err = this.lastException;
        resetLastException();
        return err;
    }

    protected void setLastException(Throwable e) {
        this.lastException = e;
    }

    public boolean hasException() {
        return null!=this.lastException;
    }

    protected void resetLastException() {
        this.lastException = null;
    }
}
