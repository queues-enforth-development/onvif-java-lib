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
 * Java-Klasse f�r RecordingStatus.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="RecordingStatus">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Initiated"/>
 *     <enumeration value="Recording"/>
 *     <enumeration value="Stopped"/>
 *     <enumeration value="Removing"/>
 *     <enumeration value="Removed"/>
 *     <enumeration value="Unknown"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RecordingStatus")
@XmlEnum
public enum RecordingStatus {

    /**
     *
     */
    @XmlEnumValue("Initiated")
	INITIATED("Initiated"),

    /**
     *
     */
    @XmlEnumValue("Recording")
	RECORDING("Recording"),

    /**
     *
     */
    @XmlEnumValue("Stopped")
	STOPPED("Stopped"),

    /**
     *
     */
    @XmlEnumValue("Removing")
	REMOVING("Removing"),

    /**
     *
     */
    @XmlEnumValue("Removed")
	REMOVED("Removed"),

	/**
	 * This case should never happen.
	 * 
	 */
	@XmlEnumValue("Unknown")
	UNKNOWN("Unknown");
	private final String value;

	RecordingStatus(String v) {
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
    public static RecordingStatus fromValue(String v) {
		for (RecordingStatus c : RecordingStatus.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
