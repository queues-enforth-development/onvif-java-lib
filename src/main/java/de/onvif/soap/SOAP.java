package de.onvif.soap;

import de.onvif.LoggerInterface;
import de.onvif.soap.devices.PtzDevices;
import de.onvif.soap.exception.SOAPFaultException;
import java.net.ConnectException;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.w3c.dom.Document;

/**
 *
 *
 */
public class SOAP 
        implements LoggerInterface
{
	private boolean logging = true;

	private final OnvifDevice onvifDevice;
    
    private static final String OUTPUT_LOCATION = "C:\\github\\onvif\\research\\snc-wr630\\soap";
    String writeOutputLocation = OUTPUT_LOCATION;

    /**
     *
     * @param onvifDevice

     */
    public SOAP(OnvifDevice onvifDevice) {
		this.onvifDevice = onvifDevice;
	}

    /**
     *
     * @param soapRequestElem
     * @param soapResponseElem
     * @param needsAuthentification
     * @return
     * @throws SOAPException
     * @throws ConnectException
     * @throws de.onvif.soap.exception.SOAPFaultException
     */
    public Object createSOAPDeviceRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification) 
            throws SOAPException, ConnectException, SOAPFaultException 
    {
		return createSOAPRequest(soapRequestElem, soapResponseElem, onvifDevice.getDeviceUri(), needsAuthentification);
	}

    /**
     *
     * @param soapRequestElem
     * @param soapResponseElem
     * @param needsAuthentification
     * @return
     * @throws SOAPException
     * @throws ConnectException
     * @throws de.onvif.soap.exception.SOAPFaultException
     */
    public Object createSOAPPtzRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification) 
            throws SOAPException, ConnectException, SOAPFaultException 
    {
		return createSOAPRequest(soapRequestElem, soapResponseElem, onvifDevice.getPtzUri(), needsAuthentification);
	}

    /**
     *
     * @param soapRequestElem
     * @param soapResponseElem
     * @param needsAuthentification
     * @return
     * @throws SOAPException
     * @throws ConnectException
     * @throws de.onvif.soap.exception.SOAPFaultException
     */
    public Object createSOAPMediaRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification) 
            throws SOAPException, ConnectException, SOAPFaultException 
    {
		return createSOAPRequest(soapRequestElem, soapResponseElem, onvifDevice.getMediaUri(), needsAuthentification);
	}

    /**
     *
     * @param soapRequestElem
     * @param soapResponseElem
     * @param needsAuthentification
     * @return
     * @throws SOAPException
     * @throws ConnectException
     * @throws de.onvif.soap.exception.SOAPFaultException
     */
    public Object createSOAPImagingRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification) throws SOAPException,
			ConnectException,
			SOAPFaultException {
		return createSOAPRequest(soapRequestElem, soapResponseElem, onvifDevice.getImagingUri(), needsAuthentification);
	}

    /**
     *
     * @param soapRequestElem
     * @param soapResponseElem
     * @param needsAuthentification
     * @return
     * @throws SOAPException
     * @throws ConnectException
     * @throws de.onvif.soap.exception.SOAPFaultException
     */
    public Object createSOAPEventsRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification) throws SOAPException,
			ConnectException, SOAPFaultException 
    {
		return createSOAPRequest(soapRequestElem, soapResponseElem, onvifDevice.getEventsUri(), needsAuthentification);
	}

	/**
	 * 
     * @param soapRequestElem
	 * @param soapResponseElem
	 *            Answer object for SOAP request
     * @param soapUri
     * @param needsAuthentification
	 * @return SOAP Response Element
	 * @throws SOAPException
	 * @throws ConnectException
     * @throws de.onvif.soap.exception.SOAPFaultException
	 */
	public Object createSOAPRequest(Object soapRequestElem, Object soapResponseElem, String soapUri, boolean needsAuthentification) 
            throws ConnectException, SOAPException, SOAPFaultException 
    {
		SOAPConnection soapConnection = null;
		SOAPMessage soapResponse = null;

		try {
			// Create SOAP Connection
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
			soapConnection = soapConnectionFactory.createConnection();

			SOAPMessage soapMessage = createSoapMessage(soapRequestElem, needsAuthentification);

			// Print the request message
			if (isLogging()) {
                PtzDevices.logger.logSoapMessage(soapMessage, String.format("Request SOAP Message (%s): ", soapRequestElem.getClass().getSimpleName()));
                PtzDevices.logger.logSoapMessage2File(OUTPUT_LOCATION, soapMessage);
			}

			soapResponse = soapConnection.call(soapMessage, soapUri);

			// print SOAP Response
			if (isLogging()) {
                String name = soapResponse.getSOAPBody().getChildNodes().item(0).getLocalName();
                PtzDevices.logger.logSoapMessage(soapResponse, String.format("Response SOAP Message (%s): ", name));
                if (name.toLowerCase().contains("fault")) {
                    PtzDevices.logger.logSoapFaultMessage(OUTPUT_LOCATION, soapResponse, soapMessage);
                } else {
                    PtzDevices.logger.logSoapMessage2File(OUTPUT_LOCATION, soapResponse);
                }
			}

			if (soapResponseElem == null) {
				throw new NullPointerException("Improper SOAP Response Element given (is null).");
			}
            
            if (soapResponse.getSOAPBody().hasFault()) {
                throw new SOAPFaultException(soapResponse, "An error occurred with the SOAP call.");
            } else {

                Unmarshaller unmarshaller = JAXBContext.newInstance(soapResponseElem.getClass()).createUnmarshaller();
                try {
                    try {
                        soapResponseElem = unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
                    } catch (SOAPException e) {
                        // Second try for SOAP 1.2
                        // Sorry, I don't know why it works, it just does o.o
                        soapResponseElem = unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
                    }
                } catch (UnmarshalException e) {
                    // Fault soapFault = (Fault)
                    // unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
                    onvifDevice.getLogger().log(Level.WARNING, "Could not unmarshal, ended in SOAP fault.", e);
                    // throw new SOAPFaultException(soapFault);
                }
            }

			return soapResponseElem;
		} catch (SOAPException e) {
			onvifDevice.getLogger().log(Level.WARNING,
					String.format("Unexpected response. Response should be from class %s, but response is: %s", soapResponseElem.getClass(), soapResponse));
			throw e;
		} catch (ParserConfigurationException | JAXBException  e) {
			onvifDevice.getLogger().log(Level.WARNING, String.format("Unhandled exception: %s", e.getMessage()), e);
			return null;
		}
		finally {
			try {
                if (null!=soapConnection)
                    soapConnection.close();
			} catch (SOAPException e) {
                onvifDevice.getLogger().log(Level.WARNING, "Error occurred while closing connection", e);
			}
		}
	}

    /**
     *
     * @param soapRequestElem
     * @param needAuthentification
     * @return
     * @throws SOAPException
     * @throws ParserConfigurationException
     * @throws JAXBException
     */
    protected SOAPMessage createSoapMessage(Object soapRequestElem, boolean needAuthentification) throws SOAPException, ParserConfigurationException,
			JAXBException {
		MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
		SOAPMessage soapMessage = messageFactory.createMessage();

		Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		Marshaller marshaller = JAXBContext.newInstance(soapRequestElem.getClass()).createMarshaller();
		marshaller.marshal(soapRequestElem, document);
		soapMessage.getSOAPBody().addDocument(document);

		// if (needAuthentification)
		createSoapHeader(soapMessage);

		soapMessage.saveChanges();
		return soapMessage;
	}

    /**
     *
     * @param soapMessage
     * @throws SOAPException
     */
    protected void createSoapHeader(SOAPMessage soapMessage) throws SOAPException {
		onvifDevice.createNonce();
		String encrypedPassword = onvifDevice.getEncryptedPassword();
		if (encrypedPassword != null && onvifDevice.getUsername() != null) {

			SOAPPart sp = soapMessage.getSOAPPart();
			SOAPEnvelope se = sp.getEnvelope();
			SOAPHeader header = soapMessage.getSOAPHeader();
			se.addNamespaceDeclaration("wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
			se.addNamespaceDeclaration("wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

			SOAPElement securityElem = header.addChildElement("Security", "wsse");
			// securityElem.setAttribute("SOAP-ENV:mustUnderstand", "1");

			SOAPElement usernameTokenElem = securityElem.addChildElement("UsernameToken", "wsse");

			SOAPElement usernameElem = usernameTokenElem.addChildElement("Username", "wsse");
			usernameElem.setTextContent(onvifDevice.getUsername());

			SOAPElement passwordElem = usernameTokenElem.addChildElement("Password", "wsse");
			passwordElem.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
			passwordElem.setTextContent(encrypedPassword);

			SOAPElement nonceElem = usernameTokenElem.addChildElement("Nonce", "wsse");
			nonceElem.setAttribute("EncodingType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
			nonceElem.setTextContent(onvifDevice.getEncryptedNonce());

			SOAPElement createdElem = usernameTokenElem.addChildElement("Created", "wsu");
			createdElem.setTextContent(onvifDevice.getLastUTCTime());
		}
	}

    /**
     * Are we logging?
     * @return
     */
    public boolean isLogging() {
		return logging;
	}

    /**
     * Turn logging on and off;
     * @param logging
     */
    public void setLogging(boolean logging) {
		this.logging = logging;
	}

    /**
     * Get the location to write the output.
     * @return 
     */
    public String getWriteOutputLocation() {
        return writeOutputLocation;
    }

    /**
     * Set the output file location for writing the XML SOAP message to a hard disk.
     * @param writeOutputLocation The location in which the XML output will be written.
     */
    public void setWriteOutputLocation(String writeOutputLocation) {
        this.writeOutputLocation = writeOutputLocation;
    }
}
