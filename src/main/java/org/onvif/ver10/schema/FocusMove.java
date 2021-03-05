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
 * Java-Klasse f�r FocusMove complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="FocusMove">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocus" minOccurs="0"/>
 *         <element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocus" minOccurs="0"/>
 *         <element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocus" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusMove", propOrder = { "absolute", "relative", "continuous" })
public class FocusMove {

    /**
     *
     */
    @XmlElement(name = "Absolute")
	protected AbsoluteFocus absolute;

    /**
     *
     */
    @XmlElement(name = "Relative")
	protected RelativeFocus relative;

    /**
     *
     */
    @XmlElement(name = "Continuous")
	protected ContinuousFocus continuous;

	/**
	 * Ruft den Wert der absolute-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AbsoluteFocus }
	 * 
	 */
	public AbsoluteFocus getAbsolute() {
		return absolute;
	}

	/**
	 * Legt den Wert der absolute-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AbsoluteFocus }
	 * 
	 */
	public void setAbsolute(AbsoluteFocus value) {
		this.absolute = value;
	}

	/**
	 * Ruft den Wert der relative-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RelativeFocus }
	 * 
	 */
	public RelativeFocus getRelative() {
		return relative;
	}

	/**
	 * Legt den Wert der relative-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link RelativeFocus }
	 * 
	 */
	public void setRelative(RelativeFocus value) {
		this.relative = value;
	}

	/**
	 * Ruft den Wert der continuous-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ContinuousFocus }
	 * 
	 */
	public ContinuousFocus getContinuous() {
		return continuous;
	}

	/**
	 * Legt den Wert der continuous-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ContinuousFocus }
	 * 
	 */
	public void setContinuous(ContinuousFocus value) {
		this.continuous = value;
	}

}
