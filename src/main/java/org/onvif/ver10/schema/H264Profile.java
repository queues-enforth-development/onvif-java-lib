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
 * Java-Klasse f�r H264Profile.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * 
 * <pre>{@code
 * <simpleType name="H264Profile">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Baseline"/>
 *     <enumeration value="Main"/>
 *     <enumeration value="Extended"/>
 *     <enumeration value="High"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "H264Profile")
@XmlEnum
public enum H264Profile {

    /**
     *
     */
    @XmlEnumValue("Baseline")
	BASELINE("Baseline"),

    /**
     *
     */
    @XmlEnumValue("Main")
	MAIN("Main"),

    /**
     *
     */
    @XmlEnumValue("Extended")
	EXTENDED("Extended"),

    /**
     *
     */
    @XmlEnumValue("High")
	HIGH("High");
	private final String value;

	H264Profile(String v) {
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
    public static H264Profile fromValue(String v) {
		for (H264Profile c : H264Profile.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
