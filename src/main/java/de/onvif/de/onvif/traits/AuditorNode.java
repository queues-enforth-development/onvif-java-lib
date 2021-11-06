/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.de.onvif.traits;

import java.time.LocalDateTime;

/**
 * Store a Message and Response pair of SOAP messages
 * @author jmccay
 * @param <T>
 */
public class AuditorNode<T> 
{
    private LocalDateTime timeStampMessage;
    private LocalDateTime timeStampResponse;
    private T message;
    private T response;
    
    public AuditorNode() {
    }
   
    public AuditorNode(T message) {
        setMessageImpl(message);
    }
    
    public AuditorNode(T message, T response) {
        setMessageImpl(message);
        setResponseImpl(response);
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        setMessageImpl(message);
    }
    
    public T getResponse() {
        return response;
    }

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
    
}
