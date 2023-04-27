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
import org.onvif.ver10.schema.DynamicDNSInformation;

/**
 * 
 * Java-Class for anonymous complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
   <complexType>
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="DynamicDNSInformation" type="{http://www.onvif.org/ver10/schema}DynamicDNSInformation"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dynamicDNSInformation" })
@XmlRootElement(name = "GetDynamicDNSResponse")
public class GetDynamicDNSResponse {

    /**
     *
     */
    @XmlElement(name = "DynamicDNSInformation", required = true)
	protected DynamicDNSInformation dynamicDNSInformation;

	/**
	 * Ruft den Wert der dynamicDNSInformation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DynamicDNSInformation }
	 * 
	 */
	public DynamicDNSInformation getDynamicDNSInformation() {
		return dynamicDNSInformation;
	}

	/**
	 * Legt den Wert der dynamicDNSInformation-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link DynamicDNSInformation }
	 * 
	 */
	public void setDynamicDNSInformation(DynamicDNSInformation value) {
		this.dynamicDNSInformation = value;
	}

}
