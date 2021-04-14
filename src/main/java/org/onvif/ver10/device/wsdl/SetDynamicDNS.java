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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import org.onvif.ver10.schema.DynamicDNSType;

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
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}DynamicDNSType"/>
 *         <element name="Name" type="{http://www.onvif.org/ver10/schema}DNSName" minOccurs="0"/>
 *         <element name="TTL" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "type", "name", "ttl" })
@XmlRootElement(name = "SetDynamicDNS")
public class SetDynamicDNS {

    /**
     *
     */
    @XmlElement(name = "Type", required = true)
	protected DynamicDNSType type;

    /**
     *
     */
    @XmlElement(name = "Name")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String name;

    /**
     *
     */
    @XmlElement(name = "TTL")
	protected Duration ttl;

	/**
	 * Ruft den Wert der type-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DynamicDNSType }
	 * 
	 */
	public DynamicDNSType getType() {
		return type;
	}

	/**
	 * Legt den Wert der type-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DynamicDNSType }
	 * 
	 */
	public void setType(DynamicDNSType value) {
		this.type = value;
	}

	/**
	 * Ruft den Wert der name-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Legt den Wert der name-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Ruft den Wert der ttl-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getTTL() {
		return ttl;
	}

	/**
	 * Legt den Wert der ttl-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setTTL(Duration value) {
		this.ttl = value;
	}

}
