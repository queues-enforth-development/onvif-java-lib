//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.t_1;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * 
 * Java-Klasse f�r ExtensibleDocumented complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ExtensibleDocumented">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="documentation" type="{http://docs.oasis-open.org/wsn/t-1}Documentation" minOccurs="0"/>
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
@XmlType(name = "ExtensibleDocumented", propOrder = { "documentation" })
@XmlSeeAlso({ TopicSetType.class, TopicNamespaceType.class, TopicType.class })
public abstract class ExtensibleDocumented {

    /**
     *
     */
    protected Documentation documentation;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der documentation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Documentation }
	 * 
	 */
	public Documentation getDocumentation() {
		return documentation;
	}

	/**
	 * Legt den Wert der documentation-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Documentation }
	 * 
	 */
	public void setDocumentation(Documentation value) {
		this.documentation = value;
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
