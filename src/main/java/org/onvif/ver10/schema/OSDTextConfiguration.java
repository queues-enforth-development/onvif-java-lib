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
 * Java-Klasse f�r OSDTextConfiguration complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="OSDTextConfiguration">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="FontColor" type="{http://www.onvif.org/ver10/schema}OSDColor" minOccurs="0"/>
 *         <element name="BackgroundColor" type="{http://www.onvif.org/ver10/schema}OSDColor" minOccurs="0"/>
 *         <element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDTextConfigurationExtension" minOccurs="0"/>
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
@XmlType(name = "OSDTextConfiguration", propOrder = { "type", "dateFormat", "timeFormat", "fontSize", "fontColor", "backgroundColor", "plainText", "extension" })
public class OSDTextConfiguration {

    /**
     *
     */
    @XmlElement(name = "Type", required = true)
	protected String type;

    /**
     *
     */
    @XmlElement(name = "DateFormat")
	protected String dateFormat;

    /**
     *
     */
    @XmlElement(name = "TimeFormat")
	protected String timeFormat;

    /**
     *
     */
    @XmlElement(name = "FontSize")
	protected Integer fontSize;

    /**
     *
     */
    @XmlElement(name = "FontColor")
	protected OSDColor fontColor;

    /**
     *
     */
    @XmlElement(name = "BackgroundColor")
	protected OSDColor backgroundColor;

    /**
     *
     */
    @XmlElement(name = "PlainText")
	protected String plainText;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected OSDTextConfigurationExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der type-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Legt den Wert der type-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Ruft den Wert der dateFormat-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * Legt den Wert der dateFormat-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDateFormat(String value) {
		this.dateFormat = value;
	}

	/**
	 * Ruft den Wert der timeFormat-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTimeFormat() {
		return timeFormat;
	}

	/**
	 * Legt den Wert der timeFormat-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTimeFormat(String value) {
		this.timeFormat = value;
	}

	/**
	 * Ruft den Wert der fontSize-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getFontSize() {
		return fontSize;
	}

	/**
	 * Legt den Wert der fontSize-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setFontSize(Integer value) {
		this.fontSize = value;
	}

	/**
	 * Ruft den Wert der fontColor-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDColor }
	 * 
	 */
	public OSDColor getFontColor() {
		return fontColor;
	}

	/**
	 * Legt den Wert der fontColor-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OSDColor }
	 * 
	 */
	public void setFontColor(OSDColor value) {
		this.fontColor = value;
	}

	/**
	 * Ruft den Wert der backgroundColor-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDColor }
	 * 
	 */
	public OSDColor getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * Legt den Wert der backgroundColor-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OSDColor }
	 * 
	 */
	public void setBackgroundColor(OSDColor value) {
		this.backgroundColor = value;
	}

	/**
	 * Ruft den Wert der plainText-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPlainText() {
		return plainText;
	}

	/**
	 * Legt den Wert der plainText-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPlainText(String value) {
		this.plainText = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDTextConfigurationExtension }
	 * 
	 */
	public OSDTextConfigurationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OSDTextConfigurationExtension }
	 * 
	 */
	public void setExtension(OSDTextConfigurationExtension value) {
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
