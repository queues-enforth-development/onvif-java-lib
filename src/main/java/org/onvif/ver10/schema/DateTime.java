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
 * Java-Klasse f�r DateTime complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="DateTime">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Time" type="{http://www.onvif.org/ver10/schema}Time"/>
 *         <element name="Date" type="{http://www.onvif.org/ver10/schema}Date"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTime", propOrder = { "time", "date" })
public class DateTime {

    /**
     *
     */
    @XmlElement(name = "Time", required = true)
	protected Time time;

    /**
     *
     */
    @XmlElement(name = "Date", required = true)
	protected Date date;

	/**
	 * Ruft den Wert der time-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Time }
	 * 
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * Legt den Wert der time-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Time }
	 * 
	 */
	public void setTime(Time value) {
		this.time = value;
	}

	/**
	 * Ruft den Wert der date-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Date }
	 * 
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Legt den Wert der date-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Date }
	 * 
	 */
	public void setDate(Date value) {
		this.date = value;
	}

}
