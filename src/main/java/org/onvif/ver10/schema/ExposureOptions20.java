//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r ExposureOptions20 complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ExposureOptions20">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode" maxOccurs="unbounded"/>
 *         <element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MinExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="MaxExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="MinGain" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="MaxGain" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="MinIris" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="MaxIris" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="ExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="Gain" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         <element name="Iris" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureOptions20", propOrder = { "mode", "priority", "minExposureTime", "maxExposureTime", "minGain", "maxGain", "minIris", "maxIris",
		"exposureTime", "gain", "iris" })
public class ExposureOptions20 {

    /**
     *
     */
    @XmlElement(name = "Mode", required = true)
	protected List<ExposureMode> mode;

    /**
     *
     */
    @XmlElement(name = "Priority")
	protected List<ExposurePriority> priority;

    /**
     *
     */
    @XmlElement(name = "MinExposureTime")
	protected FloatRange minExposureTime;

    /**
     *
     */
    @XmlElement(name = "MaxExposureTime")
	protected FloatRange maxExposureTime;

    /**
     *
     */
    @XmlElement(name = "MinGain")
	protected FloatRange minGain;

    /**
     *
     */
    @XmlElement(name = "MaxGain")
	protected FloatRange maxGain;

    /**
     *
     */
    @XmlElement(name = "MinIris")
	protected FloatRange minIris;

    /**
     *
     */
    @XmlElement(name = "MaxIris")
	protected FloatRange maxIris;

    /**
     *
     */
    @XmlElement(name = "ExposureTime")
	protected FloatRange exposureTime;

    /**
     *
     */
    @XmlElement(name = "Gain")
	protected FloatRange gain;

    /**
     *
     */
    @XmlElement(name = "Iris")
	protected FloatRange iris;

	/**
	 * Gets the value of the mode property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the mode property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getMode().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ExposureMode }
	 * 
	 * 
     * @return 
	 */
	public List<ExposureMode> getMode() {
		if (mode == null) {
			mode = new ArrayList<>();
		}
		return this.mode;
	}

	/**
	 * Gets the value of the priority property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the priority property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getPriority().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ExposurePriority }
	 * 
	 * 
     * @return 
	 */
	public List<ExposurePriority> getPriority() {
		if (priority == null) {
			priority = new ArrayList<>();
		}
		return this.priority;
	}

	/**
	 * Ruft den Wert der minExposureTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMinExposureTime() {
		return minExposureTime;
	}

	/**
	 * Legt den Wert der minExposureTime-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMinExposureTime(FloatRange value) {
		this.minExposureTime = value;
	}

	/**
	 * Ruft den Wert der maxExposureTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMaxExposureTime() {
		return maxExposureTime;
	}

	/**
	 * Legt den Wert der maxExposureTime-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMaxExposureTime(FloatRange value) {
		this.maxExposureTime = value;
	}

	/**
	 * Ruft den Wert der minGain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMinGain() {
		return minGain;
	}

	/**
	 * Legt den Wert der minGain-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMinGain(FloatRange value) {
		this.minGain = value;
	}

	/**
	 * Ruft den Wert der maxGain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMaxGain() {
		return maxGain;
	}

	/**
	 * Legt den Wert der maxGain-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMaxGain(FloatRange value) {
		this.maxGain = value;
	}

	/**
	 * Ruft den Wert der minIris-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMinIris() {
		return minIris;
	}

	/**
	 * Legt den Wert der minIris-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMinIris(FloatRange value) {
		this.minIris = value;
	}

	/**
	 * Ruft den Wert der maxIris-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getMaxIris() {
		return maxIris;
	}

	/**
	 * Legt den Wert der maxIris-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setMaxIris(FloatRange value) {
		this.maxIris = value;
	}

	/**
	 * Ruft den Wert der exposureTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getExposureTime() {
		return exposureTime;
	}

	/**
	 * Legt den Wert der exposureTime-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setExposureTime(FloatRange value) {
		this.exposureTime = value;
	}

	/**
	 * Ruft den Wert der gain-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getGain() {
		return gain;
	}

	/**
	 * Legt den Wert der gain-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setGain(FloatRange value) {
		this.gain = value;
	}

	/**
	 * Ruft den Wert der iris-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getIris() {
		return iris;
	}

	/**
	 * Legt den Wert der iris-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setIris(FloatRange value) {
		this.iris = value;
	}

}
