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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r DeviceCapabilities complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceCapabilities">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="Network" type="{http://www.onvif.org/ver10/schema}NetworkCapabilities" minOccurs="0"/>
 *         <element name="System" type="{http://www.onvif.org/ver10/schema}SystemCapabilities" minOccurs="0"/>
 *         <element name="IO" type="{http://www.onvif.org/ver10/schema}IOCapabilities" minOccurs="0"/>
 *         <element name="Security" type="{http://www.onvif.org/ver10/schema}SecurityCapabilities" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}DeviceCapabilitiesExtension" minOccurs="0"/>
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
@XmlType(name = "DeviceCapabilities", propOrder = { "xAddr", "network", "system", "io", "security", "extension" })
public class DeviceCapabilities {

    /**
     *
     */
    @XmlElement(name = "XAddr", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String xAddr;

    /**
     *
     */
    @XmlElement(name = "Network")
	protected NetworkCapabilities network;

    /**
     *
     */
    @XmlElement(name = "System")
	protected SystemCapabilities system;

    /**
     *
     */
    @XmlElement(name = "IO")
	protected IOCapabilities io;

    /**
     *
     */
    @XmlElement(name = "Security")
	protected SecurityCapabilities security;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected DeviceCapabilitiesExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der xAddr-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXAddr() {
		return xAddr;
	}

	/**
	 * Legt den Wert der xAddr-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXAddr(String value) {
		this.xAddr = value;
	}

	/**
	 * Ruft den Wert der network-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkCapabilities }
	 * 
	 */
	public NetworkCapabilities getNetwork() {
		return network;
	}

	/**
	 * Legt den Wert der network-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkCapabilities }
	 * 
	 */
	public void setNetwork(NetworkCapabilities value) {
		this.network = value;
	}

	/**
	 * Ruft den Wert der system-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SystemCapabilities }
	 * 
	 */
	public SystemCapabilities getSystem() {
		return system;
	}

	/**
	 * Legt den Wert der system-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SystemCapabilities }
	 * 
	 */
	public void setSystem(SystemCapabilities value) {
		this.system = value;
	}

	/**
	 * Ruft den Wert der io-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IOCapabilities }
	 * 
	 */
	public IOCapabilities getIO() {
		return io;
	}

	/**
	 * Legt den Wert der io-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link IOCapabilities }
	 * 
	 */
	public void setIO(IOCapabilities value) {
		this.io = value;
	}

	/**
	 * Ruft den Wert der security-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SecurityCapabilities }
	 * 
	 */
	public SecurityCapabilities getSecurity() {
		return security;
	}

	/**
	 * Legt den Wert der security-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SecurityCapabilities }
	 * 
	 */
	public void setSecurity(SecurityCapabilities value) {
		this.security = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DeviceCapabilitiesExtension }
	 * 
	 */
	public DeviceCapabilitiesExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DeviceCapabilitiesExtension }
	 * 
	 */
	public void setExtension(DeviceCapabilitiesExtension value) {
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
