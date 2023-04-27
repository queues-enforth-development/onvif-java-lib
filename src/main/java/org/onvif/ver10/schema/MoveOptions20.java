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
 * Java-Klasse f�r MoveOptions20 complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="MoveOptions20">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocusOptions" minOccurs="0"/>
 *         <element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocusOptions20" minOccurs="0"/>
 *         <element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocusOptions" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveOptions20", propOrder = { "absolute", "relative", "continuous" })
public class MoveOptions20 {

    /**
     *
     */
    @XmlElement(name = "Absolute")
	protected AbsoluteFocusOptions absolute;

    /**
     *
     */
    @XmlElement(name = "Relative")
	protected RelativeFocusOptions20 relative;

    /**
     *
     */
    @XmlElement(name = "Continuous")
	protected ContinuousFocusOptions continuous;

	/**
	 * Ruft den Wert der absolute-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AbsoluteFocusOptions }
	 * 
	 */
	public AbsoluteFocusOptions getAbsolute() {
		return absolute;
	}

	/**
	 * Legt den Wert der absolute-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link AbsoluteFocusOptions }
	 * 
	 */
	public void setAbsolute(AbsoluteFocusOptions value) {
		this.absolute = value;
	}

	/**
	 * Ruft den Wert der relative-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RelativeFocusOptions20 }
	 * 
	 */
	public RelativeFocusOptions20 getRelative() {
		return relative;
	}

	/**
	 * Legt den Wert der relative-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link RelativeFocusOptions20 }
	 * 
	 */
	public void setRelative(RelativeFocusOptions20 value) {
		this.relative = value;
	}

	/**
	 * Ruft den Wert der continuous-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ContinuousFocusOptions }
	 * 
	 */
	public ContinuousFocusOptions getContinuous() {
		return continuous;
	}

	/**
	 * Legt den Wert der continuous-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link ContinuousFocusOptions }
	 * 
	 */
	public void setContinuous(ContinuousFocusOptions value) {
		this.continuous = value;
	}

}
