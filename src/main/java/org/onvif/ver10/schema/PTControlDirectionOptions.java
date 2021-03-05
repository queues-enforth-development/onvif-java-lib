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
 * Java-Klasse f�r PTControlDirectionOptions complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PTControlDirectionOptions">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="EFlip" type="{http://www.onvif.org/ver10/schema}EFlipOptions" minOccurs="0"/>
 *         <element name="Reverse" type="{http://www.onvif.org/ver10/schema}ReverseOptions" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTControlDirectionOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "PTControlDirectionOptions", propOrder = { "eFlip", "reverse", "extension" })
public class PTControlDirectionOptions {

    /**
     *
     */
    @XmlElement(name = "EFlip")
	protected EFlipOptions eFlip;

    /**
     *
     */
    @XmlElement(name = "Reverse")
	protected ReverseOptions reverse;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected PTControlDirectionOptionsExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der eFlip-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EFlipOptions }
	 * 
	 */
	public EFlipOptions getEFlip() {
		return eFlip;
	}

	/**
	 * Legt den Wert der eFlip-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EFlipOptions }
	 * 
	 */
	public void setEFlip(EFlipOptions value) {
		this.eFlip = value;
	}

	/**
	 * Ruft den Wert der reverse-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ReverseOptions }
	 * 
	 */
	public ReverseOptions getReverse() {
		return reverse;
	}

	/**
	 * Legt den Wert der reverse-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ReverseOptions }
	 * 
	 */
	public void setReverse(ReverseOptions value) {
		this.reverse = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTControlDirectionOptionsExtension }
	 * 
	 */
	public PTControlDirectionOptionsExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTControlDirectionOptionsExtension }
	 * 
	 */
	public void setExtension(PTControlDirectionOptionsExtension value) {
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
