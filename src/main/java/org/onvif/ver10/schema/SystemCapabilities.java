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
 * Java-Klasse f�r SystemCapabilities complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="SystemCapabilities">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="DiscoveryResolve" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="DiscoveryBye" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="RemoteDiscovery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="FirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SupportedVersions" type="{http://www.onvif.org/ver10/schema}OnvifVersion" maxOccurs="unbounded"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}SystemCapabilitiesExtension" minOccurs="0"/>
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
@XmlType(name = "SystemCapabilities", propOrder = { "discoveryResolve", "discoveryBye", "remoteDiscovery", "systemBackup", "systemLogging", "firmwareUpgrade",
		"supportedVersions", "extension" })
public class SystemCapabilities {

    /**
     *
     */
    @XmlElement(name = "DiscoveryResolve")
	protected boolean discoveryResolve;

    /**
     *
     */
    @XmlElement(name = "DiscoveryBye")
	protected boolean discoveryBye;

    /**
     *
     */
    @XmlElement(name = "RemoteDiscovery")
	protected boolean remoteDiscovery;

    /**
     *
     */
    @XmlElement(name = "SystemBackup")
	protected boolean systemBackup;

    /**
     *
     */
    @XmlElement(name = "SystemLogging")
	protected boolean systemLogging;

    /**
     *
     */
    @XmlElement(name = "FirmwareUpgrade")
	protected boolean firmwareUpgrade;

    /**
     *
     */
    @XmlElement(name = "SupportedVersions", required = true)
	protected List<OnvifVersion> supportedVersions;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected SystemCapabilitiesExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der discoveryResolve-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isDiscoveryResolve() {
		return discoveryResolve;
	}

	/**
	 * Legt den Wert der discoveryResolve-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setDiscoveryResolve(boolean value) {
		this.discoveryResolve = value;
	}

	/**
	 * Ruft den Wert der discoveryBye-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isDiscoveryBye() {
		return discoveryBye;
	}

	/**
	 * Legt den Wert der discoveryBye-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setDiscoveryBye(boolean value) {
		this.discoveryBye = value;
	}

	/**
	 * Ruft den Wert der remoteDiscovery-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isRemoteDiscovery() {
		return remoteDiscovery;
	}

	/**
	 * Legt den Wert der remoteDiscovery-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setRemoteDiscovery(boolean value) {
		this.remoteDiscovery = value;
	}

	/**
	 * Ruft den Wert der systemBackup-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isSystemBackup() {
		return systemBackup;
	}

	/**
	 * Legt den Wert der systemBackup-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setSystemBackup(boolean value) {
		this.systemBackup = value;
	}

	/**
	 * Ruft den Wert der systemLogging-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isSystemLogging() {
		return systemLogging;
	}

	/**
	 * Legt den Wert der systemLogging-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setSystemLogging(boolean value) {
		this.systemLogging = value;
	}

	/**
	 * Ruft den Wert der firmwareUpgrade-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isFirmwareUpgrade() {
		return firmwareUpgrade;
	}

	/**
	 * Legt den Wert der firmwareUpgrade-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setFirmwareUpgrade(boolean value) {
		this.firmwareUpgrade = value;
	}

	/**
	 * Gets the value of the supportedVersions property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the supportedVersions property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getSupportedVersions().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link OnvifVersion }
	 * 
	 * 
     * @return 
	 */
	public List<OnvifVersion> getSupportedVersions() {
		if (supportedVersions == null) {
			supportedVersions = new ArrayList<>();
		}
		return this.supportedVersions;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SystemCapabilitiesExtension }
	 * 
	 */
	public SystemCapabilitiesExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SystemCapabilitiesExtension }
	 * 
	 */
	public void setExtension(SystemCapabilitiesExtension value) {
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
