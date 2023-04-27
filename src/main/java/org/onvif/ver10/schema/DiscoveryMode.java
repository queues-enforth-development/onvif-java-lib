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
 * Java-Klasse f�r DiscoveryMode.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * 
 * <pre>{@code
 * <simpleType name="DiscoveryMode">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Discoverable"/>
 *     <enumeration value="NonDiscoverable"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DiscoveryMode")
@XmlEnum
public enum DiscoveryMode {

    /**
     *
     */
    @XmlEnumValue("Discoverable")
	DISCOVERABLE("Discoverable"),

    /**
     *
     */
    @XmlEnumValue("NonDiscoverable")
	NON_DISCOVERABLE("NonDiscoverable");
	private final String value;

	DiscoveryMode(String v) {
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
    public static DiscoveryMode fromValue(String v) {
		for (DiscoveryMode c : DiscoveryMode.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
