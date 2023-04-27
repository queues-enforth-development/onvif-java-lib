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
 * Java-Klasse f�r ClassType.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="ClassType">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Animal"/>
 *     <enumeration value="Face"/>
 *     <enumeration value="Human"/>
 *     <enumeration value="Vehical"/>
 *     <enumeration value="Other"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClassType")
@XmlEnum
public enum ClassType {

    /**
     *
     */
    @XmlEnumValue("Animal")
	ANIMAL("Animal"),

    /**
     *
     */
    @XmlEnumValue("Face")
	FACE("Face"),

    /**
     *
     */
    @XmlEnumValue("Human")
	HUMAN("Human"),

    /**
     *
     */
    @XmlEnumValue("Vehical")
	VEHICAL("Vehical"),

    /**
     *
     */
    @XmlEnumValue("Other")
	OTHER("Other");
	private final String value;

	ClassType(String v) {
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
    public static ClassType fromValue(String v) {
		for (ClassType c : ClassType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
