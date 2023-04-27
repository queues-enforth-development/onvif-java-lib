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
 * Range of values greater equal Min value and less equal Max value.
 * 
 * <p>
 * Java-Klasse f�r IntRange complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="IntRange">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRange", propOrder = { "min", "max" })
public class IntRange {

    /**
     *
     */
    @XmlElement(name = "Min")
	protected int min;

    /**
     *
     */
    @XmlElement(name = "Max")
	protected int max;

	/**
	 * Ruft den Wert der min-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getMin() {
		return min;
	}

	/**
	 * Legt den Wert der min-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setMin(int value) {
		this.min = value;
	}

	/**
	 * Ruft den Wert der max-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getMax() {
		return max;
	}

	/**
	 * Legt den Wert der max-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setMax(int value) {
		this.max = value;
	}

}
