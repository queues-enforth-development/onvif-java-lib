/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.de.onvif.traits;

import de.onvif.soap.exception.InvalidAuditNodeException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

/**
 * Store a Message and Response pair of SOAP messages
 * @author jmccay
 * @param <T> -
 */
public class AuditorNodeImpl<T extends SOAPMessage> 
        implements AuditorNode<T> 
{
    private static final Logger LOGGER = Logger.getLogger(AuditorNodeImpl.class.getPackage().getName());

    private LocalDateTime timeStampMessage;
    private LocalDateTime timeStampResponse;
    private T message;
    private T response;
    private Transformer prettyPrint = null;

    public AuditorNodeImpl() {
        initializePrettyPrint();
    }

    public AuditorNodeImpl(T message) {
        initializePrettyPrint();
        setMessageImpl(message);
    }

    public AuditorNodeImpl(T message, T response) {
        initializePrettyPrint();
        setMessageImpl(message);
        setResponseImpl(response);
    }

    @Override
    public T getMessage() {
        return message;
    }

    @Override
    public void setMessage(T message) {
        setMessageImpl(message);
    }

    @Override
    public T getResponse() {
        return response;
    }

    @Override
    public void setResponse(T response) {
        setResponseImpl(response);
    }

    public LocalDateTime getTimeStampMessage() {
        return timeStampMessage;
    }

    public LocalDateTime getTimeStampResponse() {
        return timeStampResponse;
    }

    //
    // Implementations for code reuse.
    //

    private void setMessageImpl(T message) {
        timeStampMessage = LocalDateTime.now();
        this.message = message;
    }

    private void setResponseImpl(T response) {
        timeStampResponse = LocalDateTime.now();
        this.response = response;
    }

    @Override
    public String formatMessage(T soapmessage, Writer writer) {
        boolean ownWriter = false;
        if (null==writer) {
            writer = new StringWriter();
            ownWriter = true;
        }

        Result result = new StreamResult(writer);
        try {
            SOAPPart soapPart = soapmessage.getSOAPPart();
            prettyPrint.transform(soapPart.getContent(), result);
            writer.flush();
            if (ownWriter) {
                writer.close();
            }
        } catch (IOException| SOAPException | TransformerException ex) {
            LOGGER.log(Level.WARNING, "Error: An error occurred while trying to format the SOAPMessage.", ex);
        } 
        return result.toString();
    }

    @Override
    public String getMessageAsString() throws InvalidAuditNodeException {
        String result = null;
        try {
            result = formatMessage(message);
        } catch(IOException e) {
            LOGGER.log(Level.WARNING, "Error: An error occurred converting the message to a string!", e);
            throw new InvalidAuditNodeException(e);
        }
        return result;
    }

    @Override
    public String getResponseAsString() throws InvalidAuditNodeException {
        String result = null;
        try {
            result = formatMessage(response);
        } catch(IOException e) {
            LOGGER.log(Level.WARNING, "Error: An error occurred converting the message to a string!", e);
            throw new InvalidAuditNodeException(e);
        }
        return result;
    }

    public String formatMessage(T soapmessage) throws IOException {
        String result;
        try (Writer writer = new StringWriter()) {
            result = formatMessage(soapmessage, writer);
        }
        return result;
    }

    @Override
    public LocalDateTime getMessageTimeStamp() {
        return timeStampMessage;
    }

    @Override
    public LocalDateTime getResponseTimeStamp() {
        return timeStampResponse;
    }

    private Transformer initializePrettyPrint() {
        try {
            prettyPrint = TransformerFactory.newInstance().newTransformer();
        } catch (TransformerConfigurationException ex) {
            LOGGER.log(Level.WARNING, "Error: unable to create SOAP Message formatter!", ex);
        }
        return prettyPrint;
    }

}
