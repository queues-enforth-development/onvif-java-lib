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
import org.onvif.ver10.schema.Dot1XConfiguration;

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
 *         <element name="Dot1XConfiguration" type="{http://www.onvif.org/ver10/schema}Dot1XConfiguration"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dot1XConfiguration" })
@XmlRootElement(name = "CreateDot1XConfiguration")
public class CreateDot1XConfiguration {

    /**
     *
     */
    @XmlElement(name = "Dot1XConfiguration", required = true)
	protected Dot1XConfiguration dot1XConfiguration;

	/**
	 * Ruft den Wert der dot1XConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot1XConfiguration }
	 * 
	 */
	public Dot1XConfiguration getDot1XConfiguration() {
		return dot1XConfiguration;
	}

	/**
	 * Legt den Wert der dot1XConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Dot1XConfiguration }
	 * 
	 */
	public void setDot1XConfiguration(Dot1XConfiguration value) {
		this.dot1XConfiguration = value;
	}

}
