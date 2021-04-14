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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r Dot11PSKSet complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Dot11PSKSet">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Key" type="{http://www.onvif.org/ver10/schema}Dot11PSK" minOccurs="0"/>
 *         <element name="Passphrase" type="{http://www.onvif.org/ver10/schema}Dot11PSKPassphrase" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}Dot11PSKSetExtension" minOccurs="0"/>
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
@XmlType(name = "Dot11PSKSet", propOrder = { "key", "passphrase", "extension" })
public class Dot11PSKSet {

    /**
     *
     */
    @XmlElement(name = "Key", type = String.class)
	@XmlJavaTypeAdapter(HexBinaryAdapter.class)
	protected byte[] key;

    /**
     *
     */
    @XmlElement(name = "Passphrase")
	protected String passphrase;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected Dot11PSKSetExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der key-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public byte[] getKey() {
		return key;
	}

	/**
	 * Legt den Wert der key-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setKey(byte[] value) {
		this.key = value;
	}

	/**
	 * Ruft den Wert der passphrase-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassphrase() {
		return passphrase;
	}

	/**
	 * Legt den Wert der passphrase-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassphrase(String value) {
		this.passphrase = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot11PSKSetExtension }
	 * 
	 */
	public Dot11PSKSetExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11PSKSetExtension }
	 * 
	 */
	public void setExtension(Dot11PSKSetExtension value) {
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
