//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DateTime;
import org.onvif.ver10.schema.SetDateTimeType;
import org.onvif.ver10.schema.TimeZone;

/**
 * <p>
 * Java-Class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
   <complexType>
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="DateTimeType" type="{http://www.onvif.org/ver10/schema}SetDateTimeType"/>
 *         <element name="DaylightSavings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="TimeZone" type="{http://www.onvif.org/ver10/schema}TimeZone" minOccurs="0"/>
 *         <element name="UTCDateTime" type="{http://www.onvif.org/ver10/schema}DateTime" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dateTimeType", "daylightSavings", "timeZone", "utcDateTime" })
@XmlRootElement(name = "SetSystemDateAndTime")
public class SetSystemDateAndTime {

    /**
     *
     */
    @XmlElement(name = "DateTimeType", required = true)
	protected SetDateTimeType dateTimeType;

    /**
     *
     */
    @XmlElement(name = "DaylightSavings")
	protected boolean daylightSavings;

    /**
     *
     */
    @XmlElement(name = "TimeZone")
	protected TimeZone timeZone;

    /**
     *
     */
    @XmlElement(name = "UTCDateTime")
	protected DateTime utcDateTime;

	/**
	 * Ruft den Wert der dateTimeType-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SetDateTimeType }
	 * 
	 */
	public SetDateTimeType getDateTimeType() {
		return dateTimeType;
	}

	/**
	 * Legt den Wert der dateTimeType-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SetDateTimeType }
	 * 
	 */
	public void setDateTimeType(SetDateTimeType value) {
		this.dateTimeType = value;
	}

	/**
	 * Ruft den Wert der daylightSavings-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isDaylightSavings() {
		return daylightSavings;
	}

	/**
	 * Legt den Wert der daylightSavings-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setDaylightSavings(boolean value) {
		this.daylightSavings = value;
	}

	/**
	 * Ruft den Wert der timeZone-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TimeZone }
	 * 
	 */
	public TimeZone getTimeZone() {
		return timeZone;
	}

	/**
	 * Legt den Wert der timeZone-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TimeZone }
	 * 
	 */
	public void setTimeZone(TimeZone value) {
		this.timeZone = value;
	}

	/**
	 * Ruft den Wert der utcDateTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getUTCDateTime() {
		return utcDateTime;
	}

	/**
	 * Legt den Wert der utcDateTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setUTCDateTime(DateTime value) {
		this.utcDateTime = value;
	}

}
