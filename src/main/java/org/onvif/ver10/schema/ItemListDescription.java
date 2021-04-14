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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * 
 * Describes a list of items. Each item in the list shall have a unique name. The list is designed as linear structure without optional or unbounded elements. Use ElementItems only
 * when complex structures are inevitable.
 * 
 * 
 * <p>
 * Java-Klasse f�r ItemListDescription complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ItemListDescription">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="SimpleItemDescription" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
               <complexContent>
                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
                 </restriction>
               </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ElementItemDescription" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
               <complexContent>
                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
                 </restriction>
               </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ItemListDescriptionExtension" minOccurs="0"/>
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
@XmlType(name = "ItemListDescription", propOrder = { "simpleItemDescription", "elementItemDescription", "extension" })
public class ItemListDescription {

    /**
     *
     */
    @XmlElement(name = "SimpleItemDescription")
	protected List<ItemListDescription.SimpleItemDescription> simpleItemDescription;

    /**
     *
     */
    @XmlElement(name = "ElementItemDescription")
	protected List<ItemListDescription.ElementItemDescription> elementItemDescription;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected ItemListDescriptionExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the simpleItemDescription property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the simpleItemDescription property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getSimpleItemDescription().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ItemListDescription.SimpleItemDescription }
	 * 
	 * 
     * @return 
	 */
	public List<ItemListDescription.SimpleItemDescription> getSimpleItemDescription() {
		if (simpleItemDescription == null) {
			simpleItemDescription = new ArrayList<>();
		}
		return this.simpleItemDescription;
	}

	/**
	 * Gets the value of the elementItemDescription property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the elementItemDescription property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getElementItemDescription().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ItemListDescription.ElementItemDescription }
	 * 
	 * 
     * @return 
	 */
	public List<ItemListDescription.ElementItemDescription> getElementItemDescription() {
		if (elementItemDescription == null) {
			elementItemDescription = new ArrayList<>();
		}
		return this.elementItemDescription;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ItemListDescriptionExtension }
	 * 
	 */
	public ItemListDescriptionExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ItemListDescriptionExtension }
	 * 
	 */
	public void setExtension(ItemListDescriptionExtension value) {
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

	/**
	 * <p>
	 * Java-Class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment indicates the expected content contained in this class.
	 * 
	 * <pre>{@code
	   <complexType>
	     <complexContent>
	       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *       <attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
	       </restriction>
	     </complexContent>
	   </complexType>
	 * }</pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class ElementItemDescription {

        /**
         *
         */
        @XmlAttribute(name = "Name", required = true)
		protected String name;

        /**
         *
         */
        @XmlAttribute(name = "Type", required = true)
		protected QName type;

		/**
		 * Ruft den Wert der name-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getName() {
			return name;
		}

		/**
		 * Legt den Wert der name-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setName(String value) {
			this.name = value;
		}

		/**
		 * Ruft den Wert der type-Eigenschaft ab.
		 * 
		 * @return possible object is {@link QName }
		 * 
		 */
		public QName getType() {
			return type;
		}

		/**
		 * Legt den Wert der type-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link QName }
		 * 
		 */
		public void setType(QName value) {
			this.type = value;
		}

	}

	/**
	 * <p>
	 * Java-Class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment indicates the expected content contained in this class.
	 * 
	 * <pre>{@code
	   <complexType>
	     <complexContent>
	       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       <attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *       <attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
	       </restriction>
	     </complexContent>
	   </complexType>
	 * }</pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class SimpleItemDescription {

        /**
         *
         */
        @XmlAttribute(name = "Name", required = true)
		protected String name;

        /**
         *
         */
        @XmlAttribute(name = "Type", required = true)
		protected QName type;

		/**
		 * Ruft den Wert der name-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getName() {
			return name;
		}

		/**
		 * Legt den Wert der name-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setName(String value) {
			this.name = value;
		}

		/**
		 * Ruft den Wert der type-Eigenschaft ab.
		 * 
		 * @return possible object is {@link QName }
		 * 
		 */
		public QName getType() {
			return type;
		}

		/**
		 * Legt den Wert der type-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link QName }
		 * 
		 */
		public void setType(QName value) {
			this.type = value;
		}

	}

}
