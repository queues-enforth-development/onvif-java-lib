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
 * <p>
 * Java-Klasse f�r IPAddressFilter complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="IPAddressFilter">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}IPAddressFilterType"/>
 *         <element name="IPv4Address" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IPv6Address" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}IPAddressFilterExtension" minOccurs="0"/>
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
@XmlType(name = "IPAddressFilter", propOrder = { "type", "iPv4Address", "iPv6Address", "extension" })
public class IPAddressFilter {

    /**
     *
     */
    @XmlElement(name = "Type", required = true)
	protected IPAddressFilterType type;

    /**
     *
     */
    @XmlElement(name = "IPv4Address")
	protected List<PrefixedIPv4Address> iPv4Address;

    /**
     *
     */
    @XmlElement(name = "IPv6Address")
	protected List<PrefixedIPv6Address> iPv6Address;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected IPAddressFilterExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der type-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IPAddressFilterType }
	 * 
	 */
	public IPAddressFilterType getType() {
		return type;
	}

	/**
	 * Legt den Wert der type-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IPAddressFilterType }
	 * 
	 */
	public void setType(IPAddressFilterType value) {
		this.type = value;
	}

	/**
	 * Gets the value of the iPv4Address property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the iPv4Address property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getIPv4Address().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PrefixedIPv4Address }
	 * 
	 * 
     * @return 
	 */
	public List<PrefixedIPv4Address> getIPv4Address() {
		if (iPv4Address == null) {
			iPv4Address = new ArrayList<>();
		}
		return this.iPv4Address;
	}

	/**
	 * Gets the value of the iPv6Address property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the iPv6Address property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getIPv6Address().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PrefixedIPv6Address }
	 * 
	 * 
     * @return 
	 */
	public List<PrefixedIPv6Address> getIPv6Address() {
		if (iPv6Address == null) {
			iPv6Address = new ArrayList<>();
		}
		return this.iPv6Address;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IPAddressFilterExtension }
	 * 
	 */
	public IPAddressFilterExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IPAddressFilterExtension }
	 * 
	 */
	public void setExtension(IPAddressFilterExtension value) {
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
