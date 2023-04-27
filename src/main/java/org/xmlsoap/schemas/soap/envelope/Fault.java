//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.xmlsoap.schemas.soap.envelope;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * 
 * Fault reporting structure
 * 
 * 
 * 
 * Java class for fault complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Fault">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         <element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="faultactor" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="detail" type="{http://schemas.xmlsoap.org/soap/envelope/}detail" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", propOrder = { "faultcode", "faultstring", "faultactor", "detail" })
public class Fault {

    /**
     *
     */
    @XmlElement(required = true)
	protected QName faultcode;

    /**
     *
     */
    @XmlElement(required = true)
	protected String faultstring;

    /**
     *
     */
    @XmlSchemaType(name = "anyURI")
	protected String faultactor;

    /**
     *
     */
    protected Detail detail;

	/**
	 * Gets the value of the fault code property.
	 * 
	 * @return possible object is {@link QName }
	 * 
	 */
	public QName getFaultcode() {
		return faultcode;
	}

	/**
	 * Sets the value of the faultcode property.
	 * 
	 * @param value -
	 *            allowed object is {@link QName }
	 * 
	 */
	public void setFaultcode(QName value) {
		this.faultcode = value;
	}

	/**
	 * Gets the value of the faultstring property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaultstring() {
		return faultstring;
	}

	/**
	 * Sets the value of the faultstring property.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaultstring(String value) {
		this.faultstring = value;
	}

	/**
	 * Gets the value of the faultactor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaultactor() {
		return faultactor;
	}

	/**
	 * Sets the value of the faultactor property.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaultactor(String value) {
		this.faultactor = value;
	}

	/**
	 * Gets the value of the detail property.
	 * 
	 * @return possible object is {@link Detail }
	 * 
	 */
	public Detail getDetail() {
		return detail;
	}

	/**
	 * Sets the value of the detail property.
	 * 
	 * @param value -
	 *            allowed object is {@link Detail }
	 * 
	 */
	public void setDetail(Detail value) {
		this.detail = value;
	}

}
