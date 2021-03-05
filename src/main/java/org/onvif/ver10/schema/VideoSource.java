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
import javax.xml.namespace.QName;

/**
 * Representation of a physical video input.
 * 
 * <p>
 * Java-Klasse f�r VideoSource complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="VideoSource">
     <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
         <sequence>
 *         <element name="Framerate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="Resolution" type="{http://www.onvif.org/ver10/schema}VideoResolution"/>
 *         <element name="Imaging" type="{http://www.onvif.org/ver10/schema}ImagingSettings" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceExtension" minOccurs="0"/>
         </sequence>
         <anyAttribute processContents='lax'/>
 *     </extension>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSource", propOrder = { "framerate", "resolution", "imaging", "extension" })
public class VideoSource extends DeviceEntity {

    /**
     *
     */
    @XmlElement(name = "Framerate")
	protected float framerate;

    /**
     *
     */
    @XmlElement(name = "Resolution", required = true)
	protected VideoResolution resolution;

    /**
     *
     */
    @XmlElement(name = "Imaging")
	protected ImagingSettings imaging;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected VideoSourceExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der framerate-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getFramerate() {
		return framerate;
	}

	/**
	 * Legt den Wert der framerate-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setFramerate(float value) {
		this.framerate = value;
	}

	/**
	 * Ruft den Wert der resolution-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoResolution }
	 * 
	 */
	public VideoResolution getResolution() {
		return resolution;
	}

	/**
	 * Legt den Wert der resolution-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoResolution }
	 * 
	 */
	public void setResolution(VideoResolution value) {
		this.resolution = value;
	}

	/**
	 * Ruft den Wert der imaging-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ImagingSettings }
	 * 
	 */
	public ImagingSettings getImaging() {
		return imaging;
	}

	/**
	 * Legt den Wert der imaging-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ImagingSettings }
	 * 
	 */
	public void setImaging(ImagingSettings value) {
		this.imaging = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoSourceExtension }
	 * 
	 */
	public VideoSourceExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoSourceExtension }
	 * 
	 */
	public void setExtension(VideoSourceExtension value) {
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
