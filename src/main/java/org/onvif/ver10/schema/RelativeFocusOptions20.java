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
 * Java-Klasse f�r RelativeFocusOptions20 complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="RelativeFocusOptions20">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Distance" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="Speed" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeFocusOptions20", propOrder = { "distance", "speed" })
public class RelativeFocusOptions20 {

    /**
     *
     */
    @XmlElement(name = "Distance", required = true)
	protected FloatRange distance;

    /**
     *
     */
    @XmlElement(name = "Speed")
	protected FloatRange speed;

	/**
	 * Ruft den Wert der distance-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getDistance() {
		return distance;
	}

	/**
	 * Legt den Wert der distance-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setDistance(FloatRange value) {
		this.distance = value;
	}

	/**
	 * Ruft den Wert der speed-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getSpeed() {
		return speed;
	}

	/**
	 * Legt den Wert der speed-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setSpeed(FloatRange value) {
		this.speed = value;
	}

}
