package de.onvif.soap;

import de.onvif.de.onvif.traits.implmentation.SoapLedger;
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
import java.util.logging.Level;
import javax.xml.soap.SOAPMessage;

/**
 * 
 * @author Robin Dick
 * 
 */
public class OnvifDevice {
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
    
    private SoapLedger<SOAPMessage> ledger;


    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(OnvifDevice.class.getPackage().getName());

	/**
	 * Initializes an ONVIF device, e.g.a Network Video Transmitter (NVT) with logindata.
	 * 
     * @param hostIp
     * @param user
     * @param password
	 * @throws ConnectException
	 *             Exception gets thrown, if device isn't accessible or invalid
	 *             and doesn't answer to SOAP messages
	 * @throws SOAPException 
     * @throws de.onvif.soap.exception.SOAPFaultException 
	 */
	public OnvifDevice(String hostIp, String user, String password) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		this.HOST_IP = hostIp;

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
        
        this.ledger = new SoapLedger<>();
		
		init();
	}

	/**
	 * Initializes an ONVIF device, e.g.a Network Video Transmitter (NVT) with logindata.
	 * 
     * @param hostIp
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
     * @param original
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
		return initialDevice.getDeviceInformation().getModel();
	}
	
    /**
     *
     * @return
     */
    public String getHostname() {
		return initialDevice.getHostname();
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
}
