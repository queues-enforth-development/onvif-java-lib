/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.de.onvif.traits;

import de.onvif.soap.exception.InvalidAuditNodeException;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import javax.xml.soap.SOAPMessage;

/**
 *
 * @author jmccay
 * @param <T>
 */
public interface AuditorNode<T extends SOAPMessage> 
{
    public static void writeObject(AuditorNode obj, Writer writer) 
            throws IOException, InvalidAuditNodeException 
    {
        writer.append("Message:");
        writer.append(String.format("%n"));
        writer.append(obj.getMessageAsString());

        writer.append("Response:");
        writer.append(String.format("%n"));
        writer.append(obj.getResponseAsString());
    }

    public abstract String formatMessage(T soapmessage, Writer writer);
    
    public abstract T getMessage() throws InvalidAuditNodeException;
    
    public abstract void setMessage(T message) throws InvalidAuditNodeException;
    
    public abstract T getResponse() throws InvalidAuditNodeException;

    public abstract void setResponse(T response) throws InvalidAuditNodeException;
    
    public abstract LocalDateTime getMessageTimeStamp();

    public abstract LocalDateTime getResponseTimeStamp();
    
    public abstract String getMessageAsString() throws InvalidAuditNodeException;
    
    public abstract String getResponseAsString() throws InvalidAuditNodeException;
}
