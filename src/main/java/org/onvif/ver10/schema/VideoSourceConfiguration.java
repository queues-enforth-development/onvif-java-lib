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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r VideoSourceConfiguration complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="VideoSourceConfiguration">
     <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
         <sequence>
 *         <element name="SourceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Bounds" type="{http://www.onvif.org/ver10/schema}IntRectangle"/>
           <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationExtension" minOccurs="0"/>
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
@XmlType(name = "VideoSourceConfiguration", propOrder = { "sourceToken", "bounds", "any", "extension" })
public class VideoSourceConfiguration extends ConfigurationEntity {

    /**
     *
     */
    @XmlElement(name = "SourceToken", required = true)
	protected String sourceToken;

    /**
     *
     */
    @XmlElement(name = "Bounds", required = true)
	protected IntRectangle bounds;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected VideoSourceConfigurationExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der sourceToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSourceToken() {
		return sourceToken;
	}

	/**
	 * Legt den Wert der sourceToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSourceToken(String value) {
		this.sourceToken = value;
	}

	/**
	 * Ruft den Wert der bounds-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRectangle }
	 * 
	 */
	public IntRectangle getBounds() {
		return bounds;
	}

	/**
	 * Legt den Wert der bounds-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IntRectangle }
	 * 
	 */
	public void setBounds(IntRectangle value) {
		this.bounds = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getAny().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
     * @return 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoSourceConfigurationExtension }
	 * 
	 */
	public VideoSourceConfigurationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoSourceConfigurationExtension }
	 * 
	 */
	public void setExtension(VideoSourceConfigurationExtension value) {
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
