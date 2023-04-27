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
 * Java-Klasse f�r ScopeDefinition.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * 
 * <pre>{@code
 * <simpleType name="ScopeDefinition">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Fixed"/>
 *     <enumeration value="Configurable"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ScopeDefinition")
@XmlEnum
public enum ScopeDefinition {

    /**
     *
     */
    @XmlEnumValue("Fixed")
	FIXED("Fixed"),

    /**
     *
     */
    @XmlEnumValue("Configurable")
	CONFIGURABLE("Configurable");
	private final String value;

	ScopeDefinition(String v) {
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
    public static ScopeDefinition fromValue(String v) {
		for (ScopeDefinition c : ScopeDefinition.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
