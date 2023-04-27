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
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * 
 * Java-Klasse f�r DeviceIOCapabilities complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceIOCapabilities">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="VideoSources" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="VideoOutputs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AudioSources" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AudioOutputs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="RelayOutputs" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "DeviceIOCapabilities", propOrder = { "xAddr", "videoSources", "videoOutputs", "audioSources", "audioOutputs", "relayOutputs", "any" })
public class DeviceIOCapabilities {

    /**
     *
     */
    @XmlElement(name = "XAddr", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String xAddr;

    /**
     *
     */
    @XmlElement(name = "VideoSources")
	protected int videoSources;

    /**
     *
     */
    @XmlElement(name = "VideoOutputs")
	protected int videoOutputs;

    /**
     *
     */
    @XmlElement(name = "AudioSources")
	protected int audioSources;

    /**
     *
     */
    @XmlElement(name = "AudioOutputs")
	protected int audioOutputs;

    /**
     *
     */
    @XmlElement(name = "RelayOutputs")
	protected int relayOutputs;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der xAddr-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXAddr() {
		return xAddr;
	}

	/**
	 * Legt den Wert der xAddr-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXAddr(String value) {
		this.xAddr = value;
	}

	/**
	 * Ruft den Wert der videoSources-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getVideoSources() {
		return videoSources;
	}

	/**
	 * Legt den Wert der videoSources-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setVideoSources(int value) {
		this.videoSources = value;
	}

	/**
	 * Ruft den Wert der videoOutputs-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getVideoOutputs() {
		return videoOutputs;
	}

	/**
	 * Legt den Wert der videoOutputs-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setVideoOutputs(int value) {
		this.videoOutputs = value;
	}

	/**
	 * Ruft den Wert der audioSources-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getAudioSources() {
		return audioSources;
	}

	/**
	 * Legt den Wert der audioSources-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setAudioSources(int value) {
		this.audioSources = value;
	}

	/**
	 * Ruft den Wert der audioOutputs-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getAudioOutputs() {
		return audioOutputs;
	}

	/**
	 * Legt den Wert der audioOutputs-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setAudioOutputs(int value) {
		this.audioOutputs = value;
	}

	/**
	 * Ruft den Wert der relayOutputs-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getRelayOutputs() {
		return relayOutputs;
	}

	/**
	 * Legt den Wert der relayOutputs-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setRelayOutputs(int value) {
		this.relayOutputs = value;
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
