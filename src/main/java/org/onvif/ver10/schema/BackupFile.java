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
 * Java-Klasse f�r BackupFile complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="BackupFile">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Data" type="{http://www.onvif.org/ver10/schema}AttachmentData"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackupFile", propOrder = { "name", "data" })
public class BackupFile {

    /**
     *
     */
    @XmlElement(name = "Name", required = true)
	protected String name;

    /**
     *
     */
    @XmlElement(name = "Data", required = true)
	protected AttachmentData data;

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
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Ruft den Wert der data-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AttachmentData }
	 * 
	 */
	public AttachmentData getData() {
		return data;
	}

	/**
	 * Legt den Wert der data-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link AttachmentData }
	 * 
	 */
	public void setData(AttachmentData value) {
		this.data = value;
	}

}
