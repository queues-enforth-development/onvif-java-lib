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
 * 
 * Java-Klasse f�r FindMetadataResultList complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="FindMetadataResultList">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="SearchState" type="{http://www.onvif.org/ver10/schema}SearchState"/>
 *         <element name="Result" type="{http://www.onvif.org/ver10/schema}FindMetadataResult" maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMetadataResultList", propOrder = { "searchState", "result" })
public class FindMetadataResultList {

    /**
     *
     */
    @XmlElement(name = "SearchState", required = true)
	protected SearchState searchState;

    /**
     *
     */
    @XmlElement(name = "Result")
	protected List<FindMetadataResult> result;

	/**
	 * Ruft den Wert der searchState-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SearchState }
	 * 
	 */
	public SearchState getSearchState() {
		return searchState;
	}

	/**
	 * Legt den Wert der searchState-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link SearchState }
	 * 
	 */
	public void setSearchState(SearchState value) {
		this.searchState = value;
	}

	/**
	 * Gets the value of the result property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the result property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getResult().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link FindMetadataResult }
	 * 
	 * 
     * @return  -
	 */
	public List<FindMetadataResult> getResult() {
		if (result == null) {
			result = new ArrayList<>();
		}
		return this.result;
	}

}
