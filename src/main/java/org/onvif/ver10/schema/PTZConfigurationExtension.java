//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r PTZConfigurationExtension complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PTZConfigurationExtension">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
           <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PTControlDirection" type="{http://www.onvif.org/ver10/schema}PTControlDirection" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZConfigurationExtension2" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZConfigurationExtension", propOrder = { "any", "ptControlDirection", "extension" })
public class PTZConfigurationExtension {

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;

    /**
     *
     */
    @XmlElement(name = "PTControlDirection")
	protected PTControlDirection ptControlDirection;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected PTZConfigurationExtension2 extension;

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
	 * Ruft den Wert der ptControlDirection-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTControlDirection }
	 * 
	 */
	public PTControlDirection getPTControlDirection() {
		return ptControlDirection;
	}

	/**
	 * Legt den Wert der ptControlDirection-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTControlDirection }
	 * 
	 */
	public void setPTControlDirection(PTControlDirection value) {
		this.ptControlDirection = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZConfigurationExtension2 }
	 * 
	 */
	public PTZConfigurationExtension2 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link PTZConfigurationExtension2 }
	 * 
	 */
	public void setExtension(PTZConfigurationExtension2 value) {
		this.extension = value;
	}

}
