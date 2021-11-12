/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.de.onvif.traits.implmentation;

import de.onvif.de.onvif.traits.AuditorNodeImpl;
import de.onvif.de.onvif.traits.Loggable;
import de.onvif.soap.exception.InvalidLedgerStateException;
import java.io.Writer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Logger;
import javax.xml.soap.SOAPMessage;

/**
 *    This is a simple class to store Messages and their Responses together.  It needs to write the 
 * message and them the Response afterwards since the messages don't have ids that I can't tell.
 * @author jmccay
 * @param <E>
 */
public class SoapLedger<E extends SOAPMessage> 
        extends LinkedList< AuditorNodeImpl<E> > 
        implements Loggable
{
    private static final Logger LOGGER = Logger.getLogger(SoapLedger.class.getPackage().getName());
//    private final SoapLedger<E> storage = new SoapLedger<>();
    private Writer writer;
    
    private boolean expectMessage = true;

    public SoapLedger() {
        writer = null;
    }

    public SoapLedger(Collection<? extends AuditorNodeImpl<E>> clctn) {
        super(clctn);
        writer = null;
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
    
    public void addMessage(E message) 
            throws InvalidLedgerStateException
    {
        if (!expectMessage) {
            throw new InvalidLedgerStateException("Error: expecting a response not a Message");
        }
  
        AuditorNodeImpl<E> temp = new AuditorNodeImpl();
        temp.setMessage(message);
        expectMessage = false;
        this.addLast(temp);
    }

    public void addResponse(E response) 
        throws InvalidLedgerStateException    
    {
        if (expectMessage) {
            throw new InvalidLedgerStateException("Error: expecting a message not a response.");
        }
        
        AuditorNodeImpl<E> temp = this.getLast();
        temp.setResponse(response);
        expectMessage = true;
        this.addLast(temp);
    }
    
    
}
