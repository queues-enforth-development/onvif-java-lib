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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * 
 * Java-Klasse f�r OSDTextOptions complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="OSDTextOptions">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="FontSizeRange" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/>
 *         <element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FontColor" type="{http://www.onvif.org/ver10/schema}OSDColorOptions" minOccurs="0"/>
 *         <element name="BackgroundColor" type="{http://www.onvif.org/ver10/schema}OSDColorOptions" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDTextOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "OSDTextOptions", propOrder = { "type", "fontSizeRange", "dateFormat", "timeFormat", "fontColor", "backgroundColor", "extension" })
public class OSDTextOptions {

    /**
     *
     */
    @XmlElement(name = "Type", required = true)
	protected List<String> type;

    /**
     *
     */
    @XmlElement(name = "FontSizeRange")
	protected IntRange fontSizeRange;

    /**
     *
     */
    @XmlElement(name = "DateFormat")
	protected List<String> dateFormat;

    /**
     *
     */
    @XmlElement(name = "TimeFormat")
	protected List<String> timeFormat;

    /**
     *
     */
    @XmlElement(name = "FontColor")
	protected OSDColorOptions fontColor;

    /**
     *
     */
    @XmlElement(name = "BackgroundColor")
	protected OSDColorOptions backgroundColor;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected OSDTextOptionsExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the type property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the type property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getType().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
     * @return  -
	 */
	public List<String> getType() {
		if (type == null) {
			type = new ArrayList<>();
		}
		return this.type;
	}

	/**
	 * Ruft den Wert der fontSizeRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getFontSizeRange() {
		return fontSizeRange;
	}

	/**
	 * Legt den Wert der fontSizeRange-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setFontSizeRange(IntRange value) {
		this.fontSizeRange = value;
	}

	/**
	 * Gets the value of the dateFormat property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the dateFormat property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getDateFormat().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
     * @return  -
	 */
	public List<String> getDateFormat() {
		if (dateFormat == null) {
			dateFormat = new ArrayList<>();
		}
		return this.dateFormat;
	}

	/**
	 * Gets the value of the timeFormat property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the timeFormat property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getTimeFormat().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
     * @return  -
	 */
	public List<String> getTimeFormat() {
		if (timeFormat == null) {
			timeFormat = new ArrayList<>();
		}
		return this.timeFormat;
	}

	/**
	 * Ruft den Wert der fontColor-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDColorOptions }
	 * 
	 */
	public OSDColorOptions getFontColor() {
		return fontColor;
	}

	/**
	 * Legt den Wert der fontColor-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link OSDColorOptions }
	 * 
	 */
	public void setFontColor(OSDColorOptions value) {
		this.fontColor = value;
	}

	/**
	 * Ruft den Wert der backgroundColor-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDColorOptions }
	 * 
	 */
	public OSDColorOptions getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * Legt den Wert der backgroundColor-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link OSDColorOptions }
	 * 
	 */
	public void setBackgroundColor(OSDColorOptions value) {
		this.backgroundColor = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDTextOptionsExtension }
	 * 
	 */
	public OSDTextOptionsExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link OSDTextOptionsExtension }
	 * 
	 */
	public void setExtension(OSDTextOptionsExtension value) {
		this.extension = value;
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
