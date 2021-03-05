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
 * Java-Klasse f�r PanTiltLimits complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PanTiltLimits">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Range" type="{http://www.onvif.org/ver10/schema}Space2DDescription"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanTiltLimits", propOrder = { "range" })
public class PanTiltLimits {

    /**
     *
     */
    @XmlElement(name = "Range", required = true)
	protected Space2DDescription range;

	/**
	 * Ruft den Wert der range-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Space2DDescription }
	 * 
	 */
	public Space2DDescription getRange() {
		return range;
	}

	/**
	 * Legt den Wert der range-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Space2DDescription }
	 * 
	 */
	public void setRange(Space2DDescription value) {
		this.range = value;
	}

}
