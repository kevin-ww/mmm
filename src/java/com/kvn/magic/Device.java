package com.kvn.magic;

/**
 * Created by kvn on 12/7/14.
 */
public class Device {   //more specifically ,mobile device;

    String browser;

    String browserVersion;

    OperationSystem os;

    String osVersion;

    String branding;

    String model;

    String marketingName;

    String category; //The type of device: desktop, tablet, or mobile.

    //
    //    String carrier;

    public enum OperationSystem {
        IOS,
        ANDROID,
        WINDOWS_PHONE,
        OTHERS
    }


}
