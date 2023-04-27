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
 * 
 * Java-Klasse f�r SupportInformation complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="SupportInformation">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Binary" type="{http://www.onvif.org/ver10/schema}AttachmentData" minOccurs="0"/>
 *         <element name="String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportInformation", propOrder = { "binary", "string" })
public class SupportInformation {

    /**
     *
     */
    @XmlElement(name = "Binary")
	protected AttachmentData binary;

    /**
     *
     */
    @XmlElement(name = "String")
	protected String string;

	/**
	 * Ruft den Wert der binary-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AttachmentData }
	 * 
	 */
	public AttachmentData getBinary() {
		return binary;
	}

	/**
	 * Legt den Wert der binary-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link AttachmentData }
	 * 
	 */
	public void setBinary(AttachmentData value) {
		this.binary = value;
	}

	/**
	 * Ruft den Wert der string-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getString() {
		return string;
	}

	/**
	 * Legt den Wert der string-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setString(String value) {
		this.string = value;
	}

}
