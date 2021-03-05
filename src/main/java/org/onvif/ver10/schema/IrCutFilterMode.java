//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r IrCutFilterMode.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="IrCutFilterMode">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ON"/>
 *     <enumeration value="OFF"/>
 *     <enumeration value="AUTO"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IrCutFilterMode")
@XmlEnum
public enum IrCutFilterMode {

    /**
     *
     */
    ON,

    /**
     *
     */
    OFF,

    /**
     *
     */
    AUTO;

    /**
     *
     * @return
     */
    public String value() {
		return name();
	}

    /**
     *
     * @param v
     * @return
     */
    public static IrCutFilterMode fromValue(String v) {
		return valueOf(v);
	}

}
