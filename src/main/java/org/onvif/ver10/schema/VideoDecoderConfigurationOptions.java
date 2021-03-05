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
 * <p>
 * Java-Klasse f�r VideoDecoderConfigurationOptions complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="VideoDecoderConfigurationOptions">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="JpegDecOptions" type="{http://www.onvif.org/ver10/schema}JpegDecOptions" minOccurs="0"/>
 *         <element name="H264DecOptions" type="{http://www.onvif.org/ver10/schema}H264DecOptions" minOccurs="0"/>
 *         <element name="Mpeg4DecOptions" type="{http://www.onvif.org/ver10/schema}Mpeg4DecOptions" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoDecoderConfigurationOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "VideoDecoderConfigurationOptions", propOrder = { "jpegDecOptions", "h264DecOptions", "mpeg4DecOptions", "extension" })
public class VideoDecoderConfigurationOptions {

    /**
     *
     */
    @XmlElement(name = "JpegDecOptions")
	protected JpegDecOptions jpegDecOptions;

    /**
     *
     */
    @XmlElement(name = "H264DecOptions")
	protected H264DecOptions h264DecOptions;

    /**
     *
     */
    @XmlElement(name = "Mpeg4DecOptions")
	protected Mpeg4DecOptions mpeg4DecOptions;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected VideoDecoderConfigurationOptionsExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der jpegDecOptions-Eigenschaft ab.
	 * 
	 * @return possible object is {@link JpegDecOptions }
	 * 
	 */
	public JpegDecOptions getJpegDecOptions() {
		return jpegDecOptions;
	}

	/**
	 * Legt den Wert der jpegDecOptions-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link JpegDecOptions }
	 * 
	 */
	public void setJpegDecOptions(JpegDecOptions value) {
		this.jpegDecOptions = value;
	}

	/**
	 * Ruft den Wert der h264DecOptions-Eigenschaft ab.
	 * 
	 * @return possible object is {@link H264DecOptions }
	 * 
	 */
	public H264DecOptions getH264DecOptions() {
		return h264DecOptions;
	}

	/**
	 * Legt den Wert der h264DecOptions-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link H264DecOptions }
	 * 
	 */
	public void setH264DecOptions(H264DecOptions value) {
		this.h264DecOptions = value;
	}

	/**
	 * Ruft den Wert der mpeg4DecOptions-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Mpeg4DecOptions }
	 * 
	 */
	public Mpeg4DecOptions getMpeg4DecOptions() {
		return mpeg4DecOptions;
	}

	/**
	 * Legt den Wert der mpeg4DecOptions-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Mpeg4DecOptions }
	 * 
	 */
	public void setMpeg4DecOptions(Mpeg4DecOptions value) {
		this.mpeg4DecOptions = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoDecoderConfigurationOptionsExtension }
	 * 
	 */
	public VideoDecoderConfigurationOptionsExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoDecoderConfigurationOptionsExtension }
	 * 
	 */
	public void setExtension(VideoDecoderConfigurationOptionsExtension value) {
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
