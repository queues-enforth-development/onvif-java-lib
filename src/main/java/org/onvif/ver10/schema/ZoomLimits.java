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
 * Java-Klasse f�r ZoomLimits complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ZoomLimits">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Range" type="{http://www.onvif.org/ver10/schema}Space1DDescription"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoomLimits", propOrder = { "range" })
public class ZoomLimits {

    /**
     *
     */
    @XmlElement(name = "Range", required = true)
	protected Space1DDescription range;

	/**
	 * Ruft den Wert der range-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Space1DDescription }
	 * 
	 */
	public Space1DDescription getRange() {
		return range;
	}

	/**
	 * Legt den Wert der range-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Space1DDescription }
	 * 
	 */
	public void setRange(Space1DDescription value) {
		this.range = value;
	}

}
