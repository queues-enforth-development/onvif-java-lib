//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r SearchState.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="SearchState">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Queued"/>
 *     <enumeration value="Searching"/>
 *     <enumeration value="Completed"/>
 *     <enumeration value="Unknown"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SearchState")
@XmlEnum
public enum SearchState {

	/**
	 * The search is queued and not yet started.
	 * 
	 */
	@XmlEnumValue("Queued")
	QUEUED("Queued"),

	/**
	 * The search is underway and not yet completed.
	 * 
	 */
	@XmlEnumValue("Searching")
	SEARCHING("Searching"),

	/**
	 * The search has been completed and no new results will be found.
	 * 
	 */
	@XmlEnumValue("Completed")
	COMPLETED("Completed"),

	/**
	 * The state of the search is unknown. (This is not a valid response from GetSearchState.)
	 * 
	 */
	@XmlEnumValue("Unknown")
	UNKNOWN("Unknown");
	private final String value;

	SearchState(String v) {
		value = v;
	}

    /**
     *
     * @return
     */
    public String value() {
		return value;
	}

    /**
     *
     * @param v -
     * @return
     */
    public static SearchState fromValue(String v) {
		for (SearchState c : SearchState.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
