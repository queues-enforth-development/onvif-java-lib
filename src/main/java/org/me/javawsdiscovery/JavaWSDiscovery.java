/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.javawsdiscovery;

import de.onvif.discovery.OnvifDiscovery;
import java.net.URL;
import java.util.List;

/**
 *
 * @author jmccay
 */
public class JavaWSDiscovery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<URL> deviceUrls;

        deviceUrls = OnvifDiscovery.searchOnvifDevices();
    }

}
