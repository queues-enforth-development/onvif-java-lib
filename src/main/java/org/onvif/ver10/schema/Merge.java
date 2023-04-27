//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r Merge complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Merge">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="from" type="{http://www.onvif.org/ver10/schema}ObjectId" maxOccurs="unbounded" minOccurs="2"/>
 *         <element name="to" type="{http://www.onvif.org/ver10/schema}ObjectId"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Merge", propOrder = { "from", "to" })
public class Merge {

    /**
     *
     */
    @XmlElement(required = true)
	protected List<ObjectId> from;

    /**
     *
     */
    @XmlElement(required = true)
	protected ObjectId to;

	/**
	 * Gets the value of the from property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the from property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getFrom().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ObjectId }
	 * 
	 * 
     * @return 
	 */
	public List<ObjectId> getFrom() {
		if (from == null) {
			from = new ArrayList<>();
		}
		return this.from;
	}

	/**
	 * Ruft den Wert der to-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ObjectId }
	 * 
	 */
	public ObjectId getTo() {
		return to;
	}

	/**
	 * Legt den Wert der to-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link ObjectId }
	 * 
	 */
	public void setTo(ObjectId value) {
		this.to = value;
	}

}
