/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.de.onvif.traits;

import de.onvif.de.onvif.traits.implmentation.SoapLedger;
import de.onvif.soap.exception.InvalidLedgerState;
import javax.xml.soap.SOAPMessage;

/**
 *
 * @author jmccay
 * @param <T>
 */
public interface Auditor<T extends SOAPMessage> 
{
    public SoapLedger<T> getStorage();
    
    public default T getFirstMessage() {
        return getStorage().get(0).getMessage();
    }
    
    public default T getMessageAt(int index) {
        return getStorage().get(index).getMessage();
    }
  
    public default T getLastMessage() {
        SoapLedger<T> list = getStorage();
        return list.get(list.size()).getMessage();
    }
    
    public default T getFirstResponse() {
        return getStorage().get(0).getResponse();
    }
    
    public default T getResponseAt(int index) {
        return getStorage().get(index).getResponse();
    }
  
    public default T getLastResponse() {
        SoapLedger<T> list = getStorage();
        return list.get(list.size()).getResponse();
    }
    
    public abstract String getFirstMessageAsString();
    
    public abstract String getMessageAtAsString(int index);
    
    public abstract String getLastMessageAsString();

    public abstract String getFirstResponseAsString();
    
    public abstract String getResponseAtAsString(int index);
    
    public abstract String getLastResponseAsString();
    
    public abstract void addMessage(T message) throws InvalidLedgerState;
    
    public abstract void addResponse(T response) throws InvalidLedgerState;
    
    
}
