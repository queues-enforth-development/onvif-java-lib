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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Java-Klasse f�r CertificateUsage complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="CertificateUsage">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="Critical" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </extension>
 *   </simpleContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateUsage", propOrder = { "value" })
public class CertificateUsage {

    /**
     *
     */
    @XmlValue
	protected String value;

    /**
     *
     */
    @XmlAttribute(name = "Critical", required = true)
	protected boolean critical;

	/**
	 * Ruft den Wert der value-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Legt den Wert der value-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Ruft den Wert der critical-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isCritical() {
		return critical;
	}

	/**
	 * Legt den Wert der critical-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setCritical(boolean value) {
		this.critical = value;
	}

}
