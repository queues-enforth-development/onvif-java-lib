//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * A structure for defining a limited scope when searching in recorded data.
 * 
 * <p>
 * Java-Klasse f�r SearchScope complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="SearchScope">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="IncludedSources" type="{http://www.onvif.org/ver10/schema}SourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IncludedRecordings" type="{http://www.onvif.org/ver10/schema}RecordingReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RecordingInformationFilter" type="{http://www.onvif.org/ver10/schema}XPathExpression" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}SearchScopeExtension" minOccurs="0"/>
         </sequence>
         <anyAttribute processContents='lax'/>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchScope", propOrder = { "includedSources", "includedRecordings", "recordingInformationFilter", "extension" })
public class SearchScope {

    /**
     *
     */
    @XmlElement(name = "IncludedSources")
	protected List<SourceReference> includedSources;

    /**
     *
     */
    @XmlElement(name = "IncludedRecordings")
	protected List<String> includedRecordings;

    /**
     *
     */
    @XmlElement(name = "RecordingInformationFilter")
	protected String recordingInformationFilter;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected SearchScopeExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the includedSources property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the includedSources property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getIncludedSources().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link SourceReference }
	 * 
	 * 
     * @return 
	 */
	public List<SourceReference> getIncludedSources() {
		if (includedSources == null) {
			includedSources = new ArrayList<>();
		}
		return this.includedSources;
	}

	/**
	 * Gets the value of the includedRecordings property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the includedRecordings property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getIncludedRecordings().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
     * @return 
	 */
	public List<String> getIncludedRecordings() {
		if (includedRecordings == null) {
			includedRecordings = new ArrayList<>();
		}
		return this.includedRecordings;
	}

	/**
	 * Ruft den Wert der recordingInformationFilter-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecordingInformationFilter() {
		return recordingInformationFilter;
	}

	/**
	 * Legt den Wert der recordingInformationFilter-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecordingInformationFilter(String value) {
		this.recordingInformationFilter = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SearchScopeExtension }
	 * 
	 */
	public SearchScopeExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link SearchScopeExtension }
	 * 
	 */
	public void setExtension(SearchScopeExtension value) {
		this.extension = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
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
