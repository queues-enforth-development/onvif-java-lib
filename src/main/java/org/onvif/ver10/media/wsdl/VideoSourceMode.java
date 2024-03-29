//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generiert: 2014.02.19 um 02:35:56 PM CET 
//

package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.onvif.ver10.schema.VideoResolution;

/**
 * 
 * Java-Klasse f�r VideoSourceMode complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="VideoSourceMode">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="MaxFramerate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MaxResolution" type="{http://www.onvif.org/ver10/schema}VideoResolution"/>
 *         <element name="Encodings" type="{http://www.onvif.org/ver10/media/wsdl}EncodingTypes"/>
 *         <element name="Reboot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Description" type="{http://www.onvif.org/ver10/schema}Description" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/media/wsdl}VideoSourceModeExtension" minOccurs="0"/>
         </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       <attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         <anyAttribute processContents='lax'/>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceMode", propOrder = { "maxFramerate", "maxResolution", "encodings", "reboot", "description", "extension" })
public class VideoSourceMode {

    /**
     *
     */
    @XmlElement(name = "MaxFramerate")
	protected float maxFramerate;

    /**
     *
     */
    @XmlElement(name = "MaxResolution", required = true)
	protected VideoResolution maxResolution;

    /**
     *
     */
    @XmlList
	@XmlElement(name = "Encodings", required = true)
	protected List<String> encodings;

    /**
     *
     */
    @XmlElement(name = "Reboot")
	protected boolean reboot;

    /**
     *
     */
    @XmlElement(name = "Description")
	protected String description;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected VideoSourceModeExtension extension;

    /**
     *
     */
    @XmlAttribute(name = "token", required = true)
	protected String token;

    /**
     *
     */
    @XmlAttribute(name = "Enabled")
	protected Boolean enabled;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der maxFramerate-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public float getMaxFramerate() {
		return maxFramerate;
	}

	/**
	 * Legt den Wert der maxFramerate-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setMaxFramerate(float value) {
		this.maxFramerate = value;
	}

	/**
	 * Ruft den Wert der maxResolution-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoResolution }
	 * 
	 */
	public VideoResolution getMaxResolution() {
		return maxResolution;
	}

	/**
	 * Legt den Wert der maxResolution-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link VideoResolution }
	 * 
	 */
	public void setMaxResolution(VideoResolution value) {
		this.maxResolution = value;
	}

	/**
	 * Gets the value of the encodings property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the encodings property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getEncodings().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
     * @return  -
	 */
	public List<String> getEncodings() {
		if (encodings == null) {
			encodings = new ArrayList<>();
		}
		return this.encodings;
	}

	/**
	 * Ruft den Wert der reboot-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isReboot() {
		return reboot;
	}

	/**
	 * Legt den Wert der reboot-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setReboot(boolean value) {
		this.reboot = value;
	}

	/**
	 * Ruft den Wert der description-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Legt den Wert der description-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoSourceModeExtension }
	 * 
	 */
	public VideoSourceModeExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link VideoSourceModeExtension }
	 * 
	 */
	public void setExtension(VideoSourceModeExtension value) {
		this.extension = value;
	}

	/**
	 * Ruft den Wert der token-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Legt den Wert der token-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToken(String value) {
		this.token = value;
	}

	/**
	 * Ruft den Wert der enabled-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isEnabled() {
		return enabled;
	}

	/**
	 * Legt den Wert der enabled-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setEnabled(Boolean value) {
		this.enabled = value;
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
