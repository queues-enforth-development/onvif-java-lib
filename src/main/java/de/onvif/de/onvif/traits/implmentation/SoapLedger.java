/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.de.onvif.traits.implmentation;

import de.onvif.de.onvif.traits.Auditor;
import de.onvif.de.onvif.traits.AuditorNode;
import de.onvif.de.onvif.traits.Loggable;
import de.onvif.soap.exception.InvalidLedgerState;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.LinkedList;
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
 *    This is a simple class to store Messages and their Responses together.  It needs to write the 
 * message and them the Response afterwards since the messages don't have ids that I can't tell.
 * @author jmccay
 * @param <E>
 */
public class SoapLedger<E extends SOAPMessage> 
        extends LinkedList< AuditorNode<E> > 
        implements Auditor<E>, Loggable
{
    private static final Logger LOGGER = Logger.getLogger(SoapLedger.class.getPackage().getName());
//    private final SoapLedger<E> storage = new SoapLedger<>();
    private Transformer prettyPrint = null;
    private Writer writer;
    
    private boolean expectMessage = true;

    public SoapLedger() {
        initializePrettyPrint();
        writer = null;
    }

    public SoapLedger(Collection<? extends AuditorNode<E>> clctn) {
        super(clctn);
        initializePrettyPrint();
        writer = null;
    }
    
    private Transformer initializePrettyPrint() {
        try {
            prettyPrint = TransformerFactory.newInstance().newTransformer();
        } catch (TransformerConfigurationException ex) {
            LOGGER.log(Level.WARNING, "Error: unable to create SOAP Message formatter!", ex);
        }
        return prettyPrint;
    }
    
    @Override
    public SoapLedger<E> getStorage() {
        return this;
    }

    @Override
    public Logger getLogger() {
        return LOGGER;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
    
    protected String formatToString(E soapmessage) {
        if (null==writer) {
            writer = new StringWriter();
        }
        
        Result result = new StreamResult(writer);
        try {
            SOAPPart soapPart = soapmessage.getSOAPPart();
            prettyPrint.transform(soapPart.getContent(), result);
        } catch (SOAPException | TransformerException ex) {
            LOGGER.log(Level.WARNING, "Error: An error occurred while trying to format the SOAPMessage.", ex);
        }
        return result.toString();
    }

    @Override
    public String getFirstMessageAsString() {
        return formatToString(get(0).getMessage());
    }

    @Override
    public String getMessageAtAsString(int index) {
        return formatToString(get(index).getMessage());
    }

    @Override
    public String getLastMessageAsString() {
        return formatToString(getLastMessage());
    }

    @Override
    public String getFirstResponseAsString() {
        return formatToString(get(0).getResponse());
    }

    @Override
    public String getResponseAtAsString(int index) {
        return formatToString(get(index).getResponse());
    }

    @Override
    public String getLastResponseAsString() {
        return formatToString(getLastResponse());
    }

    @Override
    public void addMessage(E message) 
            throws InvalidLedgerState
    {
        if (!expectMessage) {
            throw new InvalidLedgerState("Error: expecting a response not a Message");
        }
  
        AuditorNode<E> temp = new AuditorNode();
        temp.setMessage(message);
        expectMessage = false;
        this.addLast(temp);
    }

    @Override
    public void addResponse(E response) 
        throws InvalidLedgerState    
    {
        if (expectMessage) {
            throw new InvalidLedgerState("Error: expecting a message not a response.");
        }
        
        AuditorNode<E> temp = this.getLast();
        temp.setResponse(response);
        expectMessage = true;
        this.addLast(temp);
    }
    
    
}
