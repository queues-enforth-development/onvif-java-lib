//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.b_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.oasis_open.docs.wsrf.bf_2.BaseFaultType;

/**
 * <p>
 * Java-Klasse f�r InvalidFilterFaultType complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="InvalidFilterFaultType">
     <complexContent>
 *     <extension base="{http://docs.oasis-open.org/wsrf/bf-2}BaseFaultType">
         <sequence>
 *         <element name="UnknownFilter" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded"/>
         </sequence>
         <anyAttribute processContents='lax' namespace='##other'/>
 *     </extension>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidFilterFaultType", propOrder = { "unknownFilter" })
public class InvalidFilterFaultType extends BaseFaultType {

    /**
     *
     */
    @XmlElement(name = "UnknownFilter", required = true)
	protected List<QName> unknownFilter;

	/**
	 * Gets the value of the unknownFilter property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the unknownFilter property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getUnknownFilter().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link QName }
	 * 
	 * 
     * @return 
	 */
	public List<QName> getUnknownFilter() {
		if (unknownFilter == null) {
			unknownFilter = new ArrayList<>();
		}
		return this.unknownFilter;
	}

}
