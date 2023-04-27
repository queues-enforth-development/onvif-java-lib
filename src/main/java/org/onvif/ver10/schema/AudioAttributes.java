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
 * Java-Klasse f�r AudioAttributes complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="AudioAttributes">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Bitrate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Encoding" type="{http://www.onvif.org/ver10/schema}AudioEncoding"/>
 *         <element name="Samplerate" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "AudioAttributes", propOrder = { "bitrate", "encoding", "samplerate", "any" })
public class AudioAttributes {

    /**
     *
     */
    @XmlElement(name = "Bitrate")
	protected Integer bitrate;

    /**
     *
     */
    @XmlElement(name = "Encoding", required = true)
	protected AudioEncoding encoding;

    /**
     *
     */
    @XmlElement(name = "Samplerate")
	protected int samplerate;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der bitrate-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getBitrate() {
		return bitrate;
	}

	/**
	 * Legt den Wert der bitrate-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setBitrate(Integer value) {
		this.bitrate = value;
	}

	/**
	 * Ruft den Wert der encoding-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AudioEncoding }
	 * 
	 */
	public AudioEncoding getEncoding() {
		return encoding;
	}

	/**
	 * Legt den Wert der encoding-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link AudioEncoding }
	 * 
	 */
	public void setEncoding(AudioEncoding value) {
		this.encoding = value;
	}

	/**
	 * Ruft den Wert der samplerate-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getSamplerate() {
		return samplerate;
	}

	/**
	 * Legt den Wert der samplerate-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setSamplerate(int value) {
		this.samplerate = value;
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
