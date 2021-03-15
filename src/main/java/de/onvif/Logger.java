/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

/**
 *    This provides a basic framework for logging an error in a standard way that is easy to add since we don't know what
 * each line of code does yet.
 * @author jmccay
 */
public interface Logger {
    
    static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Logger.class.getPackage().getName());
    
    default public void logError(Throwable e) {
        StackTraceElement loc = e.getStackTrace()[0];
        LOGGER.log(java.util.logging.Level.WARNING,String.format("An error occurred in %s.%s", loc.getClassName(), loc.getMethodName()),e);
    }
    
    default public void logSoapMessage(SOAPMessage soapMessage, String message) {
        try {
            LOGGER.log(Level.INFO, String.format("Request SOAP Message (%s): ", message.getClass().getSimpleName()));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.reset();
            soapMessage.writeTo(baos);
            LOGGER.log(Level.INFO, baos.toString("ISO-8859-1"));
            baos.flush();
        } catch (SOAPException | IOException e) {
            LOGGER.log(Level.WARNING, "An exception occurred", e);
        }
    }
}
