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
 * Java-Klasse f�r VideoRateControl complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="VideoRateControl">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="EncodingInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl", propOrder = { "frameRateLimit", "encodingInterval", "bitrateLimit" })
public class VideoRateControl {

    /**
     *
     */
    @XmlElement(name = "FrameRateLimit")
	protected int frameRateLimit;

    /**
     *
     */
    @XmlElement(name = "EncodingInterval")
	protected int encodingInterval;

    /**
     *
     */
    @XmlElement(name = "BitrateLimit")
	protected int bitrateLimit;

	/**
	 * Ruft den Wert der frameRateLimit-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getFrameRateLimit() {
		return frameRateLimit;
	}

	/**
	 * Legt den Wert der frameRateLimit-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setFrameRateLimit(int value) {
		this.frameRateLimit = value;
	}

	/**
	 * Ruft den Wert der encodingInterval-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getEncodingInterval() {
		return encodingInterval;
	}

	/**
	 * Legt den Wert der encodingInterval-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setEncodingInterval(int value) {
		this.encodingInterval = value;
	}

	/**
	 * Ruft den Wert der bitrateLimit-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getBitrateLimit() {
		return bitrateLimit;
	}

	/**
	 * Legt den Wert der bitrateLimit-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setBitrateLimit(int value) {
		this.bitrateLimit = value;
	}

}
