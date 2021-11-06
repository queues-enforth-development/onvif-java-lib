package de.onvif.soap.devices;

import de.onvif.LibLogger;
import de.onvif.LoggerInterface;
import de.onvif.de.onvif.traits.SoapBookkeeping;
import de.onvif.de.onvif.traits.implmentation.SoapLedger;
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
import java.util.logging.Level;
import javax.xml.soap.SOAPMessage;

/**
 *
 *
 */
public class InitialDevice 
        implements LoggerInterface, SoapBookkeeping
{
	private final SOAP soap;
	private final OnvifDevice onvifDevice;
    private SoapLedger<SOAPMessage> ledger;


    /**
     *
     * @param onvifDevice
     */
    public InitialDevice(OnvifDevice onvifDevice) {
		this.onvifDevice = onvifDevice;
		this.soap = onvifDevice.getSoap();
        this.ledger = SoapBookkeeping.createLedger();
	}

    /**
     *
     * @return
     */
    public java.util.Date getDate() {
		Calendar cal;

		GetSystemDateAndTimeResponse response = new GetSystemDateAndTimeResponse();

		try {
			response = (GetSystemDateAndTimeResponse) soap.createSOAPDeviceRequest(new GetSystemDateAndTime(), response, false);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getDate.",e);
			return null;
		}

		Date date = response.getSystemDateAndTime().getUTCDateTime().getDate();
		Time time = response.getSystemDateAndTime().getUTCDateTime().getTime();
		cal = new GregorianCalendar(date.getYear(), date.getMonth() - 1, date.getDay(), time.getHour(), time.getMinute(), time.getSecond());

        // Store the SOAP call and response
        recordSoapMessages();

		return cal.getTime();
	}

    /**
     *
     * @return
     */
    public GetDeviceInformationResponse getDeviceInformation() {
		GetDeviceInformation getHostname = new GetDeviceInformation();
		GetDeviceInformationResponse response = new GetDeviceInformationResponse();
		try {
			response = (GetDeviceInformationResponse) soap.createSOAPDeviceRequest(getHostname, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getDeviceInformation.",e);
			return null;
		}

        // Store the SOAP call and response
        recordSoapMessages();

		return response;
	}

    /**
     *
     * @return
     */
    public String getHostname() {
		GetHostname getHostname = new GetHostname();
		GetHostnameResponse response = new GetHostnameResponse();
		try {
			response = (GetHostnameResponse) soap.createSOAPDeviceRequest(getHostname, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getHostname.",e);
			return null;
		}

        // Store the SOAP call and response
        recordSoapMessages();

		return response.getHostnameInformation().getName();
	}

    /**
     *
     * @param hostname
     * @return
     */
    public boolean setHostname(String hostname) {
		SetHostname setHostname = new SetHostname();
		setHostname.setName(hostname);
		SetHostnameResponse response = new SetHostnameResponse();
		try {
			soap.createSOAPDeviceRequest(setHostname, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.setHostname.",e);
			return false;
		}

        // Store the SOAP call and response
        recordSoapMessages();

		return true;
	}

    /**
     *
     * @return
     */
    public List<User> getUsers() {
		GetUsers getUsers = new GetUsers();
		GetUsersResponse response = new GetUsersResponse();
		try {
			response = (GetUsersResponse) soap.createSOAPDeviceRequest(getUsers, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getUsers.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

        // Store the SOAP call and response
        recordSoapMessages();

		return response.getUser();
	}

    /**
     *
     * @return
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
			response = (GetCapabilitiesResponse) soap.createSOAPRequest(getCapabilities, response, onvifDevice.getDeviceUri(), false);
		} catch (SOAPException | SOAPFaultException  e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getgetCapabilities.",e);
			throw e;
		}

		if (response == null) {
			return null;
		}

        // Store the SOAP call and response
        recordSoapMessages();

		return response.getCapabilities();
	}

    /**
     *
     * @return
     */
    public List<Profile> getProfiles() {
		GetProfiles request = new GetProfiles();
		GetProfilesResponse response = new GetProfilesResponse();

		try {
			response = (GetProfilesResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getProfiles.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

        // Store the SOAP call and response
        recordSoapMessages();

		return response.getProfiles();
	}

    /**
     *
     * @param profileToken
     * @return
     */
    public Profile getProfile(String profileToken) {
		GetProfile request = new GetProfile();
		GetProfileResponse response = new GetProfileResponse();

		request.setProfileToken(profileToken);

		try {
			response = (GetProfileResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getProfile.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

        // Store the SOAP call and response
        recordSoapMessages();

		return response.getProfile();
	}

    /**
     *
     * @param name
     * @return
     */
    public Profile createProfile(String name) {
		CreateProfile request = new CreateProfile();
		CreateProfileResponse response = new CreateProfileResponse();

		request.setName(name);

		try {
			response = (CreateProfileResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.createProfile.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

        // Store the SOAP call and response
        recordSoapMessages();

		return response.getProfile();
	}

    /**
     *
     * @param includeCapability
     * @return
     */
    public List<Service> getServices(boolean includeCapability) {
		GetServices request = new GetServices();
		GetServicesResponse response = new GetServicesResponse();

		request.setIncludeCapability(includeCapability);

		try {
			response = (GetServicesResponse) soap.createSOAPDeviceRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getServices.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

        // Store the SOAP call and response
        recordSoapMessages();

		return response.getService();
	}

    /**
     *
     * @return
     */
    public List<Scope> getScopes() {
		GetScopes request = new GetScopes();
		GetScopesResponse response = new GetScopesResponse();

		try {
			response = (GetScopesResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
            LibLogger.LOGGER.log(Level.WARNING,"An error occurred in InitialDevices.getScope.",e);
			return null;
		}

		if (response == null) {
			return null;
		}

        // Store the SOAP call and response
        recordSoapMessages();

		return response.getScopes();
	}

    /**
     *
     * @return
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
			response = (SystemRebootResponse) soap.createSOAPMediaRequest(request, response, true);
		} catch (SOAPException | ConnectException | SOAPFaultException e) {
			throw e;
		}

		if (response == null) {
			return null;
		}
        
        // Store the SOAP call and response
        recordSoapMessages();

		return response.getMessage();
	}

    @Override
    public SoapLedger<SOAPMessage> getLedger() {
        return ledger;
    }

    @Override
    public SOAP getSoap() {
        return soap;
    }

    @Override
    public void setLedger(SoapLedger<SOAPMessage> ledger) {
        this.ledger = ledger;
    }
}
