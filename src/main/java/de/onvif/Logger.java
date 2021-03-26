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
import java.util.logging.Level;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 *    This provides a basic framework for logging an error in a standard way that is easy to add since we don't know what
 * each line of code does yet.
 * @author jmccay
 */
public interface Logger {
    final ByteArrayOutputStream baos = new ByteArrayOutputStream();
    
    static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Logger.class.getPackage().getName());
    
    default public void logError(Throwable e) {
        StackTraceElement loc = e.getStackTrace()[0];
        LOGGER.log(java.util.logging.Level.WARNING,String.format("An error occurred in %s.%s", loc.getClassName(), loc.getMethodName()),e);
    }
    
    default public void logSoapMessage(SOAPMessage soapMessage, String message) {
        String temp = String.format("Request SOAP Message (%s):\r\n", soapMessage.getClass().getCanonicalName());
        System.out.println(temp);
        LOGGER.log(Level.INFO, temp);
        temp = utils.getStringFromSoapMessage(soapMessage);
        LOGGER.log(Level.INFO, temp);
        System.out.println(temp);
    }
    
    /**
     *    This method will write the SOAP message to the location provided by the value in filePath.  The file name will be taken from 
     * the first node in the SOAP body.  Existing files are deleted.
     * @param filePath The file location where to write the soap message.
     * @param soapMessage The soap message to write to the location provided.
     */
    default public void logSoapMessage2File(String filePath, SOAPMessage soapMessage) {
        StringBuilder sb = new StringBuilder();
        File file;
        try {
            Transformer prettyPrint = TransformerFactory.newInstance().newTransformer();
            prettyPrint.setOutputProperty(OutputKeys.INDENT , "yes");
            prettyPrint.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            
            sb.append(filePath.replace("\\", "/"));
            if ('/' != filePath.charAt(filePath.length() - 1)) {
                sb.append('/');
            }
            sb.append(soapMessage.getSOAPBody().getChildNodes().item(0).getLocalName());
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
        } catch (TransformerException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
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
    public default void logSoapFaultMessage(String filePath, SOAPMessage soapMessageResponse, SOAPMessage soapMessage) {
        StringBuilder sb = new StringBuilder();
        File file;
        try {
            Transformer prettyPrint = TransformerFactory.newInstance().newTransformer();
            prettyPrint.setOutputProperty(OutputKeys.INDENT , "yes");
            prettyPrint.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            
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

            StreamResult result = new StreamResult(new FileWriter(file));

            prettyPrint.transform(new DOMSource(soapMessageResponse.getSOAPPart()), result);
            
        } catch (SOAPException | IOException | TransformerConfigurationException e) {
            logError(e);
        } catch (TransformerException ex) {
            logError(ex);
        }       
    }
    
    /**
     * This class is strictly a utility.  Java 8 doesn't allow private or protected members in an interface.
     */
    class utils {
        private static String getStringFromSoapMessage(SOAPMessage soapMessage) {
            String temp;
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
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
    }
}
