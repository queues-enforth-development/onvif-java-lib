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
 * Java-Klasse f�r FactoryDefaultType.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="FactoryDefaultType">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Hard"/>
 *     <enumeration value="Soft"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FactoryDefaultType")
@XmlEnum
public enum FactoryDefaultType {

	/**
	 * Indicates that a hard factory default is requested.
	 * 
	 */
	@XmlEnumValue("Hard")
	HARD("Hard"),

	/**
	 * Indicates that a soft factory default is requested.
	 * 
	 */
	@XmlEnumValue("Soft")
	SOFT("Soft");
	private final String value;

	FactoryDefaultType(String v) {
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
     * @param v
     * @return
     */
    public static FactoryDefaultType fromValue(String v) {
		for (FactoryDefaultType c : FactoryDefaultType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
