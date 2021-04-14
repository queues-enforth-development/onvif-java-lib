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
 * Java-Klasse f�r NetworkProtocolType.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="NetworkProtocolType">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HTTP"/>
 *     <enumeration value="HTTPS"/>
 *     <enumeration value="RTSP"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NetworkProtocolType")
@XmlEnum
public enum NetworkProtocolType {

    /**
     *
     */
    HTTP,

    /**
     *
     */
    HTTPS,

    /**
     *
     */
    RTSP;

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
    public static NetworkProtocolType fromValue(String v) {
		return valueOf(v);
	}

}
