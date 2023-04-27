/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.onvif.discovery;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jmccay
 */
@SuppressWarnings({"OverridableMethodCallInConstructor"})
public abstract class URLDevicePointer {
    private static final Logger LOGGER = Logger.getLogger(URLDevicePointer.class.getPackage().getName());
    private URL address = null;
    private String deviceName = null;

    // Insure the class has a proper state
    protected URLDevicePointer(){}

    /**
     * Constructor for a String URL address.
     * @param address  -
     */
    protected URLDevicePointer(String address) {
        setAddress(address);
    }

    /**
     * Constructor requiring a URL.
     * @param address The URL for the pointer.
     */
    public URLDevicePointer(URL address) {
        this.address = address;
    }

    /**
     * Constructor requiring a URL and deviceName.
     * @param address The URL for the pointer.
     * @param name The deviceName for the device.
     */
    public URLDevicePointer(URL address, String name) {
        this.address = address;
        this.deviceName = name;
    }

    /**
     * Return the URL for this pointer. 
     * @return  -
     */
    public URL getURLAddress() {
        return address;
    }

    /**
     * Sets the URL address.
     * @param address  -
     */
    protected void setURLAddress(URL address) {
        this.address = address;
    }

    /**
     * Returns the deviceName of the device's connection address stored here.
     * @return  -
     */
    public String getName() {
        return deviceName;
    }

    /**
     * Set the Name
     * @param name  -
     */
    protected void setName(String name) {
        this.deviceName = name;
    }

    protected void setAddress(String address) {
        try {
            this.address = new URL(address);
        } catch (MalformedURLException e) {
            LOGGER.log(Level.WARNING, "Error: a malformed URL address was passed to the clase", e);
        }
    }
}
