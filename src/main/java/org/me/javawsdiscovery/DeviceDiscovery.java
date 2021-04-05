/**
 * This was originally part of the javaWsDiscovery library (https://github.com/thhart/javaWsDiscovery.git), and given
 * it's simplicity, I grabbed the code from a forked version of a fork.  Both libraries were originally started by the same person.
 *
 */

package org.me.javawsdiscovery;

import de.onvif.LoggerInterface;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.soap.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.*;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.javatuples.Pair;


/**
 * 
 * Device discovery class to list local accessible devices probed per UDP probe messages.
 *
 * @date 2017/11/14 15:40
 */
public class DeviceDiscovery 
        implements LoggerInterface
{
    // Default location to write output.  This probably should be refactored because it is a hack.  
    // I am not expecting others to use this library.
    private static final String OUTPUT_LOCATION = "C:\\github\\onvif\\research\\snc-wr630\\soap";

    private static final Logger LOGGER = Logger.getLogger(DeviceDiscovery.class.getPackage().getName());
    private static final String ERROR_MSG = "An error occurred in %s.%s at %d while trying to discover the devices.";
    private static String outputLocation = OUTPUT_LOCATION;

    // change this when done
    private static boolean isLoggingToFile = true;
        
    private static final Random random = new SecureRandom();
    public static String WS_DISCOVERY_SOAP_VERSION = "SOAP 1.2 Protocol";
    public static String WS_DISCOVERY_CONTENT_TYPE = "application/soap+xml";
    public static int WS_DISCOVERY_TIMEOUT = 4000;
    public static int WS_DISCOVERY_PORT = 3702;
    public static String WS_DISCOVERY_ADDRESS_IPv4 = "239.255.255.250";
    /**
     * Not supported yet.
     */
    public static String WS_DISCOVERY_ADDRESS_IPv6 = "[FF02::C]";
    public static String WS_DISCOVERY_PROBE_MESSAGE = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:wsa=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" xmlns:tns=\"http://schemas.xmlsoap.org/ws/2005/04/discovery\"><soap:Header><wsa:Action>http://schemas.xmlsoap.org/ws/2005/04/discovery/Probe</wsa:Action><wsa:MessageID>urn:uuid:c032cfdd-c3ca-49dc-820e-ee6696ad63e2</wsa:MessageID><wsa:To>urn:schemas-xmlsoap-org:ws:2005:04:discovery</wsa:To></soap:Header><soap:Body><tns:Probe/></soap:Body></soap:Envelope>";


    /**
     * Discover WS device on the local network and returns Urls
     *
     * @return list of unique device urls
     */
    public static Collection<URL> discoverWsDevicesAsUrls() {
        return discoverWsDevicesAsUrls("", "");
    }

    /**
     * Discover WS device on the local network with specified filter
     *
     * @param regexpProtocol URL protocol matching regexp like "^http$", might be empty ""
     * @param regexpPath     URL path matching regexp like "onvif", might be empty ""
     * @return list of unique device URLS filtered
     */
    public static Collection<URL> discoverWsDevicesAsUrls(String regexpProtocol, String regexpPath) {

        final Collection<URL> urls = new TreeSet<>((URL o1, URL o2) -> o1.toString().compareTo(o2.toString()));
        discoverWsDevices().forEach(key -> {
            try {
                final URL url = new URL(key);
                boolean ok = true;
                if (regexpProtocol.length() > 0 && !url.getProtocol().matches(regexpProtocol))
                    ok = false;
                if (regexpPath.length() > 0 && !url.getPath().matches(regexpPath))
                    ok = false;
                if (ok) urls.add(url);
            } catch (MalformedURLException e) {
                StackTraceElement t =  e.getCause().getStackTrace()[0];
                LOGGER.log(Level.WARNING, String.format(ERROR_MSG, t.getClassName(), t.getMethodName(), t.getLineNumber()), e);
            }
        });
        return urls;
    }

    /**
     * Discover WS device on the local network with specified filter
     *
     * @param regexpProtocol URL protocol matching regexp like "^http$", might be empty ""
     * @param regexpPath     URL path matching regexp like "onvif", might be empty ""
     * @param devices
     * @return list of unique device URLS filtered
     */
    public static List<URL> discoverWsDevicesAsUrls(String regexpProtocol, String regexpPath, List<URL> devices) {
        discoverWsDevices().forEach(key -> {
            try {
                final URL url = new URL(key);
                boolean ok = true;
                if (null != regexpProtocol && regexpProtocol.length() > 0 && !url.getProtocol().matches(regexpProtocol)) {
                    ok = false;
                }
                if (null != regexpPath && regexpPath.length() > 0 && !url.getPath().matches(regexpPath)) {
                    ok = false;
                }
                if (ok) {
                    devices.add(url);
                }
            } catch (MalformedURLException e) {
                StackTraceElement t =  e.getCause().getStackTrace()[0];
                LOGGER.log(Level.WARNING, String.format(ERROR_MSG, t.getClassName(), t.getMethodName(), t.getLineNumber()), e);
            }
        });
        return devices;       
    }
    
    /**
     * Discover WS device on the local network
     *
     * @return list of unique devices access strings which might be URLs in most cases
     */
    public static Collection<String> discoverWsDevices() {
        final Collection<String> addresses = new ConcurrentSkipListSet<>();
        final CountDownLatch serverStarted = new CountDownLatch(1);
        final CountDownLatch serverFinished = new CountDownLatch(1);
        final Collection<InetAddress> addressList = new ArrayList<>();
        try {
            final Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            if (interfaces != null) {
                while (interfaces.hasMoreElements()) {
                    NetworkInterface anInterface = interfaces.nextElement();
                    if (!anInterface.isLoopback()) {
                        final List<InterfaceAddress> interfaceAddresses = anInterface.getInterfaceAddresses();
                        interfaceAddresses.stream().map(address -> {
                            InetAddress inetAddress = address.getAddress();
                            return address;
                        }).forEachOrdered(address -> {
                            addressList.add(address.getAddress());
                        });
                    }
                }
            }
        } catch (SocketException e) {
            StackTraceElement t =  e.getCause().getStackTrace()[0];
            LOGGER.log(Level.WARNING, String.format(ERROR_MSG, t.getClassName(), t.getMethodName(), t.getLineNumber()), e);
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        addressList.stream().map(address -> {
            return (Runnable) () -> {
                try {
                    final String uuid = UUID.randomUUID().toString();
                    final String probe = WS_DISCOVERY_PROBE_MESSAGE.replaceAll("<wsa:MessageID>urn:uuid:.*</wsa:MessageID>", "<wsa:MessageID>urn:uuid:" + uuid + "</wsa:MessageID>");
                    final int port = random.nextInt(20000) + 40000;
                    @SuppressWarnings("SocketOpenedButNotSafelyClosed")
                    final DatagramSocket server = new DatagramSocket(port, address);
                    new Thread() {
                        @Override
                        public void run() {
                            try {
                                final DatagramPacket packet = new DatagramPacket(new byte[4096], 4096);
                                server.setSoTimeout(WS_DISCOVERY_TIMEOUT);
                                long timerStarted = System.currentTimeMillis();
                                while (System.currentTimeMillis() - timerStarted < (WS_DISCOVERY_TIMEOUT)) {
                                    serverStarted.countDown();
                                    server.receive(packet);
                                    
                                    Pair<Collection<String>, SOAPMessage> urlResponseMessage;
                                    
//                                    final Collection<String> collection = parseSoapResponseForUrls(Arrays.copyOf(packet.getData(), packet.getLength()));
                                    Pair<Collection<String>, SOAPMessage> pair = parseSoapResponseForUrls(Arrays.copyOf(packet.getData(), packet.getLength()));
                                    final Collection<String> collection = pair.getValue0();

//                                    SOAPMessage message = pair.getValue1();

                                    collection.forEach(key -> {
                                        addresses.add(key);
                                    });
                                }
                            } catch (SocketTimeoutException e) {
                                LOGGER.log(Level.INFO, "A connection timed out while searching for an ONVIF device.  This is only an informational message as no error has really occurred.");
//                                StackTraceElement t =  e.getCause().getStackTrace()[0];
//                                LOGGER.log(Level.WARNING, String.format(ERROR_MSG, t.getClassName(), t.getMethodName(), t.getLineNumber()), e);
                            } catch (IOException | SOAPException e) {
                                StackTraceElement t =  e.getCause().getStackTrace()[0];
                                LOGGER.log(Level.WARNING, String.format(ERROR_MSG, t.getClassName(), t.getMethodName(), t.getLineNumber()), e);
                            } finally {
                                serverFinished.countDown();
                                server.close();
                            }
                        }
                    }.start();
                    try {
                        serverStarted.await(1000, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        StackTraceElement t =  e.getCause().getStackTrace()[0];
                        LOGGER.log(Level.WARNING, String.format(ERROR_MSG, t.getClassName(), t.getMethodName(), t.getLineNumber()), e);
                    }
                    if (address instanceof Inet4Address) {
                        server.send(new DatagramPacket(probe.getBytes(), probe.length(), InetAddress.getByName(WS_DISCOVERY_ADDRESS_IPv4), WS_DISCOVERY_PORT));
                    } else {
                        server.send(new DatagramPacket(probe.getBytes(), probe.length(), InetAddress.getByName(WS_DISCOVERY_ADDRESS_IPv6), WS_DISCOVERY_PORT));
                    }
                }catch (IOException e) {
                    StackTraceElement t =  e.getCause().getStackTrace()[0];
                    LOGGER.log(Level.WARNING, String.format(ERROR_MSG, t.getClassName(), t.getMethodName(), t.getLineNumber()), e);
                }
                try {
                    serverFinished.await((WS_DISCOVERY_TIMEOUT), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    StackTraceElement t =  e.getCause().getStackTrace()[0];
                    LOGGER.log(Level.WARNING, String.format(ERROR_MSG, t.getClassName(), t.getMethodName(), t.getLineNumber()), e);
                }
            };
        }).forEachOrdered(runnable -> {
            executorService.submit(runnable);
        });
        try {
            executorService.shutdown();
            executorService.awaitTermination(WS_DISCOVERY_TIMEOUT + 2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            StackTraceElement t =  e.getCause().getStackTrace()[0];
            LOGGER.log(Level.WARNING, String.format(ERROR_MSG, t.getClassName(), t.getMethodName(), t.getLineNumber()), e);
        }
        return addresses;
    }

    private static Collection<Node> getNodeMatching(Node body, String regexp) {
        final Collection<Node> nodes = new ArrayList<>();
        if (body.getNodeName().matches(regexp)) nodes.add(body);
        if (body.getChildNodes().getLength() == 0) return nodes;
        NodeList returnList = body.getChildNodes();
        for (int k = 0; k < returnList.getLength(); k++) {
            final Node node = returnList.item(k);
            nodes.addAll(getNodeMatching(node, regexp));
        }
        return nodes;
    }

//    private static Collection<String> parseSoapResponseForUrls(byte[] data) throws SOAPException, IOException {
    private static Pair<Collection<String>, SOAPMessage> parseSoapResponseForUrls(byte[] data) throws SOAPException, IOException {
        //System.out.println(new String(data));
        final Collection<String> urls = new ArrayList<>();
        
        Pair<Collection<String>, SOAPMessage> urlResponseMessage;
        
        MessageFactory factory = MessageFactory.newInstance(WS_DISCOVERY_SOAP_VERSION);
        final MimeHeaders headers = new MimeHeaders();
        headers.addHeader("Content-type", WS_DISCOVERY_CONTENT_TYPE);
        SOAPMessage message = factory.createMessage(headers, new ByteArrayInputStream(data));

        if (isLoggingToFile) {
            logger.logSoapMessage2File(outputLocation, message);
        }
        
        SOAPBody body = message.getSOAPBody();
        getNodeMatching(body, ".*:XAddrs").stream().filter(node -> (node.getTextContent().length() > 0)).forEachOrdered(node -> {
            urls.addAll(Arrays.asList(node.getTextContent().split(" ")));
        });
        
        urlResponseMessage = Pair.with(urls, message);
//        return urls;
        return urlResponseMessage;
    }

    public String getOutputLocation() {
        return outputLocation;
    }

    public void setOutputLocation(String outputLocation) {
        DeviceDiscovery.outputLocation = outputLocation;
    }

    public static boolean isIsLogging() {
        return isLoggingToFile;
    }

    public static void setIsLogging(boolean isLogging) {
        DeviceDiscovery.isLoggingToFile = isLogging;
    }
}
