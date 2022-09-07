package de.onvif.discovery;

import java.net.URL;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.me.javawsdiscovery.DeviceDiscovery;

/**
 * @author th
 * @date 2015-06-18
 */
public class OnvifDiscovery {
    private static final Logger LOGGER = Logger.getLogger(OnvifDiscovery.class.getPackage().getName());

    /**
     * Possibly returns a list of discovered devices? 
     * @return
     */
    public static List<OnvifPointer> discoverOnvifDevices() {
		final LinkedList<OnvifPointer> onvifPointers = new LinkedList<>();
		final Collection<URL> urls = DeviceDiscovery.discoverWsDevicesAsUrls("^http$", ".*onvif.*");
        urls.forEach(url -> {
            String authority;
            try {
                // Just for testing
                System.out.println("------------------");
                System.out.println("Host: " + url.getHost());
                System.out.println("Authority: " + url.getAuthority());
                System.out.println("Path: " + url.getPath());
                System.out.println("Protocol: " + url.getProtocol());
                System.out.println("Query: " + url.getQuery());
                System.out.println("Ref: " + url.getRef());
                System.out.println("URL: " + url.getHost());
                System.out.println("------------------");

                authority = String.format("%s://%s",  url.getProtocol(), url.getAuthority());

                onvifPointers.add(new OnvifPointer(url));
            } catch (Exception e) {
                LOGGER.log(Level.WARNING,"An error occurred in the discoverOnvifDevices method.",e);
            }
        });

		return onvifPointers;
	}

    /**
     * 
     * @return 
     */
    public static List<URL> searchOnvifDevices() {
        List<URL> deviceURLs = new LinkedList<>();
        deviceURLs.addAll(DeviceDiscovery.discoverWsDevicesAsUrls("^http$", ".*onvif.*"));
        return deviceURLs;
    }
}
