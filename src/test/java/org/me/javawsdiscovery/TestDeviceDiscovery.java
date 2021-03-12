package org.me.javawsdiscovery;

import org.junit.Test;

import java.net.URL;
import java.util.Collection;
import java.util.List;

/**
 * Created by G_C on 2017/11/13.
 */
public class TestDeviceDiscovery {

    private static final String HTTP="^http$";
    private  static final String ONVIF=".*/onvif.*";
    private static final String IPV4="^(?:(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))$";
    @Test
    public void testDeviceDiscovery() {
        System.out.println("start device discovered... ");
        Collection<URL> urls=DeviceDiscovery.discoverWsDevicesAsUrls(HTTP, ONVIF);
        int size=urls.size();
        System.out.println(size);
        for (URL url : urls) {
            if(url.getAuthority().split(":")[0].matches(IPV4)) {
                System.out.println(" Device discovered : " + url.toString());
            }
        }

    }
    @Test
    public void testRegx(){
        System.out.println("192.168.10.251:123".split(":")[0].matches(IPV4));
        System.out.println("192.168.100.39".split(":")[0].matches(IPV4));
        System.out.println("192.168.100.329".split(":")[0].matches(IPV4));
        System.out.println("292.168.100.329".split(":")[0].matches(IPV4));
    }
}
