//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r Config complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Config">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Parameters" type="{http://www.onvif.org/ver10/schema}ItemList"/>
         </sequence>
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
@XmlType(name = "Config", propOrder = { "parameters" })
public class Config {

    /**
     *
     */
    @XmlElement(name = "Parameters", required = true)
	protected ItemList parameters;

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
	 * Ruft den Wert der parameters-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ItemList }
	 * 
	 */
	public ItemList getParameters() {
		return parameters;
	}

	/**
	 * Legt den Wert der parameters-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link ItemList }
	 * 
	 */
	public void setParameters(ItemList value) {
		this.parameters = value;
	}

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
	 * @param value -
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
	 * @param value -
	 *            allowed object is {@link QName }
	 * 
	 */
	public void setType(QName value) {
		this.type = value;
	}

}
