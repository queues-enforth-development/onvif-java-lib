package de.onvif.soap;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import javax.xml.soap.SOAPException;

import org.apache.commons.codec.binary.Base64;
import org.onvif.ver10.schema.Capabilities;

import de.onvif.soap.devices.ImagingDevice;
import de.onvif.soap.devices.InitialDevice;
import de.onvif.soap.devices.MediaDevice;
import de.onvif.soap.devices.PtzDevice;
import de.onvif.soap.exception.SOAPFaultException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.onvif.ver10.device.wsdl.GetDeviceInformationResponse;
import de.onvif.de.onvif.traits.SoapUser;

/**
 *
 * @author Robin Dick
 *
 */
public class OnvifDevice
        implements SoapUser
{
	private final String HOST_IP;
	private String originalIp;

	private boolean isProxy;

	private String username;
	private String password;
	private String nonce;
	private String utcTime;

	private String serverDeviceUri;
	private String serverPtzUri;
	private String serverMediaUri;
	private String serverImagingUri;
	private String serverEventsUri;

	private SOAP soap;

	private InitialDevice initialDevice;
	private PtzDevice ptzDevice;
	private MediaDevice mediaDevice;
	private ImagingDevice imagingDevice;

    private static final String UNKNOWN_CAMERA = "Unknown camera model";
    private static final String EMPTY_STRING = "".intern();
    private static final String UNAUTHORIZED = "unauthorized".intern();
    private static final Pattern UNAUTHORIZED_REGEX = Pattern.compile(UNAUTHORIZED, Pattern.CASE_INSENSITIVE);

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(OnvifDevice.class.getPackage().getName());

	/**
	 * Initializes an ONVIF device, e.g.a Network Video Transmitter (NVT) with logindata.
	 *
     * @param hostIp -
     * @param user -
     * @param password -
	 * @throws ConnectException
	 *             Exception gets thrown, if device isn't accessible or invalid
	 *             and doesn't answer to SOAP messages
	 * @throws SOAPException
     * @throws de.onvif.soap.exception.SOAPFaultException
	 */
	public OnvifDevice(String hostIp, String user, String password)
            throws ConnectException, SOAPException, SOAPFaultException
    {
		this.HOST_IP = parseUrl(hostIp);

		if (!isOnline()) {
			throw new ConnectException("Host not available.");
		}

		this.serverDeviceUri = "http://" + HOST_IP + "/onvif/device_service";

		this.username = user;
		this.password = password;

		this.soap = new SOAP(this);
		this.initialDevice = new InitialDevice(this);
		this.ptzDevice = new PtzDevice(this);
		this.mediaDevice = new MediaDevice(this);
		this.imagingDevice = new ImagingDevice(this);

		init();
	}

	/**
	 * Initializes an ONVIF device, e.g.a Network Video Transmitter (NVT) with logindata.
	 *
     * @param hostIp -
	 * @throws ConnectException
	 *             Exception gets thrown, if device isn't accessible or invalid
	 *             and doesn't answer to SOAP messages
	 * @throws SOAPException
     * @throws de.onvif.soap.exception.SOAPFaultException
	 */
	public OnvifDevice(String hostIp)
            throws ConnectException, SOAPException, SOAPFaultException
    {
		this(hostIp, null, null);
	}

	/**
	 * Internal function to check, if device is available and answers to ping
	 * requests.
	 */
	private boolean isOnline() {
		String port = HOST_IP.contains(":") ? HOST_IP.substring(HOST_IP.indexOf(':') + 1) : "80";
		String ip = HOST_IP.contains(":") ? HOST_IP.substring(0, HOST_IP.indexOf(':')) : HOST_IP;

		Socket socket = null;
		try {
			SocketAddress sockaddr = new InetSocketAddress(ip, new Integer(port));
			socket = new Socket();

			socket.connect(sockaddr, 5000);
		} catch (NumberFormatException | IOException e) {
			return false;
		} finally {
			try {
				if (socket != null) {
					socket.close();
				}
			} catch (IOException ex) {
			}
		}
		return true;
	}

	/**
	 * Initializes the addresses used for SOAP messages and to get the internal
	 * IP, if given IP is a proxy.
	 *
	 * @throws ConnectException
	 *             Get thrown if device doesn't give answers to
	 *             GetCapabilities()
	 * @throws SOAPException
     * @throws de.onvif.soap.exception.SOAPFaultException
	 */
	private void init()
            throws ConnectException, SOAPException, SOAPFaultException
    {
		Capabilities capabilities = getDevices().getCapabilities();

		if (capabilities == null) {
			throw new ConnectException("Capabilities not reachable.");
		}

		String localDeviceUri = capabilities.getDevice().getXAddr();

		if (localDeviceUri.startsWith("http://")) {
			originalIp = localDeviceUri.replace("http://", "");
			originalIp = originalIp.substring(0, originalIp.indexOf('/'));
		} else {
			LOGGER.log(Level.WARNING, "Unknown/Not implemented local procotol!");
		}

		if (!originalIp.equals(HOST_IP)) {
			isProxy = true;
		}

		if (capabilities.getMedia() != null && capabilities.getMedia().getXAddr() != null) {
			serverMediaUri = replaceLocalIpWithProxyIp(capabilities.getMedia().getXAddr());
		}

		if (capabilities.getPTZ() != null && capabilities.getPTZ().getXAddr() != null) {
			serverPtzUri = replaceLocalIpWithProxyIp(capabilities.getPTZ().getXAddr());
		}

		if (capabilities.getImaging() != null && capabilities.getImaging().getXAddr() != null) {
			serverImagingUri = replaceLocalIpWithProxyIp(capabilities.getImaging().getXAddr());
		}

		if (capabilities.getMedia() != null && capabilities.getEvents().getXAddr() != null) {
			serverEventsUri = replaceLocalIpWithProxyIp(capabilities.getEvents().getXAddr());
		}
	}

    /**
     *
     * @param original -
     * @return
     */
    public String replaceLocalIpWithProxyIp(String original) {
		if (original.startsWith("http:///")) {
			original = original.replace("http:///", "http://"+HOST_IP);
		}

		if (isProxy) {
			return original.replace(originalIp, HOST_IP);
		}
		return original;
	}

    /**
     *
     * @return
     */
    public String getUsername() {
		return username;
	}

    /**
     *
     * @return
     */
    public String getEncryptedPassword() {
		return encryptPassword();
	}

	/**
	 * Returns encrypted version of given password like algorithm like in WS-UsernameToken
     * @return
	 */
	public String encryptPassword() {
		String nonceLocal = getNonce();
		String timestamp = getUTCTime();

		String beforeEncryption = nonceLocal + timestamp + password;

		byte[] encryptedRaw;
		try {
			encryptedRaw = sha1(beforeEncryption);
		} catch (NoSuchAlgorithmException e) {
            LOGGER.log(Level.WARNING,"The Algorythm was not found!",e);
			return null;
		}
		String encoded = Base64.encodeBase64String(encryptedRaw);
		return encoded;
	}

	private static byte[] sha1(String s) throws NoSuchAlgorithmException {
		MessageDigest SHA1;
		SHA1 = MessageDigest.getInstance("SHA1");

		SHA1.reset();
		SHA1.update(s.getBytes());

		byte[] encryptedRaw = SHA1.digest();
		return encryptedRaw;
	}

	private String getNonce() {
		if (nonce == null) {
			createNonce();
		}
		return nonce;
	}

    /**
     *
     * @return
     */
    public String getEncryptedNonce() {
		if (nonce == null) {
			createNonce();
		}
		return Base64.encodeBase64String(nonce.getBytes());
	}

    /**
     *
     */
    public void createNonce() {
		Random generator = new Random();
		nonce = "" + generator.nextInt();
	}

    /**
     *
     * @return
     */
    public String getLastUTCTime() {
		return utcTime;
	}

    /**
     *
     * @return
     */
    public String getUTCTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d'T'HH:mm:ss'Z'");
		sdf.setTimeZone(new SimpleTimeZone(SimpleTimeZone.UTC_TIME, "UTC"));

		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
		String utcTimeLocal = sdf.format(cal.getTime());
		this.utcTime = utcTimeLocal;
		return utcTimeLocal;
	}

    /**
     *
     * @return
     */
    @Override
    public SOAP getSoap() {
		return soap;
	}

	/**
	 * Is used for basic devices and requests of given ONVIF Device
     * @return
	 */
	public InitialDevice getDevices() {
		return initialDevice;
	}

	/**
	 * Can be used for PTZ controlling requests, may not be supported by device!
     * @return
	 */
	public PtzDevice getPtz() {
		return ptzDevice;
	}

	/**
	 * Can be used to get media data from OnvifDevice
	 * @return
	 */
	public MediaDevice getMedia() {
		return mediaDevice;
	}

	/**
	 * Can be used to get media data from OnvifDevice
	 * @return
	 */
	public ImagingDevice getImaging() {
		return imagingDevice;
	}

    /**
     *
     * @return
     */
    public java.util.logging.Logger getLogger() {
		return LOGGER;
	}

    /**
     *
     * @return
     */
    public String getDeviceUri() {
		return serverDeviceUri;
	}

    /**
     *
     * @return
     */
    protected String getPtzUri() {
		return serverPtzUri;
	}

    /**
     *
     * @return
     */
    protected String getMediaUri() {
		return serverMediaUri;
	}

    /**
     *
     * @return
     */
    protected String getImagingUri() {
		return serverImagingUri;
	}

    /**
     *
     * @return
     */
    protected String getEventsUri() {
		return serverEventsUri;
	}

    /**
     *
     * @return
     */
    public Date getDate() {
		return initialDevice.getDate();
	}

    /**
     *
     * @return
     */
    public String getName() {
        String result = UNKNOWN_CAMERA;
        try {

            Optional<GetDeviceInformationResponse> deviceInfo = initialDevice.getDeviceInformation();
            if (deviceInfo.isPresent()) {
                result = deviceInfo.get().getModel();
            } else {
                // see find the problem and check host name instead
                Throwable e = initialDevice.getLastException();
                if (isUnauthorised(e)) {
                    result = checkHostname();
                }
            }
        } catch (Exception e) {
            System.out.println(String.format("Unknown camera Name response: %s", result));
        }
		return result;
	}

    protected String checkHostname() {
        Optional<String> hostname = initialDevice.getHostname(false);

        return hostname.orElse(UNKNOWN_CAMERA);
    }

    protected boolean isUnauthorised(Throwable e) {
        Throwable cause = e;
        boolean result = false;
        Matcher matcher;
        String message;
        do {
            message = e.getMessage();
            matcher = UNAUTHORIZED_REGEX.matcher(message);
            if (matcher.find()) {
                result = true;
            }
            cause = cause.getCause();
        } while (null!=cause && !result);

        return result;
    }

    /**
     *
     * @return
     */
    public String getHostname() {
        return initialDevice.getHostname().orElse(EMPTY_STRING);
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
		return initialDevice.reboot();
	}

    private String parseUrl(String hostIp) {
        String result = hostIp;

        if (result.toUpperCase().contains("HTTP")) {
            try {
                URL url = new URL(hostIp);
                result = url.getAuthority();
            } catch (MalformedURLException e) {
                LOGGER.log(Level.WARNING, "Error: An error occurred parsing the host IP URL.", e);
                result = hostIp;
            }
        }

        return result;
    }

    /**
     * This method creates a JSON object string containing all the URIs.
     * @return
     */
    public String getUrisAsJsonString() {
        jakarta.json.JsonObject jsonObject = jakarta.json.Json.createObjectBuilder()
                                                .add("device", this.serverDeviceUri)
                                                .add("events", this.serverEventsUri)
                                                .add("image", this.serverImagingUri)
                                                .add("media", this.serverMediaUri)
                                                .add("ptz", this.serverPtzUri)
                                                .build();
        String result = jsonObject.toString();
        return result;
    }
}
