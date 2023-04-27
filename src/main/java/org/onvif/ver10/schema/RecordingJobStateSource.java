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
 * Java-Klasse f�r RecordingJobStateSource complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="RecordingJobStateSource">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="SourceToken" type="{http://www.onvif.org/ver10/schema}SourceReference"/>
 *         <element name="State" type="{http://www.onvif.org/ver10/schema}RecordingJobState"/>
 *         <element name="Tracks" type="{http://www.onvif.org/ver10/schema}RecordingJobStateTracks"/>
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
@XmlType(name = "RecordingJobStateSource", propOrder = { "sourceToken", "state", "tracks", "any" })
public class RecordingJobStateSource {

    /**
     *
     */
    @XmlElement(name = "SourceToken", required = true)
	protected SourceReference sourceToken;

    /**
     *
     */
    @XmlElement(name = "State", required = true)
	protected String state;

    /**
     *
     */
    @XmlElement(name = "Tracks", required = true)
	protected RecordingJobStateTracks tracks;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der sourceToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SourceReference }
	 * 
	 */
	public SourceReference getSourceToken() {
		return sourceToken;
	}

	/**
	 * Legt den Wert der sourceToken-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link SourceReference }
	 * 
	 */
	public void setSourceToken(SourceReference value) {
		this.sourceToken = value;
	}

	/**
	 * Ruft den Wert der state-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getState() {
		return state;
	}

	/**
	 * Legt den Wert der state-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setState(String value) {
		this.state = value;
	}

	/**
	 * Ruft den Wert der tracks-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RecordingJobStateTracks }
	 * 
	 */
	public RecordingJobStateTracks getTracks() {
		return tracks;
	}

	/**
	 * Legt den Wert der tracks-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link RecordingJobStateTracks }
	 * 
	 */
	public void setTracks(RecordingJobStateTracks value) {
		this.tracks = value;
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
