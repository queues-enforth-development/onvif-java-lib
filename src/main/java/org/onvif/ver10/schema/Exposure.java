//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r Exposure complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Exposure">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode"/>
 *         <element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority"/>
 *         <element name="Window" type="{http://www.onvif.org/ver10/schema}Rectangle"/>
 *         <element name="MinExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MaxExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MinGain" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MaxGain" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MinIris" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MaxIris" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="ExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="Gain" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="Iris" type="{http://www.w3.org/2001/XMLSchema}float"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exposure", propOrder = { "mode", "priority", "window", "minExposureTime", "maxExposureTime", "minGain", "maxGain", "minIris", "maxIris",
		"exposureTime", "gain", "iris" })
public class Exposure {

    /**
     *
     */
    @XmlElement(name = "Mode", required = true)
	protected ExposureMode mode;

    /**
     *
     */
    @XmlElement(name = "Priority", required = true)
	protected ExposurePriority priority;

    /**
     *
     */
    @XmlElement(name = "Window", required = true)
	protected Rectangle window;

    /**
     *
     */
    @XmlElement(name = "MinExposureTime")
	protected float minExposureTime;

    /**
     *
     */
    @XmlElement(name = "MaxExposureTime")
	protected float maxExposureTime;

    /**
     *
     */
    @XmlElement(name = "MinGain")
	protected float minGain;

    /**
     *
     */
    @XmlElement(name = "MaxGain")
	protected float maxGain;

    /**
     *
     */
    @XmlElement(name = "MinIris")
	protected float minIris;

    /**
     *
     */
    @XmlElement(name = "MaxIris")
	protected float maxIris;

    /**
     *
     */
    @XmlElement(name = "ExposureTime")
	protected float exposureTime;

    /**
     *
     */
    @XmlElement(name = "Gain")
	protected float gain;

    /**
     *
     */
    @XmlElement(name = "Iris")
	protected float iris;

	/**
	 * Ruft den Wert der mode-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ExposureMode }
	 * 
	 */
	public ExposureMode getMode() {
		return mode;
	}

	/**
	 * Legt den Wert der mode-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ExposureMode }
	 * 
	 */
	public void setMode(ExposureMode value) {
		this.mode = value;
	}

	/**
	 * Ruft den Wert der priority-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ExposurePriority }
	 * 
	 */
	public ExposurePriority getPriority() {
		return priority;
	}

	/**
	 * Legt den Wert der priority-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ExposurePriority }
	 * 
	 */
	public void setPriority(ExposurePriority value) {
		this.priority = value;
	}

	/**
	 * Ruft den Wert der window-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Rectangle }
	 * 
	 */
	public Rectangle getWindow() {
		return window;
	}

	/**
	 * Legt den Wert der window-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Rectangle }
	 * 
	 */
	public void setWindow(Rectangle value) {
		this.window = value;
	}

	/**
	 * Ruft den Wert der minExposureTime-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getMinExposureTime() {
		return minExposureTime;
	}

	/**
	 * Legt den Wert der minExposureTime-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setMinExposureTime(float value) {
		this.minExposureTime = value;
	}

	/**
	 * Ruft den Wert der maxExposureTime-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getMaxExposureTime() {
		return maxExposureTime;
	}

	/**
	 * Legt den Wert der maxExposureTime-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setMaxExposureTime(float value) {
		this.maxExposureTime = value;
	}

	/**
	 * Ruft den Wert der minGain-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getMinGain() {
		return minGain;
	}

	/**
	 * Legt den Wert der minGain-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setMinGain(float value) {
		this.minGain = value;
	}

	/**
	 * Ruft den Wert der maxGain-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getMaxGain() {
		return maxGain;
	}

	/**
	 * Legt den Wert der maxGain-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setMaxGain(float value) {
		this.maxGain = value;
	}

	/**
	 * Ruft den Wert der minIris-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getMinIris() {
		return minIris;
	}

	/**
	 * Legt den Wert der minIris-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setMinIris(float value) {
		this.minIris = value;
	}

	/**
	 * Ruft den Wert der maxIris-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getMaxIris() {
		return maxIris;
	}

	/**
	 * Legt den Wert der maxIris-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setMaxIris(float value) {
		this.maxIris = value;
	}

	/**
	 * Ruft den Wert der exposureTime-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getExposureTime() {
		return exposureTime;
	}

	/**
	 * Legt den Wert der exposureTime-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setExposureTime(float value) {
		this.exposureTime = value;
	}

	/**
	 * Ruft den Wert der gain-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getGain() {
		return gain;
	}

	/**
	 * Legt den Wert der gain-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setGain(float value) {
		this.gain = value;
	}

	/**
	 * Ruft den Wert der iris-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getIris() {
		return iris;
	}

	/**
	 * Legt den Wert der iris-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setIris(float value) {
		this.iris = value;
	}

}
