/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.soap;

import de.onvif.soap.exception.SOAPFaultException;
import java.io.IOException;
import java.io.StringWriter;
import java.net.ConnectException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

/**
 *  This is a simple helper to just get the SOAP Message and Response.
 * @author jmccay
 */
public class SoapHelper extends SOAP 
{
    private static final Logger LOGGER = Logger.getLogger(SoapHelper.class.getPackage().getName());
    private static final String MARSHALING_ERROR = "Error: An error occurred while marshaling %s.";
    
    
    protected final OnvifDevice onvifDevice;

    public SoapHelper(OnvifDevice onvifDevice) {
        super(onvifDevice);
        this.onvifDevice = onvifDevice;
    }

    /**
     * THis method gets the soap message object, but no message is ever sent.  This allows the user to find our what will be sent.
     * @param <P> The Object representing the message.  For example, the object GetCapabilities could be used.
     * @param object A specific instance of P.
     * @param needAuthentication Does authentication need to be used?
     * @return SOAPMessage A SOAPMessage object that can be sent.
     * @throws SOAPException
     * @throws JAXBException
     * @throws ParserConfigurationException 
     */
    public <P> SOAPMessage getSoapMessage(P object, boolean needAuthentication) 
            throws SOAPException, JAXBException, ParserConfigurationException 
    {
        return (SOAPMessage)this.createSoapMessage(object, needAuthentication);
    }
        
    /**
     * This class sens out a message by calling createSOAPRequest in the parent object to create a message and get the response.
     * @param <R> The response object from the SOAP request.  For example, GetCapabilitiesResponse would be one example.
     * @param <P> The Object representing the message.  For example, the object GetCapabilities could be used.
     * @param object A specific instance of P.
     * @param response A specific instance of R.
     * @param needAuthentication Does authentication need to be used?
     * @return R The response object filled out.
     * @throws SOAPException
     * @throws JAXBException
     * @throws ParserConfigurationException
     * @throws ConnectException
     * @throws SOAPFaultException 
     */
    public <R, P> R getSoapResponseMessage(P object, R response, boolean needAuthentication)
            throws SOAPException, JAXBException, ParserConfigurationException, ConnectException, SOAPFaultException 
    {
        return (R)this.createSOAPRequest(object, response, onvifDevice.getDeviceUri(), needAuthentication);
    }
    
    /**
     * Marshall an object (like those returned by getSoapResponseMessage and getSoapMessage) to a string 
     * @param <T> The class to marshall
     * @param obj A specific instance of T.
     * @param theClass the Class of T.
     * @return The object marshalled to a string.
     * @throws JAXBException 
     */
    public <T> String marshalObjectToString(T obj, Class<T> theClass) throws JAXBException {
        StringWriter sw;
        String result = null;
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            sw = new StringWriter();
            marshaller.marshal(obj, sw);
            sw.flush();
            result = sw.toString();
            sw.close();
        } catch (JAXBException | IOException e) {
            if (e instanceof JAXBException) {
                try {
                    LOGGER.info("First attempt to marshall the Profile failed.  Now trying to marshall a second time.");
                    JAXBElement<T> element = new JAXBElement<>(new QName(theClass.getCanonicalName(), "profile"), theClass, obj);
                    JAXBContext context = JAXBContext.newInstance(theClass);
                    Marshaller marshaller = context.createMarshaller();
                    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                    sw = new StringWriter();
                    marshaller.marshal(element, sw);
                    sw.flush();
                    result = sw.toString();
                    sw.close();
                } catch (JAXBException | IOException ex) {
                    String temp = String.format(MARSHALING_ERROR, obj.getClass().getCanonicalName());
                    LOGGER.log(Level.WARNING, temp, e);
                    LOGGER.log(Level.WARNING, "Second marshalling attempt failed!", ex);
                    ex.addSuppressed(e);
                    throw new JAXBException(temp, ex);
                } 
            }
            
        }
        return result;
    }
}
