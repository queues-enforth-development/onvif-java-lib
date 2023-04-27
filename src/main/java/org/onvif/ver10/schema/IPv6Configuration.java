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
 * Java-Klasse f�r IPv6Configuration complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="IPv6Configuration">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="AcceptRouterAdvert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DHCP" type="{http://www.onvif.org/ver10/schema}IPv6DHCPConfiguration"/>
 *         <element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LinkLocal" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FromDHCP" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FromRA" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}IPv6ConfigurationExtension" minOccurs="0"/>
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
@XmlType(name = "IPv6Configuration", propOrder = { "acceptRouterAdvert", "dhcp", "manual", "linkLocal", "fromDHCP", "fromRA", "extension" })
public class IPv6Configuration {

    /**
     *
     */
    @XmlElement(name = "AcceptRouterAdvert")
	protected Boolean acceptRouterAdvert;

    /**
     *
     */
    @XmlElement(name = "DHCP", required = true)
	protected IPv6DHCPConfiguration dhcp;

    /**
     *
     */
    @XmlElement(name = "Manual")
	protected List<PrefixedIPv6Address> manual;

    /**
     *
     */
    @XmlElement(name = "LinkLocal")
	protected List<PrefixedIPv6Address> linkLocal;

    /**
     *
     */
    @XmlElement(name = "FromDHCP")
	protected List<PrefixedIPv6Address> fromDHCP;

    /**
     *
     */
    @XmlElement(name = "FromRA")
	protected List<PrefixedIPv6Address> fromRA;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected IPv6ConfigurationExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der acceptRouterAdvert-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isAcceptRouterAdvert() {
		return acceptRouterAdvert;
	}

	/**
	 * Legt den Wert der acceptRouterAdvert-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setAcceptRouterAdvert(Boolean value) {
		this.acceptRouterAdvert = value;
	}

	/**
	 * Ruft den Wert der dhcp-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IPv6DHCPConfiguration }
	 * 
	 */
	public IPv6DHCPConfiguration getDHCP() {
		return dhcp;
	}

	/**
	 * Legt den Wert der dhcp-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link IPv6DHCPConfiguration }
	 * 
	 */
	public void setDHCP(IPv6DHCPConfiguration value) {
		this.dhcp = value;
	}

	/**
	 * Gets the value of the manual property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the manual property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getManual().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PrefixedIPv6Address }
	 * 
	 * 
     * @return 
	 */
	public List<PrefixedIPv6Address> getManual() {
		if (manual == null) {
			manual = new ArrayList<>();
		}
		return this.manual;
	}

	/**
	 * Gets the value of the linkLocal property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the linkLocal property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getLinkLocal().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PrefixedIPv6Address }
	 * 
	 * 
     * @return 
	 */
	public List<PrefixedIPv6Address> getLinkLocal() {
		if (linkLocal == null) {
			linkLocal = new ArrayList<>();
		}
		return this.linkLocal;
	}

	/**
	 * Gets the value of the fromDHCP property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the fromDHCP property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getFromDHCP().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PrefixedIPv6Address }
	 * 
	 * 
     * @return 
	 */
	public List<PrefixedIPv6Address> getFromDHCP() {
		if (fromDHCP == null) {
			fromDHCP = new ArrayList<>();
		}
		return this.fromDHCP;
	}

	/**
	 * Gets the value of the fromRA property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the fromRA property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getFromRA().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PrefixedIPv6Address }
	 * 
	 * 
     * @return 
	 */
	public List<PrefixedIPv6Address> getFromRA() {
		if (fromRA == null) {
			fromRA = new ArrayList<>();
		}
		return this.fromRA;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IPv6ConfigurationExtension }
	 * 
	 */
	public IPv6ConfigurationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link IPv6ConfigurationExtension }
	 * 
	 */
	public void setExtension(IPv6ConfigurationExtension value) {
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
