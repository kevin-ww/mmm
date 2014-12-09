package com.kvn.magicw

class Device {

    String browser;

    String browserVersion;

    OS os;

    String osVersion;

    String branding;

    String model;

    String marketingName;

    String category; //The type of device: desktop, tablet, or mobile.

    //
    //    String carrier;

    //Automatic timestamping
    Date dateCreated

    Date lastUpdated


    enum OS {
        IOS,
        ANDROID,
        WINDOWS_PHONE,
        OTHERS
    }

    static constraints = {
    }
}
