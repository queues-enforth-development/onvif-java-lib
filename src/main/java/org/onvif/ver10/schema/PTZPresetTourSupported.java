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
 * Java-Klasse f�r PTZPresetTourSupported complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PTZPresetTourSupported">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="MaximumNumberOfPresetTours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="PTZPresetTourOperation" type="{http://www.onvif.org/ver10/schema}PTZPresetTourOperation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSupportedExtension" minOccurs="0"/>
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
@XmlType(name = "PTZPresetTourSupported", propOrder = { "maximumNumberOfPresetTours", "ptzPresetTourOperation", "extension" })
public class PTZPresetTourSupported {

    /**
     *
     */
    @XmlElement(name = "MaximumNumberOfPresetTours")
	protected int maximumNumberOfPresetTours;

    /**
     *
     */
    @XmlElement(name = "PTZPresetTourOperation")
	protected List<PTZPresetTourOperation> ptzPresetTourOperation;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected PTZPresetTourSupportedExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der maximumNumberOfPresetTours-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getMaximumNumberOfPresetTours() {
		return maximumNumberOfPresetTours;
	}

	/**
	 * Legt den Wert der maximumNumberOfPresetTours-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setMaximumNumberOfPresetTours(int value) {
		this.maximumNumberOfPresetTours = value;
	}

	/**
	 * Gets the value of the ptzPresetTourOperation property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the ptzPresetTourOperation property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getPTZPresetTourOperation().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PTZPresetTourOperation }
	 * 
	 * 
     * @return  -
	 */
	public List<PTZPresetTourOperation> getPTZPresetTourOperation() {
		if (ptzPresetTourOperation == null) {
			ptzPresetTourOperation = new ArrayList<>();
		}
		return this.ptzPresetTourOperation;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZPresetTourSupportedExtension }
	 * 
	 */
	public PTZPresetTourSupportedExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link PTZPresetTourSupportedExtension }
	 * 
	 */
	public void setExtension(PTZPresetTourSupportedExtension value) {
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
