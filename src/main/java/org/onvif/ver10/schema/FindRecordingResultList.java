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
 * Java-Klasse f�r FindRecordingResultList complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="FindRecordingResultList">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="SearchState" type="{http://www.onvif.org/ver10/schema}SearchState"/>
 *         <element name="RecordingInformation" type="{http://www.onvif.org/ver10/schema}RecordingInformation" maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindRecordingResultList", propOrder = { "searchState", "recordingInformation" })
public class FindRecordingResultList {

    /**
     *
     */
    @XmlElement(name = "SearchState", required = true)
	protected SearchState searchState;

    /**
     *
     */
    @XmlElement(name = "RecordingInformation")
	protected List<RecordingInformation> recordingInformation;

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
	 * Gets the value of the recordingInformation property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the recordingInformation property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getRecordingInformation().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link RecordingInformation }
	 * 
	 * 
     * @return 
	 */
	public List<RecordingInformation> getRecordingInformation() {
		if (recordingInformation == null) {
			recordingInformation = new ArrayList<>();
		}
		return this.recordingInformation;
	}

}
