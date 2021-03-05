//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r Scope complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Scope">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="ScopeDef" type="{http://www.onvif.org/ver10/schema}ScopeDefinition"/>
 *         <element name="ScopeItem" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scope", propOrder = { "scopeDef", "scopeItem" })
public class Scope {

    /**
     *
     */
    @XmlElement(name = "ScopeDef", required = true)
	protected ScopeDefinition scopeDef;

    /**
     *
     */
    @XmlElement(name = "ScopeItem", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String scopeItem;

	/**
	 * Ruft den Wert der scopeDef-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ScopeDefinition }
	 * 
	 */
	public ScopeDefinition getScopeDef() {
		return scopeDef;
	}

	/**
	 * Legt den Wert der scopeDef-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ScopeDefinition }
	 * 
	 */
	public void setScopeDef(ScopeDefinition value) {
		this.scopeDef = value;
	}

	/**
	 * Ruft den Wert der scopeItem-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScopeItem() {
		return scopeItem;
	}

	/**
	 * Legt den Wert der scopeItem-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setScopeItem(String value) {
		this.scopeItem = value;
	}

}
