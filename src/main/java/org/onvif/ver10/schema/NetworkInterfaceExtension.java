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
 * 
 * Java-Klasse f�r NetworkInterfaceExtension complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="NetworkInterfaceExtension">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
           <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InterfaceType" type="{http://www.onvif.org/ver10/schema}IANA-IfTypes"/>
 *         <element name="Dot3" type="{http://www.onvif.org/ver10/schema}Dot3Configuration" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dot11" type="{http://www.onvif.org/ver10/schema}Dot11Configuration" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceExtension2" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceExtension", propOrder = { "any", "interfaceType", "dot3", "dot11", "extension" })
public class NetworkInterfaceExtension {

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;

    /**
     *
     */
    @XmlElement(name = "InterfaceType")
	protected int interfaceType;

    /**
     *
     */
    @XmlElement(name = "Dot3")
	protected List<Dot3Configuration> dot3;

    /**
     *
     */
    @XmlElement(name = "Dot11")
	protected List<Dot11Configuration> dot11;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected NetworkInterfaceExtension2 extension;

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
	 * Ruft den Wert der interfaceType-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getInterfaceType() {
		return interfaceType;
	}

	/**
	 * Legt den Wert der interfaceType-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setInterfaceType(int value) {
		this.interfaceType = value;
	}

	/**
	 * Gets the value of the dot3 property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the dot3 property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getDot3().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Dot3Configuration }
	 * 
	 * 
     * @return  -
	 */
	public List<Dot3Configuration> getDot3() {
		if (dot3 == null) {
			dot3 = new ArrayList<>();
		}
		return this.dot3;
	}

	/**
	 * Gets the value of the dot11 property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the dot11 property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getDot11().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Dot11Configuration }
	 * 
	 * 
     * @return  -
	 */
	public List<Dot11Configuration> getDot11() {
		if (dot11 == null) {
			dot11 = new ArrayList<>();
		}
		return this.dot11;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceExtension2 }
	 * 
	 */
	public NetworkInterfaceExtension2 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link NetworkInterfaceExtension2 }
	 * 
	 */
	public void setExtension(NetworkInterfaceExtension2 value) {
		this.extension = value;
	}

}
