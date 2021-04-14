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
import javax.xml.datatype.Duration;

/**
 * Range of duration greater equal Min duration and less equal Max duration.
 * 
 * <p>
 * Java-Klasse f�r DurationRange complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="DurationRange">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Min" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         <element name="Max" type="{http://www.w3.org/2001/XMLSchema}duration"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DurationRange", propOrder = { "min", "max" })
public class DurationRange {

    /**
     *
     */
    @XmlElement(name = "Min", required = true)
	protected Duration min;

    /**
     *
     */
    @XmlElement(name = "Max", required = true)
	protected Duration max;

	/**
	 * Ruft den Wert der min-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getMin() {
		return min;
	}

	/**
	 * Legt den Wert der min-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setMin(Duration value) {
		this.min = value;
	}

	/**
	 * Ruft den Wert der max-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getMax() {
		return max;
	}

	/**
	 * Legt den Wert der max-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setMax(Duration value) {
		this.max = value;
	}

}
