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
 * Java-Klasse f�r IPv4NetworkInterface complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="IPv4NetworkInterface">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Config" type="{http://www.onvif.org/ver10/schema}IPv4Configuration"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv4NetworkInterface", propOrder = { "enabled", "config" })
public class IPv4NetworkInterface {

    /**
     *
     */
    @XmlElement(name = "Enabled")
	protected boolean enabled;

    /**
     *
     */
    @XmlElement(name = "Config", required = true)
	protected IPv4Configuration config;

	/**
	 * Ruft den Wert der enabled-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Legt den Wert der enabled-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setEnabled(boolean value) {
		this.enabled = value;
	}

	/**
	 * Ruft den Wert der config-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IPv4Configuration }
	 * 
	 */
	public IPv4Configuration getConfig() {
		return config;
	}

	/**
	 * Legt den Wert der config-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IPv4Configuration }
	 * 
	 */
	public void setConfig(IPv4Configuration value) {
		this.config = value;
	}

}
