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
 * 
 * Java-Klasse f�r ShapeDescriptor complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ShapeDescriptor">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="BoundingBox" type="{http://www.onvif.org/ver10/schema}Rectangle"/>
 *         <element name="CenterOfGravity" type="{http://www.onvif.org/ver10/schema}Vector"/>
 *         <element name="Polygon" type="{http://www.onvif.org/ver10/schema}Polygon" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ShapeDescriptorExtension" minOccurs="0"/>
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
@XmlType(name = "ShapeDescriptor", propOrder = { "boundingBox", "centerOfGravity", "polygon", "extension" })
public class ShapeDescriptor {

    /**
     *
     */
    @XmlElement(name = "BoundingBox", required = true)
	protected Rectangle boundingBox;

    /**
     *
     */
    @XmlElement(name = "CenterOfGravity", required = true)
	protected Vector centerOfGravity;

    /**
     *
     */
    @XmlElement(name = "Polygon")
	protected List<Polygon> polygon;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected ShapeDescriptorExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der boundingBox-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Rectangle }
	 * 
	 */
	public Rectangle getBoundingBox() {
		return boundingBox;
	}

	/**
	 * Legt den Wert der boundingBox-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Rectangle }
	 * 
	 */
	public void setBoundingBox(Rectangle value) {
		this.boundingBox = value;
	}

	/**
	 * Ruft den Wert der centerOfGravity-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Vector }
	 * 
	 */
	public Vector getCenterOfGravity() {
		return centerOfGravity;
	}

	/**
	 * Legt den Wert der centerOfGravity-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Vector }
	 * 
	 */
	public void setCenterOfGravity(Vector value) {
		this.centerOfGravity = value;
	}

	/**
	 * Gets the value of the polygon property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the polygon property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getPolygon().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Polygon }
	 * 
	 * 
     * @return  -
	 */
	public List<Polygon> getPolygon() {
		if (polygon == null) {
			polygon = new ArrayList<>();
		}
		return this.polygon;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ShapeDescriptorExtension }
	 * 
	 */
	public ShapeDescriptorExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link ShapeDescriptorExtension }
	 * 
	 */
	public void setExtension(ShapeDescriptorExtension value) {
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
