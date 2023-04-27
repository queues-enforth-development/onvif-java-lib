//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.w3._2005._08.addressing;

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
 * 
 * Java-Klasse f�r ProblemActionType complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ProblemActionType">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element ref="{http://www.w3.org/2005/08/addressing}Action" minOccurs="0"/>
 *         <element name="SoapAction" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         </sequence>
         <anyAttribute processContents='lax' namespace='##other'/>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProblemActionType", propOrder = { "action", "soapAction" })
public class ProblemActionType {

    /**
     *
     */
    @XmlElement(name = "Action")
	protected AttributedURIType action;

    /**
     *
     */
    @XmlElement(name = "SoapAction")
	@XmlSchemaType(name = "anyURI")
	protected String soapAction;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der action-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AttributedURIType }
	 * 
	 */
	public AttributedURIType getAction() {
		return action;
	}

	/**
	 * Legt den Wert der action-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link AttributedURIType }
	 * 
	 */
	public void setAction(AttributedURIType value) {
		this.action = value;
	}

	/**
	 * Ruft den Wert der soapAction-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSoapAction() {
		return soapAction;
	}

	/**
	 * Legt den Wert der soapAction-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSoapAction(String value) {
		this.soapAction = value;
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
