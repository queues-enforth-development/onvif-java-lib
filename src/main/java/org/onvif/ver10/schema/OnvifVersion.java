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
 * Java-Klasse f�r OnvifVersion complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="OnvifVersion">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Minor" type="{http://www.w3.org/2001/XMLSchema}int"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnvifVersion", propOrder = { "major", "minor" })
public class OnvifVersion {

    /**
     *
     */
    @XmlElement(name = "Major")
	protected int major;

    /**
     *
     */
    @XmlElement(name = "Minor")
	protected int minor;

	/**
	 * Ruft den Wert der major-Eigenschaft ab.
	 * 
     * @return 
	 */
	public int getMajor() {
		return major;
	}

	/**
	 * Legt den Wert der major-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setMajor(int value) {
		this.major = value;
	}

	/**
	 * Ruft den Wert der minor-Eigenschaft ab.
	 * 
     * @return 
	 */
	public int getMinor() {
		return minor;
	}

	/**
	 * Legt den Wert der minor-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setMinor(int value) {
		this.minor = value;
	}

}
