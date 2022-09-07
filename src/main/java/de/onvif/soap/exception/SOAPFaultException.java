/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.soap.exception;

import javax.xml.soap.SOAPMessage;

/**
 * This is an exception class to pass the SOAPMessage fault object to the caller.
 * @author jmccay
 */
public class SOAPFaultException extends Throwable {
    private SOAPMessage fault;

    // Insure there is always a fault
    private SOAPFaultException() {}

    /**
     * Constructor for the object. 
     * @param message The message to pass
     * @param fault the SOAPMessage object containing the fault information
     * @param exception the exception that occurred.
     */
    public SOAPFaultException(SOAPMessage fault, String message, Throwable exception) {
        super(message, exception);
        this.fault = fault;
    }

    /**
     * Constructor for the object. 
     * @param message The message to pass
     * @param fault the SOAPMessage object containing the fault information
     */
    public SOAPFaultException(SOAPMessage fault, String message) {
        super(message);
        this.fault = fault;
    }

    public SOAPMessage getFault() {
        return fault;
    }
}
