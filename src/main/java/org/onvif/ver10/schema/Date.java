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
 * Java-Klasse f�r Date complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Date">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Date", propOrder = { "year", "month", "day" })
public class Date {

    /**
     *
     */
    @XmlElement(name = "Year")
	protected int year;

    /**
     *
     */
    @XmlElement(name = "Month")
	protected int month;

    /**
     *
     */
    @XmlElement(name = "Day")
	protected int day;

	/**
	 * Ruft den Wert der year-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Legt den Wert der year-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setYear(int value) {
		this.year = value;
	}

	/**
	 * Ruft den Wert der month-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Legt den Wert der month-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setMonth(int value) {
		this.month = value;
	}

	/**
	 * Ruft den Wert der day-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Legt den Wert der day-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setDay(int value) {
		this.day = value;
	}

}
