//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Java-Klasse f�r BinaryData complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="BinaryData">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
         </sequence>
 *       <attribute ref="{http://www.w3.org/2005/05/xmlmime}contentType"/>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryData", propOrder = { "data" })
public class BinaryData {

    /**
     *
     */
    @XmlElement(name = "Data", required = true)
	protected byte[] data;

    /**
     *
     */
    @XmlAttribute(name = "contentType", namespace = "http://www.w3.org/2005/05/xmlmime")
	protected String contentType;

	/**
	 * Ruft den Wert der data-Eigenschaft ab.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * Legt den Wert der data-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is byte[]
	 */
	public void setData(byte[] value) {
		this.data = value;
	}

	/**
	 * Ruft den Wert der contentType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * Legt den Wert der contentType-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContentType(String value) {
		this.contentType = value;
	}

}
