//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.xmlsoap.schemas.soap.envelope.soap12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * 
 * Java class for envelope complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Envelope">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element ref="{http://www.w3.org/2003/05/soap-envelope/}Header" minOccurs="0"/>
 *         <element ref="{http://www.w3.org/2003/05/soap-envelope/}Body"/>
           <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Envelope", propOrder = { "header", "body", "any" })
public class Envelope {

    /**
     *
     */
    @XmlElement(name = "Header", namespace = "http://www.w3.org/2003/05/soap-envelope/")
	protected Header header;

    /**
     *
     */
    @XmlElement(name = "Body", namespace = "http://www.w3.org/2003/05/soap-envelope/", required = true)
	protected Body body;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der header-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Header }
	 * 
	 */
	public Header getHeader() {
		return header;
	}

	/**
	 * Legt den Wert der header-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Header }
	 * 
	 */
	public void setHeader(Header value) {
		this.header = value;
	}

	/**
	 * Ruft den Wert der body-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Body }
	 * 
	 */
	public Body getBody() {
		return body;
	}

	/**
	 * Legt den Wert der body-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Body }
	 * 
	 */
	public void setBody(Body value) {
		this.body = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getAny().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link Object }
	 * 
	 * 
     * @return  -
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
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
