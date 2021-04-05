/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.Instant;
import java.util.logging.Level;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 *    This provides a basic framework for logging an error in a standard way that is easy to add since we don't know what
 * each line of code does yet.
 * @author jmccay
 */
public class LibLogger {
    private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
    private Transformer prettyPrint = null;
    private static final String OUTPUT_LOCATION = "C:\\github\\onvif\\research\\snc-wr630\\soap";
    String writeOutputLocation = OUTPUT_LOCATION;
    
    public static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(LibLogger.class.getPackage().getName());
    
    public LibLogger() {
        try {
            prettyPrint = TransformerFactory.newInstance().newTransformer();
        } catch (TransformerConfigurationException | TransformerFactoryConfigurationError e) {
            // Just report the error but don't throw it further because it is just the pretty printer class.
            LOGGER.log(Level.WARNING, "An error occurred while trying to create the XML pretty printer class.", e);
        }
        prettyPrint.setOutputProperty(OutputKeys.INDENT , "yes");
        prettyPrint.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
    }    
    
    public void logError(Throwable e) {
        StackTraceElement loc = e.getStackTrace()[0];
        LOGGER.log(java.util.logging.Level.WARNING,String.format("An error occurred in %s.%s", loc.getClassName(), loc.getMethodName()),e);
        LOGGER.log(java.util.logging.Level.WARNING, e.toString());
        LOGGER.log(java.util.logging.Level.WARNING, e.getMessage());
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        LOGGER.log(java.util.logging.Level.WARNING, sw.toString());
    }
    
    public void logError(String message, Throwable e) {
        LOGGER.log(Level.WARNING, message);
        logError(e);
    }
    
    public void logSoapMessage(SOAPMessage soapMessage, String message) {
        String temp = String.format("Request SOAP Message (%s):\r\n", soapMessage.getClass().getCanonicalName());
        System.out.println(temp);
        LOGGER.log(Level.INFO, temp);
        temp = getStringFromSoapMessage(soapMessage);
        LOGGER.log(Level.INFO, temp);
        System.out.println(temp);
    }
    
    /**
     *    This method will write the SOAP message to the location provided by the value in filePath.  The file name will be taken from 
     * the first node in the SOAP body.  Existing files are deleted.
     * @param filePath The file location where to write the soap message.
     * @param soapMessage The soap message to write to the location provided.
     */
    public void logSoapMessage2File(String filePath, SOAPMessage soapMessage) {
        StringBuilder sb = new StringBuilder();
        File file;
        try {
//            Transformer prettyPrint = TransformerFactory.newInstance().newTransformer();
//            prettyPrint.setOutputProperty(OutputKeys.INDENT , "yes");
//            prettyPrint.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            
            sb.append(filePath.replace("\\", "/"));
            if ('/' != filePath.charAt(filePath.length() - 1)) {
                sb.append('/');
            }
            sb.append(soapMessage.getSOAPBody().getChildNodes().item(0).getLocalName());
            // make sure we get all the responses.
            Instant instant = Instant.now();
            sb.append("-").append(instant.toEpochMilli());
            sb.append(".xml");
            
            file = new File(sb.toString());
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();

            StreamResult result = new StreamResult(new FileWriter(file));

            prettyPrint.transform(new DOMSource(soapMessage.getSOAPPart()), result);
            
        } catch (SOAPException | IOException | TransformerConfigurationException e) {
            logError(e);
        } catch (TransformerException e) {
            logError(e);
        }       
    }
    
    /**
     *    This method will write the SOAP fault message to the location provided by the value in filePath.  The file name 
     * will be taken from the first node in the SOAP body and the name passed in to allow grouping of fault.  Existing 
     * files are deleted.
     * @param filePath The file location where to write the soap message.
     * @param soapMessageResponse The soap message to write to the location provided.
     * @param soapMessage The message that caused the problem.
     */
    public void logSoapFaultMessage(String filePath, SOAPMessage soapMessageResponse, SOAPMessage soapMessage) {
        StringBuilder sb = new StringBuilder();
        File file;
        try {
            sb.append(filePath.replace("\\", "/"));
            if ('/' != filePath.charAt(filePath.length() - 1)) {
                sb.append('/');
            }
            sb.append(soapMessage.getSOAPBody().getChildNodes().item(0).getLocalName());
            sb.append("-");
            sb.append(soapMessageResponse.getSOAPBody().getChildNodes().item(0).getLocalName());
            sb.append(".xml");
            
            file = new File(sb.toString());
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            
            transformXmlSoap2PrettyPtrintedString(file, soapMessageResponse);
        } catch (SOAPException | IOException | TransformerConfigurationException e) {
            logError(e);
        } catch (TransformerException e) {
            logError(e);
        }       
    }
    
    private String getStringFromSoapMessage(SOAPMessage soapMessage) {
        String temp;
        try {
            baos.reset();
            soapMessage.writeTo(baos);
            baos.flush();
            temp = baos.toString("ISO-8859-1");
        } catch (SOAPException | IOException e) {
            StackTraceElement loc = e.getStackTrace()[0];
            LOGGER.log(java.util.logging.Level.WARNING,String.format("An error occurred in %s.%s", loc.getClassName(), loc.getMethodName()),e);
            temp = "";
        }
        return temp;
    }
    
    private void transformXmlSoap2PrettyPtrintedString(File file, SOAPMessage soapMessage) 
            throws IOException, TransformerException 
    {
        StreamResult result = new StreamResult(new FileWriter(file));

        prettyPrint.transform(new DOMSource(soapMessage.getSOAPPart()), result);

        result.toString();
    }
}
