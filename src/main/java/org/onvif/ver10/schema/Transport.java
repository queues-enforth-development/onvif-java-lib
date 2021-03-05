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
 * Java-Klasse f�r Transport complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Transport">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Protocol" type="{http://www.onvif.org/ver10/schema}TransportProtocol"/>
 *         <element name="Tunnel" type="{http://www.onvif.org/ver10/schema}Transport" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transport", propOrder = { "protocol", "tunnel" })
public class Transport {

    /**
     *
     */
    @XmlElement(name = "Protocol", required = true)
	protected TransportProtocol protocol;

    /**
     *
     */
    @XmlElement(name = "Tunnel")
	protected Transport tunnel;

	/**
	 * Ruft den Wert der protocol-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TransportProtocol }
	 * 
	 */
	public TransportProtocol getProtocol() {
		return protocol;
	}

	/**
	 * Legt den Wert der protocol-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TransportProtocol }
	 * 
	 */
	public void setProtocol(TransportProtocol value) {
		this.protocol = value;
	}

	/**
	 * Ruft den Wert der tunnel-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Transport }
	 * 
	 */
	public Transport getTunnel() {
		return tunnel;
	}

	/**
	 * Legt den Wert der tunnel-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Transport }
	 * 
	 */
	public void setTunnel(Transport value) {
		this.tunnel = value;
	}

}
