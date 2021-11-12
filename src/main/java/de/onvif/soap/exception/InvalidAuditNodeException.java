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
public class InvalidAuditNodeException extends Throwable
{

    public InvalidAuditNodeException() {
    }

    public InvalidAuditNodeException(String string) {
        super(string);
    }

    public InvalidAuditNodeException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public InvalidAuditNodeException(Throwable thrwbl) {
        super(thrwbl);
    }

    public InvalidAuditNodeException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
