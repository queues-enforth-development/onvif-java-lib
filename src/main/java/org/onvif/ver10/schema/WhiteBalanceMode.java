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
 * 
 * Java-Klasse f�r WhiteBalanceMode.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * 
 * <pre>{@code
 * <simpleType name="WhiteBalanceMode">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTO"/>
 *     <enumeration value="MANUAL"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WhiteBalanceMode")
@XmlEnum
public enum WhiteBalanceMode {

    /**
     *
     */
    AUTO,

    /**
     *
     */
    MANUAL;

    /**
     *
     * @return -
     */
    public String value() {
		return name();
	}

    /**
     *
     * @param v -
     * @return -
     */
    public static WhiteBalanceMode fromValue(String v) {
		return valueOf(v);
	}

}
