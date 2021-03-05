package de.onvif.discovery;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
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
     *
     * @return
     */
    public static List<OnvifPointer> discoverOnvifDevices() {
		final ArrayList<OnvifPointer> onvifPointers = new ArrayList<>();
		final Collection<URL> urls = DeviceDiscovery.discoverWsDevicesAsUrls("^http$", ".*onvif.*");
        urls.forEach(url -> {
            try {
                onvifPointers.add(new OnvifPointer(url));
            } catch (Exception e) {
                LOGGER.log(Level.WARNING,"An error occurred in the discoverOnvifDevices method.",e);
            }
        });
		return onvifPointers;
	}
}
