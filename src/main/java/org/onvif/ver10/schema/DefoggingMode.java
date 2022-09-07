//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2016.02.05 um 06:25:30 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für DefoggingMode.
 * 
 * <p>The following schema fragment indicates the expected content contained in this class.
 * <p>
 * <pre>{@code
 * &lt;simpleType name="DefoggingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OFF"/>
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="AUTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DefoggingMode")
@XmlEnum
public enum DefoggingMode {

    /**
     *
     */
    OFF,

    /**
     *
     */
    ON,

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
    public static DefoggingMode fromValue(String v) {
        return valueOf(v);
    }

}
