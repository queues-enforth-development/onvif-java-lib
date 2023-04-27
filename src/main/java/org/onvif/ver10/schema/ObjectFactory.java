//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the org.onvif.ver10.schema package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this
 * class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _VideoSourceConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoSourceConfiguration");
	private final static QName _MetadataStream_QNAME = new QName("http://www.onvif.org/ver10/schema", "MetadataStream");
	private final static QName _AudioEncoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioEncoderConfiguration");
	private final static QName _VideoEncoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoEncoderConfiguration");
	private final static QName _VideoAnalyticsConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoAnalyticsConfiguration");
	private final static QName _AudioOutputConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioOutputConfiguration");
	private final static QName _Polygon_QNAME = new QName("http://www.onvif.org/ver10/schema", "Polygon");
	private final static QName _Polyline_QNAME = new QName("http://www.onvif.org/ver10/schema", "Polyline");
	private final static QName _AudioSourceConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioSourceConfiguration");
	private final static QName _MetadataConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "MetadataConfiguration");
	private final static QName _PTZConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "PTZConfiguration");
	private final static QName _AudioDecoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioDecoderConfiguration");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.schema
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ItemListDescription }
	 * 
     * @return  -
	 */
	public ItemListDescription createItemListDescription() {
		return new ItemListDescription();
	}

	/**
	 * Create an instance of {@link ConfigDescription }
	 * 
     * @return  -
	 */
	public ConfigDescription createConfigDescription() {
		return new ConfigDescription();
	}

	/**
	 * Create an instance of {@link Behaviour }
	 * 
     * @return  -
	 */
	public Behaviour createBehaviour() {
		return new Behaviour();
	}

	/**
	 * Create an instance of {@link ColorDescriptor }
	 * 
     * @return  -
	 */
	public ColorDescriptor createColorDescriptor() {
		return new ColorDescriptor();
	}

	/**
	 * Create an instance of {@link EventSubscription }
	 * 
     * @return  -
	 */
	public EventSubscription createEventSubscription() {
		return new EventSubscription();
	}

	/**
	 * Create an instance of {@link ClassDescriptor }
	 * 
     * @return  -
	 */
	public ClassDescriptor createClassDescriptor() {
		return new ClassDescriptor();
	}

	/**
	 * Create an instance of {@link ItemList }
	 * 
     * @return  -
	 */
	public ItemList createItemList() {
		return new ItemList();
	}

	/**
	 * Create an instance of {@link User }
	 * 
     * @return  -
	 */
	public User createUser() {
		return new User();
	}

	/**
	 * Create an instance of {@link Scope }
	 * 
     * @return  -
	 */
	public Scope createScope() {
		return new Scope();
	}

	/**
	 * Create an instance of {@link Dot11AvailableNetworks }
	 * 
     * @return  -
	 */
	public Dot11AvailableNetworks createDot11AvailableNetworks() {
		return new Dot11AvailableNetworks();
	}

	/**
	 * Create an instance of {@link NTPInformation }
	 * 
     * @return  -
	 */
	public NTPInformation createNTPInformation() {
		return new NTPInformation();
	}

	/**
	 * Create an instance of {@link DynamicDNSInformation }
	 * 
     * @return  -
	 */
	public DynamicDNSInformation createDynamicDNSInformation() {
		return new DynamicDNSInformation();
	}

	/**
	 * Create an instance of {@link Dot1XConfiguration }
	 * 
     * @return  -
	 */
	public Dot1XConfiguration createDot1XConfiguration() {
		return new Dot1XConfiguration();
	}

	/**
	 * Create an instance of {@link AttachmentData }
	 * 
     * @return  -
	 */
	public AttachmentData createAttachmentData() {
		return new AttachmentData();
	}

	/**
	 * Create an instance of {@link NetworkZeroConfiguration }
	 * 
     * @return  -
	 */
	public NetworkZeroConfiguration createNetworkZeroConfiguration() {
		return new NetworkZeroConfiguration();
	}

	/**
	 * Create an instance of {@link Certificate }
	 * 
     * @return  -
	 */
	public Certificate createCertificate() {
		return new Certificate();
	}

	/**
	 * Create an instance of {@link BackupFile }
	 * 
     * @return  -
	 */
	public BackupFile createBackupFile() {
		return new BackupFile();
	}

	/**
	 * Create an instance of {@link RelayOutput }
	 * 
     * @return  -
	 */
	public RelayOutput createRelayOutput() {
		return new RelayOutput();
	}

	/**
	 * Create an instance of {@link SystemDateTime }
	 * 
     * @return  -
	 */
	public SystemDateTime createSystemDateTime() {
		return new SystemDateTime();
	}

	/**
	 * Create an instance of {@link TimeZone }
	 * 
     * @return  -
	 */
	public TimeZone createTimeZone() {
		return new TimeZone();
	}

	/**
	 * Create an instance of {@link DateTime }
	 * 
     * @return  -
	 */
	public DateTime createDateTime() {
		return new DateTime();
	}

	/**
	 * Create an instance of {@link Capabilities }
	 * 
     * @return  -
	 */
	public Capabilities createCapabilities() {
		return new Capabilities();
	}

	/**
	 * Create an instance of {@link CertificateStatus }
	 * 
     * @return  -
	 */
	public CertificateStatus createCertificateStatus() {
		return new CertificateStatus();
	}

	/**
	 * Create an instance of {@link SupportInformation }
	 * 
     * @return  -
	 */
	public SupportInformation createSupportInformation() {
		return new SupportInformation();
	}

	/**
	 * Create an instance of {@link CertificateInformation }
	 * 
     * @return  -
	 */
	public CertificateInformation createCertificateInformation() {
		return new CertificateInformation();
	}

	/**
	 * Create an instance of {@link NetworkHost }
	 * 
     * @return  -
	 */
	public NetworkHost createNetworkHost() {
		return new NetworkHost();
	}

	/**
	 * Create an instance of {@link RemoteUser }
	 * 
     * @return  -
	 */
	public RemoteUser createRemoteUser() {
		return new RemoteUser();
	}

	/**
	 * Create an instance of {@link RelayOutputSettings }
	 * 
     * @return  -
	 */
	public RelayOutputSettings createRelayOutputSettings() {
		return new RelayOutputSettings();
	}

	/**
	 * Create an instance of {@link HostnameInformation }
	 * 
     * @return  -
	 */
	public HostnameInformation createHostnameInformation() {
		return new HostnameInformation();
	}

	/**
	 * Create an instance of {@link Dot11Status }
	 * 
     * @return  -
	 */
	public Dot11Status createDot11Status() {
		return new Dot11Status();
	}

	/**
	 * Create an instance of {@link BinaryData }
	 * 
     * @return  -
	 */
	public BinaryData createBinaryData() {
		return new BinaryData();
	}

	/**
	 * Create an instance of {@link IPAddressFilter }
	 * 
     * @return  -
	 */
	public IPAddressFilter createIPAddressFilter() {
		return new IPAddressFilter();
	}

	/**
	 * Create an instance of {@link NetworkInterfaceSetConfiguration }
	 * 
     * @return  -
	 */
	public NetworkInterfaceSetConfiguration createNetworkInterfaceSetConfiguration() {
		return new NetworkInterfaceSetConfiguration();
	}

	/**
	 * Create an instance of {@link NetworkProtocol }
	 * 
     * @return  -
	 */
	public NetworkProtocol createNetworkProtocol() {
		return new NetworkProtocol();
	}

	/**
	 * Create an instance of {@link SystemLogUriList }
	 * 
     * @return  -
	 */
	public SystemLogUriList createSystemLogUriList() {
		return new SystemLogUriList();
	}

	/**
	 * Create an instance of {@link DNSInformation }
	 * 
     * @return  -
	 */
	public DNSInformation createDNSInformation() {
		return new DNSInformation();
	}

	/**
	 * Create an instance of {@link NetworkInterface }
	 * 
     * @return  -
	 */
	public NetworkInterface createNetworkInterface() {
		return new NetworkInterface();
	}

	/**
	 * Create an instance of {@link CertificateWithPrivateKey }
	 * 
     * @return  -
	 */
	public CertificateWithPrivateKey createCertificateWithPrivateKey() {
		return new CertificateWithPrivateKey();
	}

	/**
	 * Create an instance of {@link IPAddress }
	 * 
     * @return  -
	 */
	public IPAddress createIPAddress() {
		return new IPAddress();
	}

	/**
	 * Create an instance of {@link Dot11Capabilities }
	 * 
     * @return  -
	 */
	public Dot11Capabilities createDot11Capabilities() {
		return new Dot11Capabilities();
	}

	/**
	 * Create an instance of {@link NetworkGateway }
	 * 
     * @return  -
	 */
	public NetworkGateway createNetworkGateway() {
		return new NetworkGateway();
	}

	/**
	 * Create an instance of {@link SystemLog }
	 * 
     * @return  -
	 */
	public SystemLog createSystemLog() {
		return new SystemLog();
	}

	/**
	 * Create an instance of {@link AudioSourceConfiguration }
	 * 
     * @return  -
	 */
	public AudioSourceConfiguration createAudioSourceConfiguration() {
		return new AudioSourceConfiguration();
	}

	/**
	 * Create an instance of {@link PTZConfiguration }
	 * 
     * @return  -
	 */
	public PTZConfiguration createPTZConfiguration() {
		return new PTZConfiguration();
	}

	/**
	 * Create an instance of {@link VideoSourceConfiguration }
	 * 
     * @return  -
	 */
	public VideoSourceConfiguration createVideoSourceConfiguration() {
		return new VideoSourceConfiguration();
	}

	/**
	 * Create an instance of {@link Message }
	 * 
     * @return  -
	 */
	public Message createMessage() {
		return new Message();
	}

	/**
	 * Create an instance of {@link MessageExtension }
	 * 
     * @return  -
	 */
	public MessageExtension createMessageExtension() {
		return new MessageExtension();
	}

	/**
	 * Create an instance of {@link AudioEncoderConfiguration }
	 * 
     * @return  -
	 */
	public AudioEncoderConfiguration createAudioEncoderConfiguration() {
		return new AudioEncoderConfiguration();
	}

	/**
	 * Create an instance of {@link VideoEncoderConfiguration }
	 * 
     * @return  -
	 */
	public VideoEncoderConfiguration createVideoEncoderConfiguration() {
		return new VideoEncoderConfiguration();
	}

	/**
	 * Create an instance of {@link MetadataStream }
	 * 
     * @return  -
	 */
	public MetadataStream createMetadataStream() {
		return new MetadataStream();
	}

	/**
	 * Create an instance of {@link AudioDecoderConfiguration }
	 * 
     * @return  -
	 */
	public AudioDecoderConfiguration createAudioDecoderConfiguration() {
		return new AudioDecoderConfiguration();
	}

	/**
	 * Create an instance of {@link VideoAnalyticsConfiguration }
	 * 
     * @return  -
	 */
	public VideoAnalyticsConfiguration createVideoAnalyticsConfiguration() {
		return new VideoAnalyticsConfiguration();
	}

	/**
	 * Create an instance of {@link AudioOutputConfiguration }
	 * 
     * @return  -
	 */
	public AudioOutputConfiguration createAudioOutputConfiguration() {
		return new AudioOutputConfiguration();
	}

	/**
	 * Create an instance of {@link Polygon }
	 * 
     * @return  -
	 */
	public Polygon createPolygon() {
		return new Polygon();
	}

	/**
	 * Create an instance of {@link MetadataConfiguration }
	 * 
     * @return  -
	 */
	public MetadataConfiguration createMetadataConfiguration() {
		return new MetadataConfiguration();
	}

	/**
	 * Create an instance of {@link Polyline }
	 * 
     * @return  -
	 */
	public Polyline createPolyline() {
		return new Polyline();
	}

	/**
	 * Create an instance of {@link IrCutFilterAutoAdjustment }
	 * 
     * @return  -
	 */
	public IrCutFilterAutoAdjustment createIrCutFilterAutoAdjustment() {
		return new IrCutFilterAutoAdjustment();
	}

	/**
	 * Create an instance of {@link PTZNodeExtension2 }
	 * 
     * @return  -
	 */
	public PTZNodeExtension2 createPTZNodeExtension2() {
		return new PTZNodeExtension2();
	}

	/**
	 * Create an instance of {@link WideDynamicRangeOptions20 }
	 * 
     * @return  -
	 */
	public WideDynamicRangeOptions20 createWideDynamicRangeOptions20() {
		return new WideDynamicRangeOptions20();
	}

	/**
	 * Create an instance of {@link CertificateGenerationParametersExtension }
	 * 
     * @return  -
	 */
	public CertificateGenerationParametersExtension createCertificateGenerationParametersExtension() {
		return new CertificateGenerationParametersExtension();
	}

	/**
	 * Create an instance of {@link PTZSpacesExtension }
	 * 
     * @return  -
	 */
	public PTZSpacesExtension createPTZSpacesExtension() {
		return new PTZSpacesExtension();
	}

	/**
	 * Create an instance of {@link EFlip }
	 * 
     * @return  -
	 */
	public EFlip createEFlip() {
		return new EFlip();
	}

	/**
	 * Create an instance of {@link VideoAttributes }
	 * 
     * @return  -
	 */
	public VideoAttributes createVideoAttributes() {
		return new VideoAttributes();
	}

	/**
	 * Create an instance of {@link MediaAttributes }
	 * 
     * @return  -
	 */
	public MediaAttributes createMediaAttributes() {
		return new MediaAttributes();
	}

	/**
	 * Create an instance of {@link SearchCapabilities }
	 * 
     * @return  -
	 */
	public SearchCapabilities createSearchCapabilities() {
		return new SearchCapabilities();
	}

	/**
	 * Create an instance of {@link G726DecOptions }
	 * 
     * @return  -
	 */
	public G726DecOptions createG726DecOptions() {
		return new G726DecOptions();
	}

	/**
	 * Create an instance of {@link DeviceEntity }
	 * 
     * @return  -
	 */
	public DeviceEntity createDeviceEntity() {
		return new DeviceEntity();
	}

	/**
	 * Create an instance of {@link PTZVector }
	 * 
     * @return  -
	 */
	public PTZVector createPTZVector() {
		return new PTZVector();
	}

	/**
	 * Create an instance of {@link AACDecOptions }
	 * 
     * @return  -
	 */
	public AACDecOptions createAACDecOptions() {
		return new AACDecOptions();
	}

	/**
	 * Create an instance of {@link ImagingStatus20Extension }
	 * 
     * @return  -
	 */
	public ImagingStatus20Extension createImagingStatus20Extension() {
		return new ImagingStatus20Extension();
	}

	/**
	 * Create an instance of {@link PTZConfigurationOptions }
	 * 
     * @return  -
	 */
	public PTZConfigurationOptions createPTZConfigurationOptions() {
		return new PTZConfigurationOptions();
	}

	/**
	 * Create an instance of {@link IPv6ConfigurationExtension }
	 * 
     * @return  -
	 */
	public IPv6ConfigurationExtension createIPv6ConfigurationExtension() {
		return new IPv6ConfigurationExtension();
	}

	/**
	 * Create an instance of {@link VideoOutputConfigurationOptions }
	 * 
     * @return  -
	 */
	public VideoOutputConfigurationOptions createVideoOutputConfigurationOptions() {
		return new VideoOutputConfigurationOptions();
	}

	/**
	 * Create an instance of {@link Rename }
	 * 
     * @return  -
	 */
	public Rename createRename() {
		return new Rename();
	}

	/**
	 * Create an instance of {@link G711DecOptions }
	 * 
     * @return  -
	 */
	public G711DecOptions createG711DecOptions() {
		return new G711DecOptions();
	}

	/**
	 * Create an instance of {@link CertificateGenerationParameters }
	 * 
     * @return  -
	 */
	public CertificateGenerationParameters createCertificateGenerationParameters() {
		return new CertificateGenerationParameters();
	}

	/**
	 * Create an instance of {@link Receiver }
	 * 
     * @return  -
	 */
	public Receiver createReceiver() {
		return new Receiver();
	}

	/**
	 * Create an instance of {@link Transport }
	 * 
     * @return  -
	 */
	public Transport createTransport() {
		return new Transport();
	}

	/**
	 * Create an instance of {@link PTZPresetTourSpotOptions }
	 * 
     * @return  -
	 */
	public PTZPresetTourSpotOptions createPTZPresetTourSpotOptions() {
		return new PTZPresetTourSpotOptions();
	}

	/**
	 * Create an instance of {@link Dot11Configuration }
	 * 
     * @return  -
	 */
	public Dot11Configuration createDot11Configuration() {
		return new Dot11Configuration();
	}

	/**
	 * Create an instance of {@link PolylineArrayExtension }
	 * 
     * @return  -
	 */
	public PolylineArrayExtension createPolylineArrayExtension() {
		return new PolylineArrayExtension();
	}

	/**
	 * Create an instance of {@link EventFilter }
	 * 
     * @return  -
	 */
	public EventFilter createEventFilter() {
		return new EventFilter();
	}

	/**
	 * Create an instance of {@link PolygonConfiguration }
	 * 
     * @return  -
	 */
	public PolygonConfiguration createPolygonConfiguration() {
		return new PolygonConfiguration();
	}

	/**
	 * Create an instance of {@link GetTracksResponseList }
	 * 
     * @return  -
	 */
	public GetTracksResponseList createGetTracksResponseList() {
		return new GetTracksResponseList();
	}

	/**
	 * Create an instance of {@link RotateOptions }
	 * 
     * @return  -
	 */
	public RotateOptions createRotateOptions() {
		return new RotateOptions();
	}

	/**
	 * Create an instance of {@link SupportedRules }
	 * 
     * @return  -
	 */
	public SupportedRules createSupportedRules() {
		return new SupportedRules();
	}

	/**
	 * Create an instance of {@link NetworkInterfaceExtension }
	 * 
     * @return  -
	 */
	public NetworkInterfaceExtension createNetworkInterfaceExtension() {
		return new NetworkInterfaceExtension();
	}

	/**
	 * Create an instance of {@link OSDConfigurationOptionsExtension }
	 * 
     * @return  -
	 */
	public OSDConfigurationOptionsExtension createOSDConfigurationOptionsExtension() {
		return new OSDConfigurationOptionsExtension();
	}

	/**
	 * Create an instance of {@link BacklightCompensationOptions }
	 * 
     * @return  -
	 */
	public BacklightCompensationOptions createBacklightCompensationOptions() {
		return new BacklightCompensationOptions();
	}

	/**
	 * Create an instance of {@link AudioDecoderConfigurationOptionsExtension }
	 * 
     * @return  -
	 */
	public AudioDecoderConfigurationOptionsExtension createAudioDecoderConfigurationOptionsExtension() {
		return new AudioDecoderConfigurationOptionsExtension();
	}

	/**
	 * Create an instance of {@link Merge }
	 * 
     * @return  -
	 */
	public Merge createMerge() {
		return new Merge();
	}

	/**
	 * Create an instance of {@link Rotate }
	 * 
     * @return  -
	 */
	public Rotate createRotate() {
		return new Rotate();
	}

	/**
	 * Create an instance of {@link OSDConfigurationExtension }
	 * 
     * @return  -
	 */
	public OSDConfigurationExtension createOSDConfigurationExtension() {
		return new OSDConfigurationExtension();
	}

	/**
	 * Create an instance of {@link SystemCapabilitiesExtension }
	 * 
     * @return  -
	 */
	public SystemCapabilitiesExtension createSystemCapabilitiesExtension() {
		return new SystemCapabilitiesExtension();
	}

	/**
	 * Create an instance of {@link PaneOptionExtension }
	 * 
     * @return  -
	 */
	public PaneOptionExtension createPaneOptionExtension() {
		return new PaneOptionExtension();
	}

	/**
	 * Create an instance of {@link IrCutFilterAutoAdjustmentOptions }
	 * 
     * @return  -
	 */
	public IrCutFilterAutoAdjustmentOptions createIrCutFilterAutoAdjustmentOptions() {
		return new IrCutFilterAutoAdjustmentOptions();
	}

	/**
	 * Create an instance of {@link PTZStatusFilterOptionsExtension }
	 * 
     * @return  -
	 */
	public PTZStatusFilterOptionsExtension createPTZStatusFilterOptionsExtension() {
		return new PTZStatusFilterOptionsExtension();
	}

	/**
	 * Create an instance of {@link OSDColor }
	 * 
     * @return  -
	 */
	public OSDColor createOSDColor() {
		return new OSDColor();
	}

	/**
	 * Create an instance of {@link Split }
	 * 
     * @return  -
	 */
	public Split createSplit() {
		return new Split();
	}

	/**
	 * Create an instance of {@link PTZPresetTourStartingConditionOptions }
	 * 
     * @return  -
	 */
	public PTZPresetTourStartingConditionOptions createPTZPresetTourStartingConditionOptions() {
		return new PTZPresetTourStartingConditionOptions();
	}

	/**
	 * Create an instance of {@link DisplayCapabilities }
	 * 
     * @return  -
	 */
	public DisplayCapabilities createDisplayCapabilities() {
		return new DisplayCapabilities();
	}

	/**
	 * Create an instance of {@link PolylineArray }
	 * 
     * @return  -
	 */
	public PolylineArray createPolylineArray() {
		return new PolylineArray();
	}

	/**
	 * Create an instance of {@link Rectangle }
	 * 
     * @return  -
	 */
	public Rectangle createRectangle() {
		return new Rectangle();
	}

	/**
	 * Create an instance of {@link TLSConfiguration }
	 * 
     * @return  -
	 */
	public TLSConfiguration createTLSConfiguration() {
		return new TLSConfiguration();
	}

	/**
	 * Create an instance of {@link NetworkInterfaceConnectionSetting }
	 * 
     * @return  -
	 */
	public NetworkInterfaceConnectionSetting createNetworkInterfaceConnectionSetting() {
		return new NetworkInterfaceConnectionSetting();
	}

	/**
	 * Create an instance of {@link SourceIdentificationExtension }
	 * 
     * @return  -
	 */
	public SourceIdentificationExtension createSourceIdentificationExtension() {
		return new SourceIdentificationExtension();
	}

	/**
	 * Create an instance of {@link AnalyticsEngineInput }
	 * 
     * @return  -
	 */
	public AnalyticsEngineInput createAnalyticsEngineInput() {
		return new AnalyticsEngineInput();
	}

	/**
	 * Create an instance of {@link ColorOptions }
	 * 
     * @return  -
	 */
	public ColorOptions createColorOptions() {
		return new ColorOptions();
	}

	/**
	 * Create an instance of {@link AnalyticsDeviceCapabilities }
	 * 
     * @return  -
	 */
	public AnalyticsDeviceCapabilities createAnalyticsDeviceCapabilities() {
		return new AnalyticsDeviceCapabilities();
	}

	/**
	 * Create an instance of {@link SourceReference }
	 * 
     * @return  -
	 */
	public SourceReference createSourceReference() {
		return new SourceReference();
	}

	/**
	 * Create an instance of {@link RecordingCapabilities }
	 * 
     * @return  -
	 */
	public RecordingCapabilities createRecordingCapabilities() {
		return new RecordingCapabilities();
	}

	/**
	 * Create an instance of {@link OSDPosConfigurationExtension }
	 * 
     * @return  -
	 */
	public OSDPosConfigurationExtension createOSDPosConfigurationExtension() {
		return new OSDPosConfigurationExtension();
	}

	/**
	 * Create an instance of {@link MediaCapabilities }
	 * 
     * @return  -
	 */
	public MediaCapabilities createMediaCapabilities() {
		return new MediaCapabilities();
	}

	/**
	 * Create an instance of {@link NetworkZeroConfigurationExtension }
	 * 
     * @return  -
	 */
	public NetworkZeroConfigurationExtension createNetworkZeroConfigurationExtension() {
		return new NetworkZeroConfigurationExtension();
	}

	/**
	 * Create an instance of {@link FocusOptions20 }
	 * 
     * @return  -
	 */
	public FocusOptions20 createFocusOptions20() {
		return new FocusOptions20();
	}

	/**
	 * Create an instance of {@link ConfigDescriptionExtension }
	 * 
     * @return  -
	 */
	public ConfigDescriptionExtension createConfigDescriptionExtension() {
		return new ConfigDescriptionExtension();
	}

	/**
	 * Create an instance of {@link MulticastConfiguration }
	 * 
     * @return  -
	 */
	public MulticastConfiguration createMulticastConfiguration() {
		return new MulticastConfiguration();
	}

	/**
	 * Create an instance of {@link SourceIdentification }
	 * 
     * @return  -
	 */
	public SourceIdentification createSourceIdentification() {
		return new SourceIdentification();
	}

	/**
	 * Create an instance of {@link ZoomLimits }
	 * 
     * @return  -
	 */
	public ZoomLimits createZoomLimits() {
		return new ZoomLimits();
	}

	/**
	 * Create an instance of {@link ExposureOptions20 }
	 * 
     * @return  -
	 */
	public ExposureOptions20 createExposureOptions20() {
		return new ExposureOptions20();
	}

	/**
	 * Create an instance of {@link VideoOutput }
	 * 
     * @return  -
	 */
	public VideoOutput createVideoOutput() {
		return new VideoOutput();
	}

	/**
	 * Create an instance of {@link VideoEncoderConfigurationOptions }
	 * 
     * @return  -
	 */
	public VideoEncoderConfigurationOptions createVideoEncoderConfigurationOptions() {
		return new VideoEncoderConfigurationOptions();
	}

	/**
	 * Create an instance of {@link JpegOptions2 }
	 * 
     * @return  -
	 */
	public JpegOptions2 createJpegOptions2() {
		return new JpegOptions2();
	}

	/**
	 * Create an instance of {@link IPv6Configuration }
	 * 
     * @return  -
	 */
	public IPv6Configuration createIPv6Configuration() {
		return new IPv6Configuration();
	}

	/**
	 * Create an instance of {@link MetadataConfigurationOptions }
	 * 
     * @return  -
	 */
	public MetadataConfigurationOptions createMetadataConfigurationOptions() {
		return new MetadataConfigurationOptions();
	}

	/**
	 * Create an instance of {@link VideoResolution }
	 * 
     * @return  -
	 */
	public VideoResolution createVideoResolution() {
		return new VideoResolution();
	}

	/**
	 * Create an instance of {@link MetadataAttributes }
	 * 
     * @return  -
	 */
	public MetadataAttributes createMetadataAttributes() {
		return new MetadataAttributes();
	}

	/**
	 * Create an instance of {@link VideoSourceConfigurationOptions }
	 * 
     * @return  -
	 */
	public VideoSourceConfigurationOptions createVideoSourceConfigurationOptions() {
		return new VideoSourceConfigurationOptions();
	}

	/**
	 * Create an instance of {@link JpegDecOptions }
	 * 
     * @return  -
	 */
	public JpegDecOptions createJpegDecOptions() {
		return new JpegDecOptions();
	}

	/**
	 * Create an instance of {@link ItemListDescriptionExtension }
	 * 
     * @return  -
	 */
	public ItemListDescriptionExtension createItemListDescriptionExtension() {
		return new ItemListDescriptionExtension();
	}

	/**
	 * Create an instance of {@link GenericEapPwdConfigurationExtension }
	 * 
     * @return  -
	 */
	public GenericEapPwdConfigurationExtension createGenericEapPwdConfigurationExtension() {
		return new GenericEapPwdConfigurationExtension();
	}

	/**
	 * Create an instance of {@link LayoutOptionsExtension }
	 * 
     * @return  -
	 */
	public LayoutOptionsExtension createLayoutOptionsExtension() {
		return new LayoutOptionsExtension();
	}

	/**
	 * Create an instance of {@link Mpeg4Configuration }
	 * 
     * @return  -
	 */
	public Mpeg4Configuration createMpeg4Configuration() {
		return new Mpeg4Configuration();
	}

	/**
	 * Create an instance of {@link AudioSource }
	 * 
     * @return  -
	 */
	public AudioSource createAudioSource() {
		return new AudioSource();
	}

	/**
	 * Create an instance of {@link ImageStabilizationOptions }
	 * 
     * @return  -
	 */
	public ImageStabilizationOptions createImageStabilizationOptions() {
		return new ImageStabilizationOptions();
	}

	/**
	 * Create an instance of {@link EAPMethodConfiguration }
	 * 
     * @return  -
	 */
	public EAPMethodConfiguration createEAPMethodConfiguration() {
		return new EAPMethodConfiguration();
	}

	/**
	 * Create an instance of {@link FocusOptions20Extension }
	 * 
     * @return  -
	 */
	public FocusOptions20Extension createFocusOptions20Extension() {
		return new FocusOptions20Extension();
	}

	/**
	 * Create an instance of {@link ReverseOptions }
	 * 
     * @return  -
	 */
	public ReverseOptions createReverseOptions() {
		return new ReverseOptions();
	}

	/**
	 * Create an instance of {@link ColorspaceRange }
	 * 
     * @return  -
	 */
	public ColorspaceRange createColorspaceRange() {
		return new ColorspaceRange();
	}

	/**
	 * Create an instance of {@link FocusStatus20Extension }
	 * 
     * @return  -
	 */
	public FocusStatus20Extension createFocusStatus20Extension() {
		return new FocusStatus20Extension();
	}

	/**
	 * Create an instance of {@link H264Options2 }
	 * 
     * @return  -
	 */
	public H264Options2 createH264Options2() {
		return new H264Options2();
	}

	/**
	 * Create an instance of {@link H264DecOptions }
	 * 
     * @return  -
	 */
	public H264DecOptions createH264DecOptions() {
		return new H264DecOptions();
	}

	/**
	 * Create an instance of {@link OSDReference }
	 * 
     * @return  -
	 */
	public OSDReference createOSDReference() {
		return new OSDReference();
	}

	/**
	 * Create an instance of {@link AbsoluteFocus }
	 * 
     * @return  -
	 */
	public AbsoluteFocus createAbsoluteFocus() {
		return new AbsoluteFocus();
	}

	/**
	 * Create an instance of {@link PTZStatus }
	 * 
     * @return  -
	 */
	public PTZStatus createPTZStatus() {
		return new PTZStatus();
	}

	/**
	 * Create an instance of {@link DynamicDNSInformationExtension }
	 * 
     * @return  -
	 */
	public DynamicDNSInformationExtension createDynamicDNSInformationExtension() {
		return new DynamicDNSInformationExtension();
	}

	/**
	 * Create an instance of {@link IPv6NetworkInterfaceSetConfiguration }
	 * 
     * @return  -
	 */
	public IPv6NetworkInterfaceSetConfiguration createIPv6NetworkInterfaceSetConfiguration() {
		return new IPv6NetworkInterfaceSetConfiguration();
	}

	/**
	 * Create an instance of {@link RecordingJobConfiguration }
	 * 
     * @return  -
	 */
	public RecordingJobConfiguration createRecordingJobConfiguration() {
		return new RecordingJobConfiguration();
	}

	/**
	 * Create an instance of {@link AudioClassDescriptor }
	 * 
     * @return  -
	 */
	public AudioClassDescriptor createAudioClassDescriptor() {
		return new AudioClassDescriptor();
	}

	/**
	 * Create an instance of {@link TrackConfiguration }
	 * 
     * @return  -
	 */
	public TrackConfiguration createTrackConfiguration() {
		return new TrackConfiguration();
	}

	/**
	 * Create an instance of {@link Space2DDescription }
	 * 
     * @return  -
	 */
	public Space2DDescription createSpace2DDescription() {
		return new Space2DDescription();
	}

	/**
	 * Create an instance of {@link NetworkZeroConfigurationExtension2 }
	 * 
     * @return  -
	 */
	public NetworkZeroConfigurationExtension2 createNetworkZeroConfigurationExtension2() {
		return new NetworkZeroConfigurationExtension2();
	}

	/**
	 * Create an instance of {@link RecordingJobStateSource }
	 * 
     * @return  -
	 */
	public RecordingJobStateSource createRecordingJobStateSource() {
		return new RecordingJobStateSource();
	}

	/**
	 * Create an instance of {@link IOCapabilities }
	 * 
     * @return  -
	 */
	public IOCapabilities createIOCapabilities() {
		return new IOCapabilities();
	}

	/**
	 * Create an instance of {@link DateTimeRange }
	 * 
     * @return  -
	 */
	public DateTimeRange createDateTimeRange() {
		return new DateTimeRange();
	}

	/**
	 * Create an instance of {@link TrackAttributes }
	 * 
     * @return  -
	 */
	public TrackAttributes createTrackAttributes() {
		return new TrackAttributes();
	}

	/**
	 * Create an instance of {@link CertificateUsage }
	 * 
     * @return  -
	 */
	public CertificateUsage createCertificateUsage() {
		return new CertificateUsage();
	}

	/**
	 * Create an instance of {@link Transformation }
	 * 
     * @return  -
	 */
	public Transformation createTransformation() {
		return new Transformation();
	}

	/**
	 * Create an instance of {@link PaneLayoutOptions }
	 * 
     * @return  -
	 */
	public PaneLayoutOptions createPaneLayoutOptions() {
		return new PaneLayoutOptions();
	}

	/**
	 * Create an instance of {@link AnyHolder }
	 * 
     * @return  -
	 */
	public AnyHolder createAnyHolder() {
		return new AnyHolder();
	}

	/**
	 * Create an instance of {@link Space1DDescription }
	 * 
     * @return  -
	 */
	public Space1DDescription createSpace1DDescription() {
		return new Space1DDescription();
	}

	/**
	 * Create an instance of {@link PolylineArrayConfiguration }
	 * 
     * @return  -
	 */
	public PolylineArrayConfiguration createPolylineArrayConfiguration() {
		return new PolylineArrayConfiguration();
	}

	/**
	 * Create an instance of {@link ImageStabilization }
	 * 
     * @return  -
	 */
	public ImageStabilization createImageStabilization() {
		return new ImageStabilization();
	}

	/**
	 * Create an instance of {@link AudioClassDescriptorExtension }
	 * 
     * @return  -
	 */
	public AudioClassDescriptorExtension createAudioClassDescriptorExtension() {
		return new AudioClassDescriptorExtension();
	}

	/**
	 * Create an instance of {@link Dot11SecurityConfiguration }
	 * 
     * @return  -
	 */
	public Dot11SecurityConfiguration createDot11SecurityConfiguration() {
		return new Dot11SecurityConfiguration();
	}

	/**
	 * Create an instance of {@link IPv4NetworkInterfaceSetConfiguration }
	 * 
     * @return  -
	 */
	public IPv4NetworkInterfaceSetConfiguration createIPv4NetworkInterfaceSetConfiguration() {
		return new IPv4NetworkInterfaceSetConfiguration();
	}

	/**
	 * Create an instance of {@link Vector1D }
	 * 
     * @return  -
	 */
	public Vector1D createVector1D() {
		return new Vector1D();
	}

	/**
	 * Create an instance of {@link PTZPresetTourSupportedExtension }
	 * 
     * @return  -
	 */
	public PTZPresetTourSupportedExtension createPTZPresetTourSupportedExtension() {
		return new PTZPresetTourSupportedExtension();
	}

	/**
	 * Create an instance of {@link WhiteBalance }
	 * 
     * @return  -
	 */
	public WhiteBalance createWhiteBalance() {
		return new WhiteBalance();
	}

	/**
	 * Create an instance of {@link RecordingInformation }
	 * 
     * @return  -
	 */
	public RecordingInformation createRecordingInformation() {
		return new RecordingInformation();
	}

	/**
	 * Create an instance of {@link PTZPositionFilter }
	 * 
     * @return  -
	 */
	public PTZPositionFilter createPTZPositionFilter() {
		return new PTZPositionFilter();
	}

	/**
	 * Create an instance of {@link ImagingSettings }
	 * 
     * @return  -
	 */
	public ImagingSettings createImagingSettings() {
		return new ImagingSettings();
	}

	/**
	 * Create an instance of {@link Color }
	 * 
     * @return  -
	 */
	public Color createColor() {
		return new Color();
	}

	/**
	 * Create an instance of {@link NetworkCapabilitiesExtension2 }
	 * 
     * @return  -
	 */
	public NetworkCapabilitiesExtension2 createNetworkCapabilitiesExtension2() {
		return new NetworkCapabilitiesExtension2();
	}

	/**
	 * Create an instance of {@link MediaUri }
	 * 
     * @return  -
	 */
	public MediaUri createMediaUri() {
		return new MediaUri();
	}

	/**
	 * Create an instance of {@link FindPTZPositionResult }
	 * 
     * @return  -
	 */
	public FindPTZPositionResult createFindPTZPositionResult() {
		return new FindPTZPositionResult();
	}

	/**
	 * Create an instance of {@link GetRecordingsResponseItem }
	 * 
     * @return  -
	 */
	public GetRecordingsResponseItem createGetRecordingsResponseItem() {
		return new GetRecordingsResponseItem();
	}

	/**
	 * Create an instance of {@link Vector2D }
	 * 
     * @return  -
	 */
	public Vector2D createVector2D() {
		return new Vector2D();
	}

	/**
	 * Create an instance of {@link ObjectTreeExtension }
	 * 
     * @return  -
	 */
	public ObjectTreeExtension createObjectTreeExtension() {
		return new ObjectTreeExtension();
	}

	/**
	 * Create an instance of {@link RecordingJobStateTrack }
	 * 
     * @return  -
	 */
	public RecordingJobStateTrack createRecordingJobStateTrack() {
		return new RecordingJobStateTrack();
	}

	/**
	 * Create an instance of {@link PTZConfigurationExtension }
	 * 
     * @return  -
	 */
	public PTZConfigurationExtension createPTZConfigurationExtension() {
		return new PTZConfigurationExtension();
	}

	/**
	 * Create an instance of {@link NetworkInterfaceLink }
	 * 
     * @return  -
	 */
	public NetworkInterfaceLink createNetworkInterfaceLink() {
		return new NetworkInterfaceLink();
	}

	/**
	 * Create an instance of {@link AudioSourceConfigurationOptions }
	 * 
     * @return  -
	 */
	public AudioSourceConfigurationOptions createAudioSourceConfigurationOptions() {
		return new AudioSourceConfigurationOptions();
	}

	/**
	 * Create an instance of {@link ReverseOptionsExtension }
	 * 
     * @return  -
	 */
	public ReverseOptionsExtension createReverseOptionsExtension() {
		return new ReverseOptionsExtension();
	}

	/**
	 * Create an instance of {@link MessageDescription }
	 * 
     * @return  -
	 */
	public MessageDescription createMessageDescription() {
		return new MessageDescription();
	}

	/**
	 * Create an instance of {@link JpegOptions }
	 * 
     * @return  -
	 */
	public JpegOptions createJpegOptions() {
		return new JpegOptions();
	}

	/**
	 * Create an instance of {@link IntRectangleRange }
	 * 
     * @return  -
	 */
	public IntRectangleRange createIntRectangleRange() {
		return new IntRectangleRange();
	}

	/**
	 * Create an instance of {@link EFlipOptions }
	 * 
     * @return  -
	 */
	public EFlipOptions createEFlipOptions() {
		return new EFlipOptions();
	}

	/**
	 * Create an instance of {@link AnalyticsStateInformation }
	 * 
     * @return  -
	 */
	public AnalyticsStateInformation createAnalyticsStateInformation() {
		return new AnalyticsStateInformation();
	}

	/**
	 * Create an instance of {@link IPv6NetworkInterface }
	 * 
     * @return  -
	 */
	public IPv6NetworkInterface createIPv6NetworkInterface() {
		return new IPv6NetworkInterface();
	}

	/**
	 * Create an instance of {@link AudioDescriptor }
	 * 
     * @return  -
	 */
	public AudioDescriptor createAudioDescriptor() {
		return new AudioDescriptor();
	}

	/**
	 * Create an instance of {@link ProfileCapabilities }
	 * 
     * @return  -
	 */
	public ProfileCapabilities createProfileCapabilities() {
		return new ProfileCapabilities();
	}

	/**
	 * Create an instance of {@link BacklightCompensation20 }
	 * 
     * @return  -
	 */
	public BacklightCompensation20 createBacklightCompensation20() {
		return new BacklightCompensation20();
	}

	/**
	 * Create an instance of {@link ImageStabilizationExtension }
	 * 
     * @return  -
	 */
	public ImageStabilizationExtension createImageStabilizationExtension() {
		return new ImageStabilizationExtension();
	}

	/**
	 * Create an instance of {@link EventStreamExtension }
	 * 
     * @return  -
	 */
	public EventStreamExtension createEventStreamExtension() {
		return new EventStreamExtension();
	}

	/**
	 * Create an instance of {@link IOCapabilitiesExtension }
	 * 
     * @return  -
	 */
	public IOCapabilitiesExtension createIOCapabilitiesExtension() {
		return new IOCapabilitiesExtension();
	}

	/**
	 * Create an instance of {@link OSDConfigurationOptions }
	 * 
     * @return  -
	 */
	public OSDConfigurationOptions createOSDConfigurationOptions() {
		return new OSDConfigurationOptions();
	}

	/**
	 * Create an instance of {@link FocusStatus20 }
	 * 
     * @return  -
	 */
	public FocusStatus20 createFocusStatus20() {
		return new FocusStatus20();
	}

	/**
	 * Create an instance of {@link RelativeFocusOptions20 }
	 * 
     * @return  -
	 */
	public RelativeFocusOptions20 createRelativeFocusOptions20() {
		return new RelativeFocusOptions20();
	}

	/**
	 * Create an instance of {@link MetadataInputExtension }
	 * 
     * @return  -
	 */
	public MetadataInputExtension createMetadataInputExtension() {
		return new MetadataInputExtension();
	}

	/**
	 * Create an instance of {@link AudioAnalyticsStreamExtension }
	 * 
     * @return  -
	 */
	public AudioAnalyticsStreamExtension createAudioAnalyticsStreamExtension() {
		return new AudioAnalyticsStreamExtension();
	}

	/**
	 * Create an instance of {@link AudioAnalyticsStream }
	 * 
     * @return  -
	 */
	public AudioAnalyticsStream createAudioAnalyticsStream() {
		return new AudioAnalyticsStream();
	}

	/**
	 * Create an instance of {@link OSDColorOptionsExtension }
	 * 
     * @return  -
	 */
	public OSDColorOptionsExtension createOSDColorOptionsExtension() {
		return new OSDColorOptionsExtension();
	}

	/**
	 * Create an instance of {@link EventCapabilities }
	 * 
     * @return  -
	 */
	public EventCapabilities createEventCapabilities() {
		return new EventCapabilities();
	}

	/**
	 * Create an instance of {@link AudioEncoderConfigurationOption }
	 * 
     * @return  -
	 */
	public AudioEncoderConfigurationOption createAudioEncoderConfigurationOption() {
		return new AudioEncoderConfigurationOption();
	}

	/**
	 * Create an instance of {@link BacklightCompensationOptions20 }
	 * 
     * @return  -
	 */
	public BacklightCompensationOptions20 createBacklightCompensationOptions20() {
		return new BacklightCompensationOptions20();
	}

	/**
	 * Create an instance of {@link MetadataFilter }
	 * 
     * @return  -
	 */
	public MetadataFilter createMetadataFilter() {
		return new MetadataFilter();
	}

	/**
	 * Create an instance of {@link PTZNodeExtension }
	 * 
     * @return  -
	 */
	public PTZNodeExtension createPTZNodeExtension() {
		return new PTZNodeExtension();
	}

	/**
	 * Create an instance of {@link ImagingStatus }
	 * 
     * @return  -
	 */
	public ImagingStatus createImagingStatus() {
		return new ImagingStatus();
	}

	/**
	 * Create an instance of {@link WhiteBalance20 }
	 * 
     * @return  -
	 */
	public WhiteBalance20 createWhiteBalance20() {
		return new WhiteBalance20();
	}

	/**
	 * Create an instance of {@link OSDConfiguration }
	 * 
     * @return  -
	 */
	public OSDConfiguration createOSDConfiguration() {
		return new OSDConfiguration();
	}

	/**
	 * Create an instance of {@link FocusStatus }
	 * 
     * @return  -
	 */
	public FocusStatus createFocusStatus() {
		return new FocusStatus();
	}

	/**
	 * Create an instance of {@link Frame }
	 * 
     * @return  -
	 */
	public Frame createFrame() {
		return new Frame();
	}

	/**
	 * Create an instance of {@link IPAddressFilterExtension }
	 * 
     * @return  -
	 */
	public IPAddressFilterExtension createIPAddressFilterExtension() {
		return new IPAddressFilterExtension();
	}

	/**
	 * Create an instance of {@link ReplayCapabilities }
	 * 
     * @return  -
	 */
	public ReplayCapabilities createReplayCapabilities() {
		return new ReplayCapabilities();
	}

	/**
	 * Create an instance of {@link ContinuousFocus }
	 * 
     * @return  -
	 */
	public ContinuousFocus createContinuousFocus() {
		return new ContinuousFocus();
	}

	/**
	 * Create an instance of {@link MotionExpressionConfiguration }
	 * 
     * @return  -
	 */
	public MotionExpressionConfiguration createMotionExpressionConfiguration() {
		return new MotionExpressionConfiguration();
	}

	/**
	 * Create an instance of {@link RecordingJobConfigurationExtension }
	 * 
     * @return  -
	 */
	public RecordingJobConfigurationExtension createRecordingJobConfigurationExtension() {
		return new RecordingJobConfigurationExtension();
	}

	/**
	 * Create an instance of {@link PTZPresetTourOptions }
	 * 
     * @return  -
	 */
	public PTZPresetTourOptions createPTZPresetTourOptions() {
		return new PTZPresetTourOptions();
	}

	/**
	 * Create an instance of {@link StreamSetup }
	 * 
     * @return  -
	 */
	public StreamSetup createStreamSetup() {
		return new StreamSetup();
	}

	/**
	 * Create an instance of {@link IntRectangle }
	 * 
     * @return  -
	 */
	public IntRectangle createIntRectangle() {
		return new IntRectangle();
	}

	/**
	 * Create an instance of {@link VideoDecoderConfigurationOptionsExtension }
	 * 
     * @return  -
	 */
	public VideoDecoderConfigurationOptionsExtension createVideoDecoderConfigurationOptionsExtension() {
		return new VideoDecoderConfigurationOptionsExtension();
	}

	/**
	 * Create an instance of {@link PTControlDirection }
	 * 
     * @return  -
	 */
	public PTControlDirection createPTControlDirection() {
		return new PTControlDirection();
	}

	/**
	 * Create an instance of {@link VideoRateControl }
	 * 
     * @return  -
	 */
	public VideoRateControl createVideoRateControl() {
		return new VideoRateControl();
	}

	/**
	 * Create an instance of {@link RelativeFocus }
	 * 
     * @return  -
	 */
	public RelativeFocus createRelativeFocus() {
		return new RelativeFocus();
	}

	/**
	 * Create an instance of {@link GetTracksResponseItem }
	 * 
     * @return  -
	 */
	public GetTracksResponseItem createGetTracksResponseItem() {
		return new GetTracksResponseItem();
	}

	/**
	 * Create an instance of {@link Vector }
	 * 
     * @return  -
	 */
	public Vector createVector() {
		return new Vector();
	}

	/**
	 * Create an instance of {@link FocusConfiguration }
	 * 
     * @return  -
	 */
	public FocusConfiguration createFocusConfiguration() {
		return new FocusConfiguration();
	}

	/**
	 * Create an instance of {@link ProfileExtension }
	 * 
     * @return  -
	 */
	public ProfileExtension createProfileExtension() {
		return new ProfileExtension();
	}

	/**
	 * Create an instance of {@link BehaviourExtension }
	 * 
     * @return  -
	 */
	public BehaviourExtension createBehaviourExtension() {
		return new BehaviourExtension();
	}

	/**
	 * Create an instance of {@link IrCutFilterAutoAdjustmentExtension }
	 * 
     * @return  -
	 */
	public IrCutFilterAutoAdjustmentExtension createIrCutFilterAutoAdjustmentExtension() {
		return new IrCutFilterAutoAdjustmentExtension();
	}

	/**
	 * Create an instance of {@link ImagingOptions20Extension2 }
	 * 
     * @return  -
	 */
	public ImagingOptions20Extension2 createImagingOptions20Extension2() {
		return new ImagingOptions20Extension2();
	}

	/**
	 * Create an instance of {@link NetworkCapabilities }
	 * 
     * @return  -
	 */
	public NetworkCapabilities createNetworkCapabilities() {
		return new NetworkCapabilities();
	}

	/**
	 * Create an instance of {@link ImagingOptions20Extension3 }
	 * 
     * @return  -
	 */
	public ImagingOptions20Extension3 createImagingOptions20Extension3() {
		return new ImagingOptions20Extension3();
	}

	/**
	 * Create an instance of {@link RecordingJobStateInformationExtension }
	 * 
     * @return  -
	 */
	public RecordingJobStateInformationExtension createRecordingJobStateInformationExtension() {
		return new RecordingJobStateInformationExtension();
	}

	/**
	 * Create an instance of {@link ObjectTree }
	 * 
     * @return  -
	 */
	public ObjectTree createObjectTree() {
		return new ObjectTree();
	}

	/**
	 * Create an instance of {@link PTZCapabilities }
	 * 
     * @return  -
	 */
	public PTZCapabilities createPTZCapabilities() {
		return new PTZCapabilities();
	}

	/**
	 * Create an instance of {@link FocusConfiguration20 }
	 * 
     * @return  -
	 */
	public FocusConfiguration20 createFocusConfiguration20() {
		return new FocusConfiguration20();
	}

	/**
	 * Create an instance of {@link OSDImgConfigurationExtension }
	 * 
     * @return  -
	 */
	public OSDImgConfigurationExtension createOSDImgConfigurationExtension() {
		return new OSDImgConfigurationExtension();
	}

	/**
	 * Create an instance of {@link TrackAttributesExtension }
	 * 
     * @return  -
	 */
	public TrackAttributesExtension createTrackAttributesExtension() {
		return new TrackAttributesExtension();
	}

	/**
	 * Create an instance of {@link SystemCapabilities }
	 * 
     * @return  -
	 */
	public SystemCapabilities createSystemCapabilities() {
		return new SystemCapabilities();
	}

	/**
	 * Create an instance of {@link WhiteBalanceOptions20Extension }
	 * 
     * @return  -
	 */
	public WhiteBalanceOptions20Extension createWhiteBalanceOptions20Extension() {
		return new WhiteBalanceOptions20Extension();
	}

	/**
	 * Create an instance of {@link NetworkInterfaceInfo }
	 * 
     * @return  -
	 */
	public NetworkInterfaceInfo createNetworkInterfaceInfo() {
		return new NetworkInterfaceInfo();
	}

	/**
	 * Create an instance of {@link VideoSourceExtension2 }
	 * 
     * @return  -
	 */
	public VideoSourceExtension2 createVideoSourceExtension2() {
		return new VideoSourceExtension2();
	}

	/**
	 * Create an instance of {@link FindMetadataResultList }
	 * 
     * @return  -
	 */
	public FindMetadataResultList createFindMetadataResultList() {
		return new FindMetadataResultList();
	}

	/**
	 * Create an instance of {@link AnalyticsEngineInputInfoExtension }
	 * 
     * @return  -
	 */
	public AnalyticsEngineInputInfoExtension createAnalyticsEngineInputInfoExtension() {
		return new AnalyticsEngineInputInfoExtension();
	}

	/**
	 * Create an instance of {@link ReceiverCapabilities }
	 * 
     * @return  -
	 */
	public ReceiverCapabilities createReceiverCapabilities() {
		return new ReceiverCapabilities();
	}

	/**
	 * Create an instance of {@link FindRecordingResultList }
	 * 
     * @return  -
	 */
	public FindRecordingResultList createFindRecordingResultList() {
		return new FindRecordingResultList();
	}

	/**
	 * Create an instance of {@link SystemDateTimeExtension }
	 * 
     * @return  -
	 */
	public SystemDateTimeExtension createSystemDateTimeExtension() {
		return new SystemDateTimeExtension();
	}

	/**
	 * Create an instance of {@link FindPTZPositionResultList }
	 * 
     * @return  -
	 */
	public FindPTZPositionResultList createFindPTZPositionResultList() {
		return new FindPTZPositionResultList();
	}

	/**
	 * Create an instance of {@link RuleEngineConfigurationExtension }
	 * 
     * @return  -
	 */
	public RuleEngineConfigurationExtension createRuleEngineConfigurationExtension() {
		return new RuleEngineConfigurationExtension();
	}

	/**
	 * Create an instance of {@link ClassDescriptorExtension }
	 * 
     * @return  -
	 */
	public ClassDescriptorExtension createClassDescriptorExtension() {
		return new ClassDescriptorExtension();
	}

	/**
	 * Create an instance of {@link NetworkInterfaceSetConfigurationExtension2 }
	 * 
     * @return  -
	 */
	public NetworkInterfaceSetConfigurationExtension2 createNetworkInterfaceSetConfigurationExtension2() {
		return new NetworkInterfaceSetConfigurationExtension2();
	}

	/**
	 * Create an instance of {@link Dot3Configuration }
	 * 
     * @return  -
	 */
	public Dot3Configuration createDot3Configuration() {
		return new Dot3Configuration();
	}

	/**
	 * Create an instance of {@link OSDTextConfigurationExtension }
	 * 
     * @return  -
	 */
	public OSDTextConfigurationExtension createOSDTextConfigurationExtension() {
		return new OSDTextConfigurationExtension();
	}

	/**
	 * Create an instance of {@link AnalyticsEngineInputInfo }
	 * 
     * @return  -
	 */
	public AnalyticsEngineInputInfo createAnalyticsEngineInputInfo() {
		return new AnalyticsEngineInputInfo();
	}

	/**
	 * Create an instance of {@link VideoOutputExtension }
	 * 
     * @return  -
	 */
	public VideoOutputExtension createVideoOutputExtension() {
		return new VideoOutputExtension();
	}

	/**
	 * Create an instance of {@link ExposureOptions }
	 * 
     * @return  -
	 */
	public ExposureOptions createExposureOptions() {
		return new ExposureOptions();
	}

	/**
	 * Create an instance of {@link VideoSourceConfigurationOptionsExtension2 }
	 * 
     * @return  -
	 */
	public VideoSourceConfigurationOptionsExtension2 createVideoSourceConfigurationOptionsExtension2() {
		return new VideoSourceConfigurationOptionsExtension2();
	}

	/**
	 * Create an instance of {@link ReplayConfiguration }
	 * 
     * @return  -
	 */
	public ReplayConfiguration createReplayConfiguration() {
		return new ReplayConfiguration();
	}

	/**
	 * Create an instance of {@link IrCutFilterAutoAdjustmentOptionsExtension }
	 * 
     * @return  -
	 */
	public IrCutFilterAutoAdjustmentOptionsExtension createIrCutFilterAutoAdjustmentOptionsExtension() {
		return new IrCutFilterAutoAdjustmentOptionsExtension();
	}

	/**
	 * Create an instance of {@link OSDColorOptions }
	 * 
     * @return  -
	 */
	public OSDColorOptions createOSDColorOptions() {
		return new OSDColorOptions();
	}

	/**
	 * Create an instance of {@link PTZStatusFilterOptions }
	 * 
     * @return  -
	 */
	public PTZStatusFilterOptions createPTZStatusFilterOptions() {
		return new PTZStatusFilterOptions();
	}

	/**
	 * Create an instance of {@link SystemCapabilitiesExtension2 }
	 * 
     * @return  -
	 */
	public SystemCapabilitiesExtension2 createSystemCapabilitiesExtension2() {
		return new SystemCapabilitiesExtension2();
	}

	/**
	 * Create an instance of {@link VideoEncoderOptionsExtension2 }
	 * 
     * @return  -
	 */
	public VideoEncoderOptionsExtension2 createVideoEncoderOptionsExtension2() {
		return new VideoEncoderOptionsExtension2();
	}

	/**
	 * Create an instance of {@link RelativeFocusOptions }
	 * 
     * @return  -
	 */
	public RelativeFocusOptions createRelativeFocusOptions() {
		return new RelativeFocusOptions();
	}

	/**
	 * Create an instance of {@link VideoSourceConfigurationExtension2 }
	 * 
     * @return  -
	 */
	public VideoSourceConfigurationExtension2 createVideoSourceConfigurationExtension2() {
		return new VideoSourceConfigurationExtension2();
	}

	/**
	 * Create an instance of {@link FocusMove }
	 * 
     * @return  -
	 */
	public FocusMove createFocusMove() {
		return new FocusMove();
	}

	/**
	 * Create an instance of {@link AnalyticsEngineControl }
	 * 
     * @return  -
	 */
	public AnalyticsEngineControl createAnalyticsEngineControl() {
		return new AnalyticsEngineControl();
	}

	/**
	 * Create an instance of {@link ObjectId }
	 * 
     * @return  -
	 */
	public ObjectId createObjectId() {
		return new ObjectId();
	}

	/**
	 * Create an instance of {@link CellLayout }
	 * 
     * @return  -
	 */
	public CellLayout createCellLayout() {
		return new CellLayout();
	}

	/**
	 * Create an instance of {@link Profile }
	 * 
     * @return  -
	 */
	public Profile createProfile() {
		return new Profile();
	}

	/**
	 * Create an instance of {@link ImagingSettingsExtension202 }
	 * 
     * @return  -
	 */
	public ImagingSettingsExtension202 createImagingSettingsExtension202() {
		return new ImagingSettingsExtension202();
	}

	/**
	 * Create an instance of {@link SearchScopeExtension }
	 * 
     * @return  -
	 */
	public SearchScopeExtension createSearchScopeExtension() {
		return new SearchScopeExtension();
	}

	/**
	 * Create an instance of {@link ImagingSettingsExtension203 }
	 * 
     * @return  -
	 */
	public ImagingSettingsExtension203 createImagingSettingsExtension203() {
		return new ImagingSettingsExtension203();
	}

	/**
	 * Create an instance of {@link ImageStabilizationOptionsExtension }
	 * 
     * @return  -
	 */
	public ImageStabilizationOptionsExtension createImageStabilizationOptionsExtension() {
		return new ImageStabilizationOptionsExtension();
	}

	/**
	 * Create an instance of {@link ColorDescriptorExtension }
	 * 
     * @return  -
	 */
	public ColorDescriptorExtension createColorDescriptorExtension() {
		return new ColorDescriptorExtension();
	}

	/**
	 * Create an instance of {@link Layout }
	 * 
     * @return  -
	 */
	public Layout createLayout() {
		return new Layout();
	}

	/**
	 * Create an instance of {@link NetworkInterfaceSetConfigurationExtension }
	 * 
     * @return  -
	 */
	public NetworkInterfaceSetConfigurationExtension createNetworkInterfaceSetConfigurationExtension() {
		return new NetworkInterfaceSetConfigurationExtension();
	}

	/**
	 * Create an instance of {@link SecurityCapabilities }
	 * 
     * @return  -
	 */
	public SecurityCapabilities createSecurityCapabilities() {
		return new SecurityCapabilities();
	}

	/**
	 * Create an instance of {@link IOCapabilitiesExtension2 }
	 * 
     * @return  -
	 */
	public IOCapabilitiesExtension2 createIOCapabilitiesExtension2() {
		return new IOCapabilitiesExtension2();
	}

	/**
	 * Create an instance of {@link AppearanceExtension }
	 * 
     * @return  -
	 */
	public AppearanceExtension createAppearanceExtension() {
		return new AppearanceExtension();
	}

	/**
	 * Create an instance of {@link RecordingJobSourceExtension }
	 * 
     * @return  -
	 */
	public RecordingJobSourceExtension createRecordingJobSourceExtension() {
		return new RecordingJobSourceExtension();
	}

	/**
	 * Create an instance of {@link FindEventResult }
	 * 
     * @return  -
	 */
	public FindEventResult createFindEventResult() {
		return new FindEventResult();
	}

	/**
	 * Create an instance of {@link RecordingConfiguration }
	 * 
     * @return  -
	 */
	public RecordingConfiguration createRecordingConfiguration() {
		return new RecordingConfiguration();
	}

	/**
	 * Create an instance of {@link FloatList }
	 * 
     * @return  -
	 */
	public FloatList createFloatList() {
		return new FloatList();
	}

	/**
	 * Create an instance of {@link PaneConfiguration }
	 * 
     * @return  -
	 */
	public PaneConfiguration createPaneConfiguration() {
		return new PaneConfiguration();
	}

	/**
	 * Create an instance of {@link MediaCapabilitiesExtension }
	 * 
     * @return  -
	 */
	public MediaCapabilitiesExtension createMediaCapabilitiesExtension() {
		return new MediaCapabilitiesExtension();
	}

	/**
	 * Create an instance of {@link IPv4NetworkInterface }
	 * 
     * @return  -
	 */
	public IPv4NetworkInterface createIPv4NetworkInterface() {
		return new IPv4NetworkInterface();
	}

	/**
	 * Create an instance of {@link VideoEncoderOptionsExtension }
	 * 
     * @return  -
	 */
	public VideoEncoderOptionsExtension createVideoEncoderOptionsExtension() {
		return new VideoEncoderOptionsExtension();
	}

	/**
	 * Create an instance of {@link AudioSourceOptionsExtension }
	 * 
     * @return  -
	 */
	public AudioSourceOptionsExtension createAudioSourceOptionsExtension() {
		return new AudioSourceOptionsExtension();
	}

	/**
	 * Create an instance of {@link PTZPresetTourSupported }
	 * 
     * @return  -
	 */
	public PTZPresetTourSupported createPTZPresetTourSupported() {
		return new PTZPresetTourSupported();
	}

	/**
	 * Create an instance of {@link IntList }
	 * 
     * @return  -
	 */
	public IntList createIntList() {
		return new IntList();
	}

	/**
	 * Create an instance of {@link CertificateInformationExtension }
	 * 
     * @return  -
	 */
	public CertificateInformationExtension createCertificateInformationExtension() {
		return new CertificateInformationExtension();
	}

	/**
	 * Create an instance of {@link PTZPresetTourStartingConditionExtension }
	 * 
     * @return  -
	 */
	public PTZPresetTourStartingConditionExtension createPTZPresetTourStartingConditionExtension() {
		return new PTZPresetTourStartingConditionExtension();
	}

	/**
	 * Create an instance of {@link LayoutOptions }
	 * 
     * @return  -
	 */
	public LayoutOptions createLayoutOptions() {
		return new LayoutOptions();
	}

	/**
	 * Create an instance of {@link ContinuousFocusOptions }
	 * 
     * @return  -
	 */
	public ContinuousFocusOptions createContinuousFocusOptions() {
		return new ContinuousFocusOptions();
	}

	/**
	 * Create an instance of {@link MetadataConfigurationExtension }
	 * 
     * @return  -
	 */
	public MetadataConfigurationExtension createMetadataConfigurationExtension() {
		return new MetadataConfigurationExtension();
	}

	/**
	 * Create an instance of {@link CapabilitiesExtension }
	 * 
     * @return  -
	 */
	public CapabilitiesExtension createCapabilitiesExtension() {
		return new CapabilitiesExtension();
	}

	/**
	 * Create an instance of {@link PTZStreamExtension }
	 * 
     * @return  -
	 */
	public PTZStreamExtension createPTZStreamExtension() {
		return new PTZStreamExtension();
	}

	/**
	 * Create an instance of {@link AudioDecoderConfigurationOptions }
	 * 
     * @return  -
	 */
	public AudioDecoderConfigurationOptions createAudioDecoderConfigurationOptions() {
		return new AudioDecoderConfigurationOptions();
	}

	/**
	 * Create an instance of {@link DurationRange }
	 * 
     * @return  -
	 */
	public DurationRange createDurationRange() {
		return new DurationRange();
	}

	/**
	 * Create an instance of {@link AudioEncoderConfigurationOptions }
	 * 
     * @return  -
	 */
	public AudioEncoderConfigurationOptions createAudioEncoderConfigurationOptions() {
		return new AudioEncoderConfigurationOptions();
	}

	/**
	 * Create an instance of {@link SystemLogUri }
	 * 
     * @return  -
	 */
	public SystemLogUri createSystemLogUri() {
		return new SystemLogUri();
	}

	/**
	 * Create an instance of {@link AnalyticsEngineConfigurationExtension }
	 * 
     * @return  -
	 */
	public AnalyticsEngineConfigurationExtension createAnalyticsEngineConfigurationExtension() {
		return new AnalyticsEngineConfigurationExtension();
	}

	/**
	 * Create an instance of {@link Mpeg4Options }
	 * 
     * @return  -
	 */
	public Mpeg4Options createMpeg4Options() {
		return new Mpeg4Options();
	}

	/**
	 * Create an instance of {@link PTZFilter }
	 * 
     * @return  -
	 */
	public PTZFilter createPTZFilter() {
		return new PTZFilter();
	}

	/**
	 * Create an instance of {@link DeviceCapabilitiesExtension }
	 * 
     * @return  -
	 */
	public DeviceCapabilitiesExtension createDeviceCapabilitiesExtension() {
		return new DeviceCapabilitiesExtension();
	}

	/**
	 * Create an instance of {@link Dot11AvailableNetworksExtension }
	 * 
     * @return  -
	 */
	public Dot11AvailableNetworksExtension createDot11AvailableNetworksExtension() {
		return new Dot11AvailableNetworksExtension();
	}

	/**
	 * Create an instance of {@link Dot11PSKSet }
	 * 
     * @return  -
	 */
	public Dot11PSKSet createDot11PSKSet() {
		return new Dot11PSKSet();
	}

	/**
	 * Create an instance of {@link AnalyticsCapabilities }
	 * 
     * @return  -
	 */
	public AnalyticsCapabilities createAnalyticsCapabilities() {
		return new AnalyticsCapabilities();
	}

	/**
	 * Create an instance of {@link EapMethodExtension }
	 * 
     * @return  -
	 */
	public EapMethodExtension createEapMethodExtension() {
		return new EapMethodExtension();
	}

	/**
	 * Create an instance of {@link PTZPreset }
	 * 
     * @return  -
	 */
	public PTZPreset createPTZPreset() {
		return new PTZPreset();
	}

	/**
	 * Create an instance of {@link WideDynamicRange }
	 * 
     * @return  -
	 */
	public WideDynamicRange createWideDynamicRange() {
		return new WideDynamicRange();
	}

	/**
	 * Create an instance of {@link FocusConfiguration20Extension }
	 * 
     * @return  -
	 */
	public FocusConfiguration20Extension createFocusConfiguration20Extension() {
		return new FocusConfiguration20Extension();
	}

	/**
	 * Create an instance of {@link UserExtension }
	 * 
     * @return  -
	 */
	public UserExtension createUserExtension() {
		return new UserExtension();
	}

	/**
	 * Create an instance of {@link PTZSpaces }
	 * 
     * @return  -
	 */
	public PTZSpaces createPTZSpaces() {
		return new PTZSpaces();
	}

	/**
	 * Create an instance of {@link SupportedAnalyticsModulesExtension }
	 * 
     * @return  -
	 */
	public SupportedAnalyticsModulesExtension createSupportedAnalyticsModulesExtension() {
		return new SupportedAnalyticsModulesExtension();
	}

	/**
	 * Create an instance of {@link SupportedRulesExtension }
	 * 
     * @return  -
	 */
	public SupportedRulesExtension createSupportedRulesExtension() {
		return new SupportedRulesExtension();
	}

	/**
	 * Create an instance of {@link Exposure20 }
	 * 
     * @return  -
	 */
	public Exposure20 createExposure20() {
		return new Exposure20();
	}

	/**
	 * Create an instance of {@link AnalyticsEngineConfiguration }
	 * 
     * @return  -
	 */
	public AnalyticsEngineConfiguration createAnalyticsEngineConfiguration() {
		return new AnalyticsEngineConfiguration();
	}

	/**
	 * Create an instance of {@link IPv4Configuration }
	 * 
     * @return  -
	 */
	public IPv4Configuration createIPv4Configuration() {
		return new IPv4Configuration();
	}

	/**
	 * Create an instance of {@link Exposure }
	 * 
     * @return  -
	 */
	public Exposure createExposure() {
		return new Exposure();
	}

	/**
	 * Create an instance of {@link ClassDescriptorExtension2 }
	 * 
     * @return  -
	 */
	public ClassDescriptorExtension2 createClassDescriptorExtension2() {
		return new ClassDescriptorExtension2();
	}

	/**
	 * Create an instance of {@link Dot1XConfigurationExtension }
	 * 
     * @return  -
	 */
	public Dot1XConfigurationExtension createDot1XConfigurationExtension() {
		return new Dot1XConfigurationExtension();
	}

	/**
	 * Create an instance of {@link ShapeDescriptor }
	 * 
     * @return  -
	 */
	public ShapeDescriptor createShapeDescriptor() {
		return new ShapeDescriptor();
	}

	/**
	 * Create an instance of {@link MetadataStreamExtension }
	 * 
     * @return  -
	 */
	public MetadataStreamExtension createMetadataStreamExtension() {
		return new MetadataStreamExtension();
	}

	/**
	 * Create an instance of {@link OtherType }
	 * 
     * @return  -
	 */
	public OtherType createOtherType() {
		return new OtherType();
	}

	/**
	 * Create an instance of {@link SearchScope }
	 * 
     * @return  -
	 */
	public SearchScope createSearchScope() {
		return new SearchScope();
	}

	/**
	 * Create an instance of {@link VideoSourceExtension }
	 * 
     * @return  -
	 */
	public VideoSourceExtension createVideoSourceExtension() {
		return new VideoSourceExtension();
	}

	/**
	 * Create an instance of {@link PTZPresetTourStartingCondition }
	 * 
     * @return  -
	 */
	public PTZPresetTourStartingCondition createPTZPresetTourStartingCondition() {
		return new PTZPresetTourStartingCondition();
	}

	/**
	 * Create an instance of {@link EngineConfiguration }
	 * 
     * @return  -
	 */
	public EngineConfiguration createEngineConfiguration() {
		return new EngineConfiguration();
	}

	/**
	 * Create an instance of {@link SecurityCapabilitiesExtension }
	 * 
     * @return  -
	 */
	public SecurityCapabilitiesExtension createSecurityCapabilitiesExtension() {
		return new SecurityCapabilitiesExtension();
	}

	/**
	 * Create an instance of {@link FrameExtension2 }
	 * 
     * @return  -
	 */
	public FrameExtension2 createFrameExtension2() {
		return new FrameExtension2();
	}

	/**
	 * Create an instance of {@link AudioOutput }
	 * 
     * @return  -
	 */
	public AudioOutput createAudioOutput() {
		return new AudioOutput();
	}

	/**
	 * Create an instance of {@link RecordingJobStateTracks }
	 * 
     * @return  -
	 */
	public RecordingJobStateTracks createRecordingJobStateTracks() {
		return new RecordingJobStateTracks();
	}

	/**
	 * Create an instance of {@link PTZConfigurationOptions2 }
	 * 
     * @return  -
	 */
	public PTZConfigurationOptions2 createPTZConfigurationOptions2() {
		return new PTZConfigurationOptions2();
	}

	/**
	 * Create an instance of {@link PrefixedIPv6Address }
	 * 
     * @return  -
	 */
	public PrefixedIPv6Address createPrefixedIPv6Address() {
		return new PrefixedIPv6Address();
	}

	/**
	 * Create an instance of {@link IntRange }
	 * 
     * @return  -
	 */
	public IntRange createIntRange() {
		return new IntRange();
	}

	/**
	 * Create an instance of {@link TransformationExtension }
	 * 
     * @return  -
	 */
	public TransformationExtension createTransformationExtension() {
		return new TransformationExtension();
	}

	/**
	 * Create an instance of {@link GetRecordingJobsResponseItem }
	 * 
     * @return  -
	 */
	public GetRecordingJobsResponseItem createGetRecordingJobsResponseItem() {
		return new GetRecordingJobsResponseItem();
	}

	/**
	 * Create an instance of {@link CodingCapabilities }
	 * 
     * @return  -
	 */
	public CodingCapabilities createCodingCapabilities() {
		return new CodingCapabilities();
	}

	/**
	 * Create an instance of {@link RealTimeStreamingCapabilitiesExtension }
	 * 
     * @return  -
	 */
	public RealTimeStreamingCapabilitiesExtension createRealTimeStreamingCapabilitiesExtension() {
		return new RealTimeStreamingCapabilitiesExtension();
	}

	/**
	 * Create an instance of {@link RecordingSourceInformation }
	 * 
     * @return  -
	 */
	public RecordingSourceInformation createRecordingSourceInformation() {
		return new RecordingSourceInformation();
	}

	/**
	 * Create an instance of {@link EFlipOptionsExtension }
	 * 
     * @return  -
	 */
	public EFlipOptionsExtension createEFlipOptionsExtension() {
		return new EFlipOptionsExtension();
	}

	/**
	 * Create an instance of {@link ImagingSettings20 }
	 * 
     * @return  -
	 */
	public ImagingSettings20 createImagingSettings20() {
		return new ImagingSettings20();
	}

	/**
	 * Create an instance of {@link PrefixedIPv4Address }
	 * 
     * @return  -
	 */
	public PrefixedIPv4Address createPrefixedIPv4Address() {
		return new PrefixedIPv4Address();
	}

	/**
	 * Create an instance of {@link ActionEngineEventPayload }
	 * 
     * @return  -
	 */
	public ActionEngineEventPayload createActionEngineEventPayload() {
		return new ActionEngineEventPayload();
	}

	/**
	 * Create an instance of {@link RealTimeStreamingCapabilities }
	 * 
     * @return  -
	 */
	public RealTimeStreamingCapabilities createRealTimeStreamingCapabilities() {
		return new RealTimeStreamingCapabilities();
	}

	/**
	 * Create an instance of {@link OnvifVersion }
	 * 
     * @return  -
	 */
	public OnvifVersion createOnvifVersion() {
		return new OnvifVersion();
	}

	/**
	 * Create an instance of {@link AudioOutputConfigurationOptions }
	 * 
     * @return  -
	 */
	public AudioOutputConfigurationOptions createAudioOutputConfigurationOptions() {
		return new AudioOutputConfigurationOptions();
	}

	/**
	 * Create an instance of {@link ShapeDescriptorExtension }
	 * 
     * @return  -
	 */
	public ShapeDescriptorExtension createShapeDescriptorExtension() {
		return new ShapeDescriptorExtension();
	}

	/**
	 * Create an instance of {@link PTZMoveStatus }
	 * 
     * @return  -
	 */
	public PTZMoveStatus createPTZMoveStatus() {
		return new PTZMoveStatus();
	}

	/**
	 * Create an instance of {@link AnalyticsDeviceEngineConfigurationExtension }
	 * 
     * @return  -
	 */
	public AnalyticsDeviceEngineConfigurationExtension createAnalyticsDeviceEngineConfigurationExtension() {
		return new AnalyticsDeviceEngineConfigurationExtension();
	}

	/**
	 * Create an instance of {@link RotateExtension }
	 * 
     * @return  -
	 */
	public RotateExtension createRotateExtension() {
		return new RotateExtension();
	}

	/**
	 * Create an instance of {@link PTZPresetTourStartingConditionOptionsExtension }
	 * 
     * @return  -
	 */
	public PTZPresetTourStartingConditionOptionsExtension createPTZPresetTourStartingConditionOptionsExtension() {
		return new PTZPresetTourStartingConditionOptionsExtension();
	}

	/**
	 * Create an instance of {@link VideoSource }
	 * 
     * @return  -
	 */
	public VideoSource createVideoSource() {
		return new VideoSource();
	}

	/**
	 * Create an instance of {@link MetadataStreamExtension2 }
	 * 
     * @return  -
	 */
	public MetadataStreamExtension2 createMetadataStreamExtension2() {
		return new MetadataStreamExtension2();
	}

	/**
	 * Create an instance of {@link PTControlDirectionExtension }
	 * 
     * @return  -
	 */
	public PTControlDirectionExtension createPTControlDirectionExtension() {
		return new PTControlDirectionExtension();
	}

	/**
	 * Create an instance of {@link ProfileExtension2 }
	 * 
     * @return  -
	 */
	public ProfileExtension2 createProfileExtension2() {
		return new ProfileExtension2();
	}

	/**
	 * Create an instance of {@link PTZPresetTourPresetDetailOptions }
	 * 
     * @return  -
	 */
	public PTZPresetTourPresetDetailOptions createPTZPresetTourPresetDetailOptions() {
		return new PTZPresetTourPresetDetailOptions();
	}

	/**
	 * Create an instance of {@link LayoutExtension }
	 * 
     * @return  -
	 */
	public LayoutExtension createLayoutExtension() {
		return new LayoutExtension();
	}

	/**
	 * Create an instance of {@link H264Configuration }
	 * 
     * @return  -
	 */
	public H264Configuration createH264Configuration() {
		return new H264Configuration();
	}

	/**
	 * Create an instance of {@link Mpeg4DecOptions }
	 * 
     * @return  -
	 */
	public Mpeg4DecOptions createMpeg4DecOptions() {
		return new Mpeg4DecOptions();
	}

	/**
	 * Create an instance of {@link RotateOptionsExtension }
	 * 
     * @return  -
	 */
	public RotateOptionsExtension createRotateOptionsExtension() {
		return new RotateOptionsExtension();
	}

	/**
	 * Create an instance of {@link AudioAttributes }
	 * 
     * @return  -
	 */
	public AudioAttributes createAudioAttributes() {
		return new AudioAttributes();
	}

	/**
	 * Create an instance of {@link PTZPresetTourStatusExtension }
	 * 
     * @return  -
	 */
	public PTZPresetTourStatusExtension createPTZPresetTourStatusExtension() {
		return new PTZPresetTourStatusExtension();
	}

	/**
	 * Create an instance of {@link MaximumNumberOfOSDs }
	 * 
     * @return  -
	 */
	public MaximumNumberOfOSDs createMaximumNumberOfOSDs() {
		return new MaximumNumberOfOSDs();
	}

	/**
	 * Create an instance of {@link AnalyticsState }
	 * 
     * @return  -
	 */
	public AnalyticsState createAnalyticsState() {
		return new AnalyticsState();
	}

	/**
	 * Create an instance of {@link MoveOptions }
	 * 
     * @return  -
	 */
	public MoveOptions createMoveOptions() {
		return new MoveOptions();
	}

	/**
	 * Create an instance of {@link AbsoluteFocusOptions }
	 * 
     * @return  -
	 */
	public AbsoluteFocusOptions createAbsoluteFocusOptions() {
		return new AbsoluteFocusOptions();
	}

	/**
	 * Create an instance of {@link WideDynamicRange20 }
	 * 
     * @return  -
	 */
	public WideDynamicRange20 createWideDynamicRange20() {
		return new WideDynamicRange20();
	}

	/**
	 * Create an instance of {@link EventStream }
	 * 
     * @return  -
	 */
	public EventStream createEventStream() {
		return new EventStream();
	}

	/**
	 * Create an instance of {@link FloatRange }
	 * 
     * @return  -
	 */
	public FloatRange createFloatRange() {
		return new FloatRange();
	}

	/**
	 * Create an instance of {@link PTZPresetTourSpotExtension }
	 * 
     * @return  -
	 */
	public PTZPresetTourSpotExtension createPTZPresetTourSpotExtension() {
		return new PTZPresetTourSpotExtension();
	}

	/**
	 * Create an instance of {@link WideDynamicRangeOptions }
	 * 
     * @return  -
	 */
	public WideDynamicRangeOptions createWideDynamicRangeOptions() {
		return new WideDynamicRangeOptions();
	}

	/**
	 * Create an instance of {@link Date }
	 * 
     * @return  -
	 */
	public Date createDate() {
		return new Date();
	}

	/**
	 * Create an instance of {@link OSDImgConfiguration }
	 * 
     * @return  -
	 */
	public OSDImgConfiguration createOSDImgConfiguration() {
		return new OSDImgConfiguration();
	}

	/**
	 * Create an instance of {@link AnalyticsEngine }
	 * 
     * @return  -
	 */
	public AnalyticsEngine createAnalyticsEngine() {
		return new AnalyticsEngine();
	}

	/**
	 * Create an instance of {@link FindEventResultList }
	 * 
     * @return  -
	 */
	public FindEventResultList createFindEventResultList() {
		return new FindEventResultList();
	}

	/**
	 * Create an instance of {@link PTControlDirectionOptionsExtension }
	 * 
     * @return  -
	 */
	public PTControlDirectionOptionsExtension createPTControlDirectionOptionsExtension() {
		return new PTControlDirectionOptionsExtension();
	}

	/**
	 * Create an instance of {@link PTZPresetTourPresetDetail }
	 * 
     * @return  -
	 */
	public PTZPresetTourPresetDetail createPTZPresetTourPresetDetail() {
		return new PTZPresetTourPresetDetail();
	}

	/**
	 * Create an instance of {@link Mpeg4Options2 }
	 * 
     * @return  -
	 */
	public Mpeg4Options2 createMpeg4Options2() {
		return new Mpeg4Options2();
	}

	/**
	 * Create an instance of {@link ReceiverConfiguration }
	 * 
     * @return  -
	 */
	public ReceiverConfiguration createReceiverConfiguration() {
		return new ReceiverConfiguration();
	}

	/**
	 * Create an instance of {@link ImagingOptions20 }
	 * 
     * @return  -
	 */
	public ImagingOptions20 createImagingOptions20() {
		return new ImagingOptions20();
	}

	/**
	 * Create an instance of {@link MetadataInput }
	 * 
     * @return  -
	 */
	public MetadataInput createMetadataInput() {
		return new MetadataInput();
	}

	/**
	 * Create an instance of {@link OSDImgOptionsExtension }
	 * 
     * @return  -
	 */
	public OSDImgOptionsExtension createOSDImgOptionsExtension() {
		return new OSDImgOptionsExtension();
	}

	/**
	 * Create an instance of {@link ItemListExtension }
	 * 
     * @return  -
	 */
	public ItemListExtension createItemListExtension() {
		return new ItemListExtension();
	}

	/**
	 * Create an instance of {@link DNSInformationExtension }
	 * 
     * @return  -
	 */
	public DNSInformationExtension createDNSInformationExtension() {
		return new DNSInformationExtension();
	}

	/**
	 * Create an instance of {@link Config }
	 * 
     * @return  -
	 */
	public Config createConfig() {
		return new Config();
	}

	/**
	 * Create an instance of {@link DeviceIOCapabilities }
	 * 
     * @return  -
	 */
	public DeviceIOCapabilities createDeviceIOCapabilities() {
		return new DeviceIOCapabilities();
	}

	/**
	 * Create an instance of {@link PTZConfigurationExtension2 }
	 * 
     * @return  -
	 */
	public PTZConfigurationExtension2 createPTZConfigurationExtension2() {
		return new PTZConfigurationExtension2();
	}

	/**
	 * Create an instance of {@link ActionEngineEventPayloadExtension }
	 * 
     * @return  -
	 */
	public ActionEngineEventPayloadExtension createActionEngineEventPayloadExtension() {
		return new ActionEngineEventPayloadExtension();
	}

	/**
	 * Create an instance of {@link PTZPresetTourPresetDetailOptionsExtension }
	 * 
     * @return  -
	 */
	public PTZPresetTourPresetDetailOptionsExtension createPTZPresetTourPresetDetailOptionsExtension() {
		return new PTZPresetTourPresetDetailOptionsExtension();
	}

	/**
	 * Create an instance of {@link ImagingOptions20Extension }
	 * 
     * @return  -
	 */
	public ImagingOptions20Extension createImagingOptions20Extension() {
		return new ImagingOptions20Extension();
	}

	/**
	 * Create an instance of {@link Time }
	 * 
     * @return  -
	 */
	public Time createTime() {
		return new Time();
	}

	/**
	 * Create an instance of {@link PTControlDirectionOptions }
	 * 
     * @return  -
	 */
	public PTControlDirectionOptions createPTControlDirectionOptions() {
		return new PTControlDirectionOptions();
	}

	/**
	 * Create an instance of {@link MessageDescriptionExtension }
	 * 
     * @return  -
	 */
	public MessageDescriptionExtension createMessageDescriptionExtension() {
		return new MessageDescriptionExtension();
	}

	/**
	 * Create an instance of {@link Object }
	 * 
     * @return  -
	 */
	public Object createObject() {
		return new Object();
	}

	/**
	 * Create an instance of {@link BacklightCompensation }
	 * 
     * @return  -
	 */
	public BacklightCompensation createBacklightCompensation() {
		return new BacklightCompensation();
	}

	/**
	 * Create an instance of {@link VideoSourceConfigurationOptionsExtension }
	 * 
     * @return  -
	 */
	public VideoSourceConfigurationOptionsExtension createVideoSourceConfigurationOptionsExtension() {
		return new VideoSourceConfigurationOptionsExtension();
	}

	/**
	 * Create an instance of {@link FindMetadataResult }
	 * 
     * @return  -
	 */
	public FindMetadataResult createFindMetadataResult() {
		return new FindMetadataResult();
	}

	/**
	 * Create an instance of {@link ImagingSettingsExtension }
	 * 
     * @return  -
	 */
	public ImagingSettingsExtension createImagingSettingsExtension() {
		return new ImagingSettingsExtension();
	}

	/**
	 * Create an instance of {@link RecordingJobTrack }
	 * 
     * @return  -
	 */
	public RecordingJobTrack createRecordingJobTrack() {
		return new RecordingJobTrack();
	}

	/**
	 * Create an instance of {@link Dot11PSKSetExtension }
	 * 
     * @return  -
	 */
	public Dot11PSKSetExtension createDot11PSKSetExtension() {
		return new Dot11PSKSetExtension();
	}

	/**
	 * Create an instance of {@link WhiteBalanceOptions20 }
	 * 
     * @return  -
	 */
	public WhiteBalanceOptions20 createWhiteBalanceOptions20() {
		return new WhiteBalanceOptions20();
	}

	/**
	 * Create an instance of {@link NTPInformationExtension }
	 * 
     * @return  -
	 */
	public NTPInformationExtension createNTPInformationExtension() {
		return new NTPInformationExtension();
	}

	/**
	 * Create an instance of {@link RecordingJobSource }
	 * 
     * @return  -
	 */
	public RecordingJobSource createRecordingJobSource() {
		return new RecordingJobSource();
	}

	/**
	 * Create an instance of {@link ImagingOptions }
	 * 
     * @return  -
	 */
	public ImagingOptions createImagingOptions() {
		return new ImagingOptions();
	}

	/**
	 * Create an instance of {@link MotionInCells }
	 * 
     * @return  -
	 */
	public MotionInCells createMotionInCells() {
		return new MotionInCells();
	}

	/**
	 * Create an instance of {@link ImagingStatus20 }
	 * 
     * @return  -
	 */
	public ImagingStatus20 createImagingStatus20() {
		return new ImagingStatus20();
	}

	/**
	 * Create an instance of {@link Reverse }
	 * 
     * @return  -
	 */
	public Reverse createReverse() {
		return new Reverse();
	}

	/**
	 * Create an instance of {@link SupportedAnalyticsModules }
	 * 
     * @return  -
	 */
	public SupportedAnalyticsModules createSupportedAnalyticsModules() {
		return new SupportedAnalyticsModules();
	}

	/**
	 * Create an instance of {@link ImagingSettingsExtension20 }
	 * 
     * @return  -
	 */
	public ImagingSettingsExtension20 createImagingSettingsExtension20() {
		return new ImagingSettingsExtension20();
	}

	/**
	 * Create an instance of {@link DigitalInput }
	 * 
     * @return  -
	 */
	public DigitalInput createDigitalInput() {
		return new DigitalInput();
	}

	/**
	 * Create an instance of {@link VideoAnalyticsStreamExtension }
	 * 
     * @return  -
	 */
	public VideoAnalyticsStreamExtension createVideoAnalyticsStreamExtension() {
		return new VideoAnalyticsStreamExtension();
	}

	/**
	 * Create an instance of {@link PresetTour }
	 * 
     * @return  -
	 */
	public PresetTour createPresetTour() {
		return new PresetTour();
	}

	/**
	 * Create an instance of {@link NetworkInterfaceExtension2 }
	 * 
     * @return  -
	 */
	public NetworkInterfaceExtension2 createNetworkInterfaceExtension2() {
		return new NetworkInterfaceExtension2();
	}

	/**
	 * Create an instance of {@link VideoDecoderConfigurationOptions }
	 * 
     * @return  -
	 */
	public VideoDecoderConfigurationOptions createVideoDecoderConfigurationOptions() {
		return new VideoDecoderConfigurationOptions();
	}

	/**
	 * Create an instance of {@link OSDImgOptions }
	 * 
     * @return  -
	 */
	public OSDImgOptions createOSDImgOptions() {
		return new OSDImgOptions();
	}

	/**
	 * Create an instance of {@link Appearance }
	 * 
     * @return  -
	 */
	public Appearance createAppearance() {
		return new Appearance();
	}

	/**
	 * Create an instance of {@link WhiteBalance20Extension }
	 * 
     * @return  -
	 */
	public WhiteBalance20Extension createWhiteBalance20Extension() {
		return new WhiteBalance20Extension();
	}

	/**
	 * Create an instance of {@link PaneLayout }
	 * 
     * @return  -
	 */
	public PaneLayout createPaneLayout() {
		return new PaneLayout();
	}

	/**
	 * Create an instance of {@link WhiteBalanceOptions }
	 * 
     * @return  -
	 */
	public WhiteBalanceOptions createWhiteBalanceOptions() {
		return new WhiteBalanceOptions();
	}

	/**
	 * Create an instance of {@link DeviceCapabilities }
	 * 
     * @return  -
	 */
	public DeviceCapabilities createDeviceCapabilities() {
		return new DeviceCapabilities();
	}

	/**
	 * Create an instance of {@link OSDTextOptions }
	 * 
     * @return  -
	 */
	public OSDTextOptions createOSDTextOptions() {
		return new OSDTextOptions();
	}

	/**
	 * Create an instance of {@link ObjectExtension }
	 * 
     * @return  -
	 */
	public ObjectExtension createObjectExtension() {
		return new ObjectExtension();
	}

	/**
	 * Create an instance of {@link CapabilitiesExtension2 }
	 * 
     * @return  -
	 */
	public CapabilitiesExtension2 createCapabilitiesExtension2() {
		return new CapabilitiesExtension2();
	}

	/**
	 * Create an instance of {@link AnalyticsDeviceEngineConfiguration }
	 * 
     * @return  -
	 */
	public AnalyticsDeviceEngineConfiguration createAnalyticsDeviceEngineConfiguration() {
		return new AnalyticsDeviceEngineConfiguration();
	}

	/**
	 * Create an instance of {@link OSDTextConfiguration }
	 * 
     * @return  -
	 */
	public OSDTextConfiguration createOSDTextConfiguration() {
		return new OSDTextConfiguration();
	}

	/**
	 * Create an instance of {@link ColorCovariance }
	 * 
     * @return  -
	 */
	public ColorCovariance createColorCovariance() {
		return new ColorCovariance();
	}

	/**
	 * Create an instance of {@link OSDPosConfiguration }
	 * 
     * @return  -
	 */
	public OSDPosConfiguration createOSDPosConfiguration() {
		return new OSDPosConfiguration();
	}

	/**
	 * Create an instance of {@link PTZSpeed }
	 * 
     * @return  -
	 */
	public PTZSpeed createPTZSpeed() {
		return new PTZSpeed();
	}

	/**
	 * Create an instance of {@link NetworkCapabilitiesExtension }
	 * 
     * @return  -
	 */
	public NetworkCapabilitiesExtension createNetworkCapabilitiesExtension() {
		return new NetworkCapabilitiesExtension();
	}

	/**
	 * Create an instance of {@link PanTiltLimits }
	 * 
     * @return  -
	 */
	public PanTiltLimits createPanTiltLimits() {
		return new PanTiltLimits();
	}

	/**
	 * Create an instance of {@link RecordingSummary }
	 * 
     * @return  -
	 */
	public RecordingSummary createRecordingSummary() {
		return new RecordingSummary();
	}

	/**
	 * Create an instance of {@link SecurityCapabilitiesExtension2 }
	 * 
     * @return  -
	 */
	public SecurityCapabilitiesExtension2 createSecurityCapabilitiesExtension2() {
		return new SecurityCapabilitiesExtension2();
	}

	/**
	 * Create an instance of {@link PTZNode }
	 * 
     * @return  -
	 */
	public PTZNode createPTZNode() {
		return new PTZNode();
	}

	/**
	 * Create an instance of {@link PTZPresetTourStatus }
	 * 
     * @return  -
	 */
	public PTZPresetTourStatus createPTZPresetTourStatus() {
		return new PTZPresetTourStatus();
	}

	/**
	 * Create an instance of {@link RuleEngineConfiguration }
	 * 
     * @return  -
	 */
	public RuleEngineConfiguration createRuleEngineConfiguration() {
		return new RuleEngineConfiguration();
	}

	/**
	 * Create an instance of {@link VideoSourceConfigurationExtension }
	 * 
     * @return  -
	 */
	public VideoSourceConfigurationExtension createVideoSourceConfigurationExtension() {
		return new VideoSourceConfigurationExtension();
	}

	/**
	 * Create an instance of {@link TrackInformation }
	 * 
     * @return  -
	 */
	public TrackInformation createTrackInformation() {
		return new TrackInformation();
	}

	/**
	 * Create an instance of {@link AnalyticsDeviceExtension }
	 * 
     * @return  -
	 */
	public AnalyticsDeviceExtension createAnalyticsDeviceExtension() {
		return new AnalyticsDeviceExtension();
	}

	/**
	 * Create an instance of {@link RecordingJobStateInformation }
	 * 
     * @return  -
	 */
	public RecordingJobStateInformation createRecordingJobStateInformation() {
		return new RecordingJobStateInformation();
	}

	/**
	 * Create an instance of {@link VideoAnalyticsStream }
	 * 
     * @return  -
	 */
	public VideoAnalyticsStream createVideoAnalyticsStream() {
		return new VideoAnalyticsStream();
	}

	/**
	 * Create an instance of {@link ConfigurationEntity }
	 * 
     * @return  -
	 */
	public ConfigurationEntity createConfigurationEntity() {
		return new ConfigurationEntity();
	}

	/**
	 * Create an instance of {@link MoveOptions20 }
	 * 
     * @return  -
	 */
	public MoveOptions20 createMoveOptions20() {
		return new MoveOptions20();
	}

	/**
	 * Create an instance of {@link HostnameInformationExtension }
	 * 
     * @return  -
	 */
	public HostnameInformationExtension createHostnameInformationExtension() {
		return new HostnameInformationExtension();
	}

	/**
	 * Create an instance of {@link PTZPresetTourExtension }
	 * 
     * @return  -
	 */
	public PTZPresetTourExtension createPTZPresetTourExtension() {
		return new PTZPresetTourExtension();
	}

	/**
	 * Create an instance of {@link MotionExpression }
	 * 
     * @return  -
	 */
	public MotionExpression createMotionExpression() {
		return new MotionExpression();
	}

	/**
	 * Create an instance of {@link H264Options }
	 * 
     * @return  -
	 */
	public H264Options createH264Options() {
		return new H264Options();
	}

	/**
	 * Create an instance of {@link ReceiverStateInformation }
	 * 
     * @return  -
	 */
	public ReceiverStateInformation createReceiverStateInformation() {
		return new ReceiverStateInformation();
	}

	/**
	 * Create an instance of {@link Dot11SecurityConfigurationExtension }
	 * 
     * @return  -
	 */
	public Dot11SecurityConfigurationExtension createDot11SecurityConfigurationExtension() {
		return new Dot11SecurityConfigurationExtension();
	}

	/**
	 * Create an instance of {@link NetworkProtocolExtension }
	 * 
     * @return  -
	 */
	public NetworkProtocolExtension createNetworkProtocolExtension() {
		return new NetworkProtocolExtension();
	}

	/**
	 * Create an instance of {@link PTZStream }
	 * 
     * @return  -
	 */
	public PTZStream createPTZStream() {
		return new PTZStream();
	}

	/**
	 * Create an instance of {@link FrameExtension }
	 * 
     * @return  -
	 */
	public FrameExtension createFrameExtension() {
		return new FrameExtension();
	}

	/**
	 * Create an instance of {@link PTZPresetTourSpot }
	 * 
     * @return  -
	 */
	public PTZPresetTourSpot createPTZPresetTourSpot() {
		return new PTZPresetTourSpot();
	}

	/**
	 * Create an instance of {@link PTZPresetTourTypeExtension }
	 * 
     * @return  -
	 */
	public PTZPresetTourTypeExtension createPTZPresetTourTypeExtension() {
		return new PTZPresetTourTypeExtension();
	}

	/**
	 * Create an instance of {@link FocusOptions }
	 * 
     * @return  -
	 */
	public FocusOptions createFocusOptions() {
		return new FocusOptions();
	}

	/**
	 * Create an instance of {@link OSDTextOptionsExtension }
	 * 
     * @return  -
	 */
	public OSDTextOptionsExtension createOSDTextOptionsExtension() {
		return new OSDTextOptionsExtension();
	}

	/**
	 * Create an instance of {@link ImagingCapabilities }
	 * 
     * @return  -
	 */
	public ImagingCapabilities createImagingCapabilities() {
		return new ImagingCapabilities();
	}

	/**
	 * Create an instance of {@link VideoOutputConfiguration }
	 * 
     * @return  -
	 */
	public VideoOutputConfiguration createVideoOutputConfiguration() {
		return new VideoOutputConfiguration();
	}

	/**
	 * Create an instance of {@link AudioClassCandidate }
	 * 
     * @return  -
	 */
	public AudioClassCandidate createAudioClassCandidate() {
		return new AudioClassCandidate();
	}

	/**
	 * Create an instance of {@link NetworkHostExtension }
	 * 
     * @return  -
	 */
	public NetworkHostExtension createNetworkHostExtension() {
		return new NetworkHostExtension();
	}

	/**
	 * Create an instance of {@link ItemListDescription.SimpleItemDescription }
	 * 
     * @return  -
	 */
	public ItemListDescription.SimpleItemDescription createItemListDescriptionSimpleItemDescription() {
		return new ItemListDescription.SimpleItemDescription();
	}

	/**
	 * Create an instance of {@link ItemListDescription.ElementItemDescription }
	 * 
     * @return  -
	 */
	public ItemListDescription.ElementItemDescription createItemListDescriptionElementItemDescription() {
		return new ItemListDescription.ElementItemDescription();
	}

	/**
	 * Create an instance of {@link ConfigDescription.Messages }
	 * 
     * @return  -
	 */
	public ConfigDescription.Messages createConfigDescriptionMessages() {
		return new ConfigDescription.Messages();
	}

	/**
	 * Create an instance of {@link Behaviour.Removed }
	 * 
     * @return  -
	 */
	public Behaviour.Removed createBehaviourRemoved() {
		return new Behaviour.Removed();
	}

	/**
	 * Create an instance of {@link Behaviour.Idle }
	 * 
     * @return  -
	 */
	public Behaviour.Idle createBehaviourIdle() {
		return new Behaviour.Idle();
	}

	/**
	 * Create an instance of {@link ColorDescriptor.ColorCluster }
	 * 
     * @return  -
	 */
	public ColorDescriptor.ColorCluster createColorDescriptorColorCluster() {
		return new ColorDescriptor.ColorCluster();
	}

	/**
	 * Create an instance of {@link EventSubscription.SubscriptionPolicy }
	 * 
     * @return  -
	 */
	public EventSubscription.SubscriptionPolicy createEventSubscriptionSubscriptionPolicy() {
		return new EventSubscription.SubscriptionPolicy();
	}

	/**
	 * Create an instance of {@link ClassDescriptor.ClassCandidate }
	 * 
     * @return  -
	 */
	public ClassDescriptor.ClassCandidate createClassDescriptorClassCandidate() {
		return new ClassDescriptor.ClassCandidate();
	}

	/**
	 * Create an instance of {@link ItemList.SimpleItem }
	 * 
     * @return  -
	 */
	public ItemList.SimpleItem createItemListSimpleItem() {
		return new ItemList.SimpleItem();
	}

	/**
	 * Create an instance of {@link ItemList.ElementItem }
	 * 
     * @return  -
	 */
	public ItemList.ElementItem createItemListElementItem() {
		return new ItemList.ElementItem();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link VideoSourceConfiguration }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoSourceConfiguration")
	public JAXBElement<VideoSourceConfiguration> createVideoSourceConfiguration(VideoSourceConfiguration value) {
		return new JAXBElement<>(_VideoSourceConfiguration_QNAME, VideoSourceConfiguration.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MetadataStream }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "MetadataStream")
	public JAXBElement<MetadataStream> createMetadataStream(MetadataStream value) {
		return new JAXBElement<>(_MetadataStream_QNAME, MetadataStream.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AudioEncoderConfiguration }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioEncoderConfiguration")
	public JAXBElement<AudioEncoderConfiguration> createAudioEncoderConfiguration(AudioEncoderConfiguration value) {
		return new JAXBElement<>(_AudioEncoderConfiguration_QNAME, AudioEncoderConfiguration.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link VideoEncoderConfiguration }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoEncoderConfiguration")
	public JAXBElement<VideoEncoderConfiguration> createVideoEncoderConfiguration(VideoEncoderConfiguration value) {
		return new JAXBElement<>(_VideoEncoderConfiguration_QNAME, VideoEncoderConfiguration.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link VideoAnalyticsConfiguration }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoAnalyticsConfiguration")
	public JAXBElement<VideoAnalyticsConfiguration> createVideoAnalyticsConfiguration(VideoAnalyticsConfiguration value) {
		return new JAXBElement<>(_VideoAnalyticsConfiguration_QNAME, VideoAnalyticsConfiguration.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AudioOutputConfiguration }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioOutputConfiguration")
	public JAXBElement<AudioOutputConfiguration> createAudioOutputConfiguration(AudioOutputConfiguration value) {
		return new JAXBElement<>(_AudioOutputConfiguration_QNAME, AudioOutputConfiguration.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Polygon }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "Polygon")
	public JAXBElement<Polygon> createPolygon(Polygon value) {
		return new JAXBElement<>(_Polygon_QNAME, Polygon.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Polyline }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "Polyline")
	public JAXBElement<Polyline> createPolyline(Polyline value) {
		return new JAXBElement<>(_Polyline_QNAME, Polyline.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AudioSourceConfiguration }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioSourceConfiguration")
	public JAXBElement<AudioSourceConfiguration> createAudioSourceConfiguration(AudioSourceConfiguration value) {
		return new JAXBElement<>(_AudioSourceConfiguration_QNAME, AudioSourceConfiguration.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MetadataConfiguration }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "MetadataConfiguration")
	public JAXBElement<MetadataConfiguration> createMetadataConfiguration(MetadataConfiguration value) {
		return new JAXBElement<>(_MetadataConfiguration_QNAME, MetadataConfiguration.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PTZConfiguration }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "PTZConfiguration")
	public JAXBElement<PTZConfiguration> createPTZConfiguration(PTZConfiguration value) {
		return new JAXBElement<>(_PTZConfiguration_QNAME, PTZConfiguration.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AudioDecoderConfiguration }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioDecoderConfiguration")
	public JAXBElement<AudioDecoderConfiguration> createAudioDecoderConfiguration(AudioDecoderConfiguration value) {
		return new JAXBElement<>(_AudioDecoderConfiguration_QNAME, AudioDecoderConfiguration.class, null, value);
	}

}
