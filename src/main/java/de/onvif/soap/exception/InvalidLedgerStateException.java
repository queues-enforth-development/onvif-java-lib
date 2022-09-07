/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.soap.exception;

/**
 *
 * @author jmccay
 */
public class InvalidLedgerStateException extends Throwable
{

    public InvalidLedgerStateException() {
    }

    public InvalidLedgerStateException(String string) {
        super(string);
    }

    public InvalidLedgerStateException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public InvalidLedgerStateException(Throwable thrwbl) {
        super(thrwbl);
    }

    public InvalidLedgerStateException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
