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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r MetadataAttributes complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="MetadataAttributes">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="CanContainPTZ" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="CanContainAnalytics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="CanContainNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
           <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
 *       <attribute name="PtzSpaces" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
         <anyAttribute processContents='lax'/>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataAttributes", propOrder = { "canContainPTZ", "canContainAnalytics", "canContainNotifications", "any" })
public class MetadataAttributes {

    /**
     *
     */
    @XmlElement(name = "CanContainPTZ")
	protected boolean canContainPTZ;

    /**
     *
     */
    @XmlElement(name = "CanContainAnalytics")
	protected boolean canContainAnalytics;

    /**
     *
     */
    @XmlElement(name = "CanContainNotifications")
	protected boolean canContainNotifications;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;

    /**
     *
     */
    @XmlAttribute(name = "PtzSpaces")
	protected List<String> ptzSpaces;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der canContainPTZ-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isCanContainPTZ() {
		return canContainPTZ;
	}

	/**
	 * Legt den Wert der canContainPTZ-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setCanContainPTZ(boolean value) {
		this.canContainPTZ = value;
	}

	/**
	 * Ruft den Wert der canContainAnalytics-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isCanContainAnalytics() {
		return canContainAnalytics;
	}

	/**
	 * Legt den Wert der canContainAnalytics-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setCanContainAnalytics(boolean value) {
		this.canContainAnalytics = value;
	}

	/**
	 * Ruft den Wert der canContainNotifications-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isCanContainNotifications() {
		return canContainNotifications;
	}

	/**
	 * Legt den Wert der canContainNotifications-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setCanContainNotifications(boolean value) {
		this.canContainNotifications = value;
	}

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
	 * Gets the value of the ptzSpaces property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the ptzSpaces property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getPtzSpaces().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
     * @return 
	 */
	public List<String> getPtzSpaces() {
		if (ptzSpaces == null) {
			ptzSpaces = new ArrayList<>();
		}
		return this.ptzSpaces;
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
