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
 * Java-Klasse f�r ObjectTree complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ObjectTree">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Rename" type="{http://www.onvif.org/ver10/schema}Rename" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Split" type="{http://www.onvif.org/ver10/schema}Split" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Merge" type="{http://www.onvif.org/ver10/schema}Merge" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Delete" type="{http://www.onvif.org/ver10/schema}ObjectId" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ObjectTreeExtension" minOccurs="0"/>
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
@XmlType(name = "ObjectTree", propOrder = { "rename", "split", "merge", "delete", "extension" })
public class ObjectTree {

    /**
     *
     */
    @XmlElement(name = "Rename")
	protected List<Rename> rename;

    /**
     *
     */
    @XmlElement(name = "Split")
	protected List<Split> split;

    /**
     *
     */
    @XmlElement(name = "Merge")
	protected List<Merge> merge;

    /**
     *
     */
    @XmlElement(name = "Delete")
	protected List<ObjectId> delete;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected ObjectTreeExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the rename property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the rename property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getRename().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Rename }
	 * 
	 * 
     * @return  -
	 */
	public List<Rename> getRename() {
		if (rename == null) {
			rename = new ArrayList<>();
		}
		return this.rename;
	}

	/**
	 * Gets the value of the split property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the split property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getSplit().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Split }
	 * 
	 * 
     * @return  -
	 */
	public List<Split> getSplit() {
		if (split == null) {
			split = new ArrayList<>();
		}
		return this.split;
	}

	/**
	 * Gets the value of the merge property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the merge property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getMerge().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Merge }
	 * 
	 * 
     * @return  -
	 */
	public List<Merge> getMerge() {
		if (merge == null) {
			merge = new ArrayList<>();
		}
		return this.merge;
	}

	/**
	 * Gets the value of the delete property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the delete property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getDelete().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ObjectId }
	 * 
	 * 
     * @return  -
	 */
	public List<ObjectId> getDelete() {
		if (delete == null) {
			delete = new ArrayList<>();
		}
		return this.delete;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ObjectTreeExtension }
	 * 
	 */
	public ObjectTreeExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link ObjectTreeExtension }
	 * 
	 */
	public void setExtension(ObjectTreeExtension value) {
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
