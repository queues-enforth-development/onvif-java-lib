//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
   <complexType>
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="RebootNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "rebootNeeded" })
@XmlRootElement(name = "SetHostnameFromDHCPResponse")
public class SetHostnameFromDHCPResponse {

    /**
     *
     */
    @XmlElement(name = "RebootNeeded")
	protected boolean rebootNeeded;

	/**
	 * Ruft den Wert der rebootNeeded-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isRebootNeeded() {
		return rebootNeeded;
	}

	/**
	 * Legt den Wert der rebootNeeded-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setRebootNeeded(boolean value) {
		this.rebootNeeded = value;
	}

}
