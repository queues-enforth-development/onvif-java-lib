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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * Describe the option of the color supported. Either list each color or define the range of color value. The following values are acceptable for Colourspace attribute.
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<ul xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;<li&gt;http://www.onvif.org/ver10/colorspace/YCbCr - YCbCr colourspace</li&gt;<li&gt;http://www.onvif.org/ver10/colorspace/CIELUV - CIE LUV</li&gt;<li&gt;http://www.onvif.org/ver10/colorspace/CIELAB - CIE 1976 (L*a*b*)</li&gt;<li&gt;http://www.onvif.org/ver10/colorspace/HSV - HSV colourspace</li&gt;</ul&gt;
 * }</pre>
 * 
 * 
 * <p>
 * Java-Klasse f�r ColorOptions complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ColorOptions">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <choice>
 *           <element name="ColorList" type="{http://www.onvif.org/ver10/schema}Color" maxOccurs="unbounded"/>
 *           <element name="ColorspaceRange" type="{http://www.onvif.org/ver10/schema}ColorspaceRange" maxOccurs="unbounded"/>
 *         </choice>
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
@XmlType(name = "ColorOptions", propOrder = { "colorList", "colorspaceRange" })
public class ColorOptions {

    /**
     *
     */
    @XmlElement(name = "ColorList")
	protected List<Color> colorList;

    /**
     *
     */
    @XmlElement(name = "ColorspaceRange")
	protected List<ColorspaceRange> colorspaceRange;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the colorList property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the colorList property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getColorList().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Color }
	 * 
	 * 
     * @return  -
	 */
	public List<Color> getColorList() {
		if (colorList == null) {
			colorList = new ArrayList<>();
		}
		return this.colorList;
	}

	/**
	 * Gets the value of the colorspaceRange property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the colorspaceRange property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getColorspaceRange().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ColorspaceRange }
	 * 
	 * 
     * @return  -
	 */
	public List<ColorspaceRange> getColorspaceRange() {
		if (colorspaceRange == null) {
			colorspaceRange = new ArrayList<>();
		}
		return this.colorspaceRange;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
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
