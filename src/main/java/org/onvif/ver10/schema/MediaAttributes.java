//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * A set of media attributes valid for a recording at a point in time or for a time interval.
 * 
 * 
 * Java-Klasse f�r MediaAttributes complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="MediaAttributes">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/>
 *         <element name="TrackAttributes" type="{http://www.onvif.org/ver10/schema}TrackAttributes" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="From" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="Until" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
           <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
         <anyAttribute processContents='lax'/>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAttributes", propOrder = { "recordingToken", "trackAttributes", "from", "until", "any" })
public class MediaAttributes {

    /**
     *
     */
    @XmlElement(name = "RecordingToken", required = true)
	protected String recordingToken;

    /**
     *
     */
    @XmlElement(name = "TrackAttributes")
	protected List<TrackAttributes> trackAttributes;

    /**
     *
     */
    @XmlElement(name = "From", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar from;

    /**
     *
     */
    @XmlElement(name = "Until", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar until;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der recordingToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecordingToken() {
		return recordingToken;
	}

	/**
	 * Legt den Wert der recordingToken-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecordingToken(String value) {
		this.recordingToken = value;
	}

	/**
	 * Gets the value of the trackAttributes property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the trackAttributes property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getTrackAttributes().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link TrackAttributes }
	 * 
	 * 
     * @return  -
	 */
	public List<TrackAttributes> getTrackAttributes() {
		if (trackAttributes == null) {
			trackAttributes = new ArrayList<>();
		}
		return this.trackAttributes;
	}

	/**
	 * Ruft den Wert der from-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getFrom() {
		return from;
	}

	/**
	 * Legt den Wert der from-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setFrom(XMLGregorianCalendar value) {
		this.from = value;
	}

	/**
	 * Ruft den Wert der until-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getUntil() {
		return until;
	}

	/**
	 * Legt den Wert der until-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setUntil(XMLGregorianCalendar value) {
		this.until = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getAny().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
     * @return  -
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * 
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
