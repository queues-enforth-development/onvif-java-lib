//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r SecurityCapabilitiesExtension complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityCapabilitiesExtension">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="TLS1.0" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}SecurityCapabilitiesExtension2" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilitiesExtension", propOrder = { "tls10", "extension" })
public class SecurityCapabilitiesExtension {

    /**
     *
     */
    @XmlElement(name = "TLS1.0")
	protected boolean tls10;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected SecurityCapabilitiesExtension2 extension;

	/**
	 * Ruft den Wert der tls10-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isTLS10() {
		return tls10;
	}

	/**
	 * Legt den Wert der tls10-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setTLS10(boolean value) {
		this.tls10 = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SecurityCapabilitiesExtension2 }
	 * 
	 */
	public SecurityCapabilitiesExtension2 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SecurityCapabilitiesExtension2 }
	 * 
	 */
	public void setExtension(SecurityCapabilitiesExtension2 value) {
		this.extension = value;
	}

}
