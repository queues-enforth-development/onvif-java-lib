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
 * Java-Klasse f�r IPv4Configuration complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="IPv4Configuration">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LinkLocal" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" minOccurs="0"/>
 *         <element name="FromDHCP" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" minOccurs="0"/>
 *         <element name="DHCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "IPv4Configuration", propOrder = { "manual", "linkLocal", "fromDHCP", "dhcp", "any" })
public class IPv4Configuration {

    /**
     *
     */
    @XmlElement(name = "Manual")
	protected List<PrefixedIPv4Address> manual;

    /**
     *
     */
    @XmlElement(name = "LinkLocal")
	protected PrefixedIPv4Address linkLocal;

    /**
     *
     */
    @XmlElement(name = "FromDHCP")
	protected PrefixedIPv4Address fromDHCP;

    /**
     *
     */
    @XmlElement(name = "DHCP")
	protected boolean dhcp;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
	 * Objects of the following type(s) are allowed in the list {@link PrefixedIPv4Address }
	 * 
	 * 
     * @return  -
	 */
	public List<PrefixedIPv4Address> getManual() {
		if (manual == null) {
			manual = new ArrayList<>();
		}
		return this.manual;
	}

	/**
	 * Ruft den Wert der linkLocal-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PrefixedIPv4Address }
	 * 
	 */
	public PrefixedIPv4Address getLinkLocal() {
		return linkLocal;
	}

	/**
	 * Legt den Wert der linkLocal-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link PrefixedIPv4Address }
	 * 
	 */
	public void setLinkLocal(PrefixedIPv4Address value) {
		this.linkLocal = value;
	}

	/**
	 * Ruft den Wert der fromDHCP-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PrefixedIPv4Address }
	 * 
	 */
	public PrefixedIPv4Address getFromDHCP() {
		return fromDHCP;
	}

	/**
	 * Legt den Wert der fromDHCP-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link PrefixedIPv4Address }
	 * 
	 */
	public void setFromDHCP(PrefixedIPv4Address value) {
		this.fromDHCP = value;
	}

	/**
	 * Ruft den Wert der dhcp-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isDHCP() {
		return dhcp;
	}

	/**
	 * Legt den Wert der dhcp-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setDHCP(boolean value) {
		this.dhcp = value;
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
