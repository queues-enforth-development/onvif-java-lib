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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Java-Klasse f�r IPv6NetworkInterfaceSetConfiguration complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="IPv6NetworkInterfaceSetConfiguration">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AcceptRouterAdvert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DHCP" type="{http://www.onvif.org/ver10/schema}IPv6DHCPConfiguration" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv6NetworkInterfaceSetConfiguration", propOrder = { "enabled", "acceptRouterAdvert", "manual", "dhcp" })
public class IPv6NetworkInterfaceSetConfiguration {

    /**
     *
     */
    @XmlElement(name = "Enabled")
	protected Boolean enabled;

    /**
     *
     */
    @XmlElement(name = "AcceptRouterAdvert")
	protected Boolean acceptRouterAdvert;

    /**
     *
     */
    @XmlElement(name = "Manual")
	protected List<PrefixedIPv6Address> manual;

    /**
     *
     */
    @XmlElement(name = "DHCP")
	protected IPv6DHCPConfiguration dhcp;

	/**
	 * Ruft den Wert der enabled-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isEnabled() {
		return enabled;
	}

	/**
	 * Legt den Wert der enabled-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setEnabled(Boolean value) {
		this.enabled = value;
	}

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
	 * Gets the value of the manual property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the manual property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getManual().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link PrefixedIPv6Address }
	 * 
	 * 
     * @return  -
	 */
	public List<PrefixedIPv6Address> getManual() {
		if (manual == null) {
			manual = new ArrayList<>();
		}
		return this.manual;
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

}
