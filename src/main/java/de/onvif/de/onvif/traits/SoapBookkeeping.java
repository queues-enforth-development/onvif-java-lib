/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.de.onvif.traits;

import de.onvif.de.onvif.traits.implmentation.SoapLedger;
import de.onvif.soap.SOAP;
import javax.xml.soap.SOAPMessage;

/**
 *
 * @author jmccay
 */
public interface SoapBookkeeping {

    public static SoapLedger<SOAPMessage> createLedger() {
        return new SoapLedger<>();
    }

    public abstract SoapLedger<SOAPMessage> getLedger();
    public abstract SOAP getSoap();
    public abstract void setLedger(SoapLedger<SOAPMessage> ledger);

    public default SoapLedger<SOAPMessage> recordSoapMessages() {
        SoapLedger<SOAPMessage> ledger = getLedger();
        SOAP soap = getSoap();

        // Store the SOAP call and response
        ledger.addAll(soap.getLedger());
        soap.clearLedger();
        
        return ledger;
    }
}
