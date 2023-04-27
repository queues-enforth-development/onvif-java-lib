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
 * Description of a pane layout describing a complete display layout.
 * 
 * 
 * Java-Klasse f�r PaneLayoutOptions complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PaneLayoutOptions">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Area" type="{http://www.onvif.org/ver10/schema}Rectangle" maxOccurs="unbounded"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PaneOptionExtension" minOccurs="0"/>
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
@XmlType(name = "PaneLayoutOptions", propOrder = { "area", "extension" })
public class PaneLayoutOptions {

    /**
     *
     */
    @XmlElement(name = "Area", required = true)
	protected List<Rectangle> area;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected PaneOptionExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the area property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the area property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getArea().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Rectangle }
	 * 
	 * 
     * @return  -
	 */
	public List<Rectangle> getArea() {
		if (area == null) {
			area = new ArrayList<>();
		}
		return this.area;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PaneOptionExtension }
	 * 
	 */
	public PaneOptionExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link PaneOptionExtension }
	 * 
	 */
	public void setExtension(PaneOptionExtension value) {
		this.extension = value;
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
