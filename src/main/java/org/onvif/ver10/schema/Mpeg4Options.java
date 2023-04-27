//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r Mpeg4Options complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Mpeg4Options">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="ResolutionsAvailable" type="{http://www.onvif.org/ver10/schema}VideoResolution" maxOccurs="unbounded"/>
 *         <element name="GovLengthRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="FrameRateRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="EncodingIntervalRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="Mpeg4ProfilesSupported" type="{http://www.onvif.org/ver10/schema}Mpeg4Profile" maxOccurs="unbounded"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mpeg4Options", propOrder = { "resolutionsAvailable", "govLengthRange", "frameRateRange", "encodingIntervalRange", "mpeg4ProfilesSupported" })
@XmlSeeAlso({ Mpeg4Options2.class })
public class Mpeg4Options {

    /**
     *
     */
    @XmlElement(name = "ResolutionsAvailable", required = true)
	protected List<VideoResolution> resolutionsAvailable;

    /**
     *
     */
    @XmlElement(name = "GovLengthRange", required = true)
	protected IntRange govLengthRange;

    /**
     *
     */
    @XmlElement(name = "FrameRateRange", required = true)
	protected IntRange frameRateRange;

    /**
     *
     */
    @XmlElement(name = "EncodingIntervalRange", required = true)
	protected IntRange encodingIntervalRange;

    /**
     *
     */
    @XmlElement(name = "Mpeg4ProfilesSupported", required = true)
	protected List<Mpeg4Profile> mpeg4ProfilesSupported;

	/**
	 * Gets the value of the resolutionsAvailable property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the resolutionsAvailable property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getResolutionsAvailable().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link VideoResolution }
	 * 
	 * 
     * @return 
	 */
	public List<VideoResolution> getResolutionsAvailable() {
		if (resolutionsAvailable == null) {
			resolutionsAvailable = new ArrayList<>();
		}
		return this.resolutionsAvailable;
	}

	/**
	 * Ruft den Wert der govLengthRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getGovLengthRange() {
		return govLengthRange;
	}

	/**
	 * Legt den Wert der govLengthRange-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setGovLengthRange(IntRange value) {
		this.govLengthRange = value;
	}

	/**
	 * Ruft den Wert der frameRateRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getFrameRateRange() {
		return frameRateRange;
	}

	/**
	 * Legt den Wert der frameRateRange-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setFrameRateRange(IntRange value) {
		this.frameRateRange = value;
	}

	/**
	 * Ruft den Wert der encodingIntervalRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getEncodingIntervalRange() {
		return encodingIntervalRange;
	}

	/**
	 * Legt den Wert der encodingIntervalRange-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setEncodingIntervalRange(IntRange value) {
		this.encodingIntervalRange = value;
	}

	/**
	 * Gets the value of the mpeg4ProfilesSupported property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the mpeg4ProfilesSupported property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getMpeg4ProfilesSupported().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Mpeg4Profile }
	 * 
	 * 
     * @return 
	 */
	public List<Mpeg4Profile> getMpeg4ProfilesSupported() {
		if (mpeg4ProfilesSupported == null) {
			mpeg4ProfilesSupported = new ArrayList<>();
		}
		return this.mpeg4ProfilesSupported;
	}

}
