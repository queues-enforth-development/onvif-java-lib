//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r ObjectId complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ObjectId">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}integer" />
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectId")
@XmlSeeAlso({ Object.class })
public class ObjectId {

    /**
     *
     */
    @XmlAttribute(name = "ObjectId")
	protected BigInteger objectId;

	/**
	 * Ruft den Wert der objectId-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getObjectId() {
		return objectId;
	}

	/**
	 * Legt den Wert der objectId-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setObjectId(BigInteger value) {
		this.objectId = value;
	}

}
