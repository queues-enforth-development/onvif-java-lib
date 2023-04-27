//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * 
 * Java-Klasse f�r ImagingOptions complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ImagingOptions">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="BacklightCompensation" type="{http://www.onvif.org/ver10/schema}BacklightCompensationOptions"/>
 *         <element name="Brightness" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="ColorSaturation" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="Contrast" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="Exposure" type="{http://www.onvif.org/ver10/schema}ExposureOptions"/>
 *         <element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusOptions"/>
 *         <element name="IrCutFilterModes" type="{http://www.onvif.org/ver10/schema}IrCutFilterMode" maxOccurs="unbounded"/>
 *         <element name="Sharpness" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         <element name="WideDynamicRange" type="{http://www.onvif.org/ver10/schema}WideDynamicRangeOptions"/>
 *         <element name="WhiteBalance" type="{http://www.onvif.org/ver10/schema}WhiteBalanceOptions"/>
           <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
         <anyAttribute processContents='lax'/>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingOptions", propOrder = { "backlightCompensation", "brightness", "colorSaturation", "contrast", "exposure", "focus", "irCutFilterModes",
		"sharpness", "wideDynamicRange", "whiteBalance", "any" })
public class ImagingOptions {

    /**
     *
     */
    @XmlElement(name = "BacklightCompensation", required = true)
	protected BacklightCompensationOptions backlightCompensation;

    /**
     *
     */
    @XmlElement(name = "Brightness", required = true)
	protected FloatRange brightness;

    /**
     *
     */
    @XmlElement(name = "ColorSaturation", required = true)
	protected FloatRange colorSaturation;

    /**
     *
     */
    @XmlElement(name = "Contrast", required = true)
	protected FloatRange contrast;

    /**
     *
     */
    @XmlElement(name = "Exposure", required = true)
	protected ExposureOptions exposure;

    /**
     *
     */
    @XmlElement(name = "Focus", required = true)
	protected FocusOptions focus;

    /**
     *
     */
    @XmlElement(name = "IrCutFilterModes", required = true)
	protected List<IrCutFilterMode> irCutFilterModes;

    /**
     *
     */
    @XmlElement(name = "Sharpness", required = true)
	protected FloatRange sharpness;

    /**
     *
     */
    @XmlElement(name = "WideDynamicRange", required = true)
	protected WideDynamicRangeOptions wideDynamicRange;

    /**
     *
     */
    @XmlElement(name = "WhiteBalance", required = true)
	protected WhiteBalanceOptions whiteBalance;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der backlightCompensation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BacklightCompensationOptions }
	 * 
	 */
	public BacklightCompensationOptions getBacklightCompensation() {
		return backlightCompensation;
	}

	/**
	 * Legt den Wert der backlightCompensation-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link BacklightCompensationOptions }
	 * 
	 */
	public void setBacklightCompensation(BacklightCompensationOptions value) {
		this.backlightCompensation = value;
	}

	/**
	 * Ruft den Wert der brightness-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getBrightness() {
		return brightness;
	}

	/**
	 * Legt den Wert der brightness-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setBrightness(FloatRange value) {
		this.brightness = value;
	}

	/**
	 * Ruft den Wert der colorSaturation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getColorSaturation() {
		return colorSaturation;
	}

	/**
	 * Legt den Wert der colorSaturation-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setColorSaturation(FloatRange value) {
		this.colorSaturation = value;
	}

	/**
	 * Ruft den Wert der contrast-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getContrast() {
		return contrast;
	}

	/**
	 * Legt den Wert der contrast-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setContrast(FloatRange value) {
		this.contrast = value;
	}

	/**
	 * Ruft den Wert der exposure-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ExposureOptions }
	 * 
	 */
	public ExposureOptions getExposure() {
		return exposure;
	}

	/**
	 * Legt den Wert der exposure-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link ExposureOptions }
	 * 
	 */
	public void setExposure(ExposureOptions value) {
		this.exposure = value;
	}

	/**
	 * Ruft den Wert der focus-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FocusOptions }
	 * 
	 */
	public FocusOptions getFocus() {
		return focus;
	}

	/**
	 * Legt den Wert der focus-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FocusOptions }
	 * 
	 */
	public void setFocus(FocusOptions value) {
		this.focus = value;
	}

	/**
	 * Gets the value of the irCutFilterModes property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the irCutFilterModes property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getIrCutFilterModes().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link IrCutFilterMode }
	 * 
	 * 
     * @return  -
	 */
	public List<IrCutFilterMode> getIrCutFilterModes() {
		if (irCutFilterModes == null) {
			irCutFilterModes = new ArrayList<>();
		}
		return this.irCutFilterModes;
	}

	/**
	 * Ruft den Wert der sharpness-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FloatRange }
	 * 
	 */
	public FloatRange getSharpness() {
		return sharpness;
	}

	/**
	 * Legt den Wert der sharpness-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FloatRange }
	 * 
	 */
	public void setSharpness(FloatRange value) {
		this.sharpness = value;
	}

	/**
	 * Ruft den Wert der wideDynamicRange-Eigenschaft ab.
	 * 
	 * @return possible object is {@link WideDynamicRangeOptions }
	 * 
	 */
	public WideDynamicRangeOptions getWideDynamicRange() {
		return wideDynamicRange;
	}

	/**
	 * Legt den Wert der wideDynamicRange-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link WideDynamicRangeOptions }
	 * 
	 */
	public void setWideDynamicRange(WideDynamicRangeOptions value) {
		this.wideDynamicRange = value;
	}

	/**
	 * Ruft den Wert der whiteBalance-Eigenschaft ab.
	 * 
	 * @return possible object is {@link WhiteBalanceOptions }
	 * 
	 */
	public WhiteBalanceOptions getWhiteBalance() {
		return whiteBalance;
	}

	/**
	 * Legt den Wert der whiteBalance-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link WhiteBalanceOptions }
	 * 
	 */
	public void setWhiteBalance(WhiteBalanceOptions value) {
		this.whiteBalance = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getAny().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
     * @return  -
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * 
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
