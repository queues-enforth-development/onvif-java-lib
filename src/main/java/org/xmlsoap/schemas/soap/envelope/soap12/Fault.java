//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.xmlsoap.schemas.soap.envelope.soap12;

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
 * <p>
 * Java class for fault complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Fault">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Code" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         <element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Role" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="Detail" type="{http://schemas.xmlsoap.org/soap/envelope/}detail" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "Fault", propOrder = { "Code", "Reason", "Role", "Detail" })
@XmlType(name = "Fault", propOrder = { "code", "reason", "role", "detail" })
public class Fault {

    /**
     *
     */
    @XmlElement(name="Code", required = true)
	protected QName code;

    /**
     *
     */
    @XmlElement(name="Reason", required = true)
	protected String reason;

    /**
     *
     */
    @XmlSchemaType(name = "anyURI")
	protected String role;

    /**
     *
     */
    @XmlElement(name="Detail")
    protected Detail detail;

	/**
	 * Gets the value of the fault code property.
	 * 
	 * @return possible object is {@link QName }
	 * 
	 */
	public QName getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value
	 *            allowed object is {@link QName }
	 * 
	 */
	public void setCode(QName value) {
		this.code = value;
	}

	/**
	 * Gets the value of the reason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the value of the reason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReason(String value) {
		this.reason = value;
	}

	/**
	 * Gets the value of the role property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the value of the role property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRole(String value) {
		this.role = value;
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
	 * @param value
	 *            allowed object is {@link Detail }
	 * 
	 */
	public void setDetail(Detail value) {
		this.detail = value;
	}

}
