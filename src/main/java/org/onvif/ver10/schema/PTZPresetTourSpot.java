//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r PTZPresetTourSpot complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PTZPresetTourSpot">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="PresetDetail" type="{http://www.onvif.org/ver10/schema}PTZPresetTourPresetDetail"/>
 *         <element name="Speed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/>
 *         <element name="StayTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSpotExtension" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourSpot", propOrder = { "presetDetail", "speed", "stayTime", "extension" })
public class PTZPresetTourSpot {

    /**
     *
     */
    @XmlElement(name = "PresetDetail", required = true)
	protected PTZPresetTourPresetDetail presetDetail;

    /**
     *
     */
    @XmlElement(name = "Speed")
	protected PTZSpeed speed;

    /**
     *
     */
    @XmlElement(name = "StayTime")
	protected Duration stayTime;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected PTZPresetTourSpotExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der presetDetail-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourPresetDetail }
	 * 
	 */
	public PTZPresetTourPresetDetail getPresetDetail() {
		return presetDetail;
	}

	/**
	 * Legt den Wert der presetDetail-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourPresetDetail }
	 * 
	 */
	public void setPresetDetail(PTZPresetTourPresetDetail value) {
		this.presetDetail = value;
	}

	/**
	 * Ruft den Wert der speed-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZSpeed }
	 * 
	 */
	public PTZSpeed getSpeed() {
		return speed;
	}

	/**
	 * Legt den Wert der speed-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZSpeed }
	 * 
	 */
	public void setSpeed(PTZSpeed value) {
		this.speed = value;
	}

	/**
	 * Ruft den Wert der stayTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getStayTime() {
		return stayTime;
	}

	/**
	 * Legt den Wert der stayTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setStayTime(Duration value) {
		this.stayTime = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourSpotExtension }
	 * 
	 */
	public PTZPresetTourSpotExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZPresetTourSpotExtension }
	 * 
	 */
	public void setExtension(PTZPresetTourSpotExtension value) {
		this.extension = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
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
