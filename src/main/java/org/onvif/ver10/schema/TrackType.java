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
 * 
 * Java-Klasse f�r TrackType.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * 
 * <pre>{@code
 * <simpleType name="TrackType">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Video"/>
 *     <enumeration value="Audio"/>
 *     <enumeration value="Metadata"/>
 *     <enumeration value="Extended"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TrackType")
@XmlEnum
public enum TrackType {

    /**
     *
     */
    @XmlEnumValue("Video")
	VIDEO("Video"),

    /**
     *
     */
    @XmlEnumValue("Audio")
	AUDIO("Audio"),

    /**
     *
     */
    @XmlEnumValue("Metadata")
	METADATA("Metadata"),

	/**
	 * Placeholder for future extension.
	 * 
	 */
	@XmlEnumValue("Extended")
	EXTENDED("Extended");
	private final String value;

	TrackType(String v) {
		value = v;
	}

    /**
     *
     * @return -
     */
    public String value() {
		return value;
	}

    /**
     *
     * @param v -
     * @return -
     */
    public static TrackType fromValue(String v) {
		for (TrackType c : TrackType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
