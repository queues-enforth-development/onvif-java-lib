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
 * 
 * Java-Klasse f�r AnalyticsEngineInput complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="AnalyticsEngineInput">
     <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
         <sequence>
 *         <element name="SourceIdentification" type="{http://www.onvif.org/ver10/schema}SourceIdentification"/>
 *         <element name="VideoInput" type="{http://www.onvif.org/ver10/schema}VideoEncoderConfiguration"/>
 *         <element name="MetadataInput" type="{http://www.onvif.org/ver10/schema}MetadataInput"/>
           <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AnalyticsEngineInput", propOrder = { "sourceIdentification", "videoInput", "metadataInput", "any" })
public class AnalyticsEngineInput extends ConfigurationEntity {

    /**
     *
     */
    @XmlElement(name = "SourceIdentification", required = true)
	protected SourceIdentification sourceIdentification;

    /**
     *
     */
    @XmlElement(name = "VideoInput", required = true)
	protected VideoEncoderConfiguration videoInput;

    /**
     *
     */
    @XmlElement(name = "MetadataInput", required = true)
	protected MetadataInput metadataInput;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der sourceIdentification-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SourceIdentification }
	 * 
	 */
	public SourceIdentification getSourceIdentification() {
		return sourceIdentification;
	}

	/**
	 * Legt den Wert der sourceIdentification-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link SourceIdentification }
	 * 
	 */
	public void setSourceIdentification(SourceIdentification value) {
		this.sourceIdentification = value;
	}

	/**
	 * Ruft den Wert der videoInput-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoEncoderConfiguration }
	 * 
	 */
	public VideoEncoderConfiguration getVideoInput() {
		return videoInput;
	}

	/**
	 * Legt den Wert der videoInput-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link VideoEncoderConfiguration }
	 * 
	 */
	public void setVideoInput(VideoEncoderConfiguration value) {
		this.videoInput = value;
	}

	/**
	 * Ruft den Wert der metadataInput-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MetadataInput }
	 * 
	 */
	public MetadataInput getMetadataInput() {
		return metadataInput;
	}

	/**
	 * Legt den Wert der metadataInput-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link MetadataInput }
	 * 
	 */
	public void setMetadataInput(MetadataInput value) {
		this.metadataInput = value;
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
