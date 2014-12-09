package com.kvn.magicw

class App {

    //may not only the app owned , also include app operated by competitors;

    String uuid;

    String name;

    String version;

    String memo;

    static constraints = {
    }
//    static embedded=['appStoreURLs']

    static hasMany = [appStoreURLs: AppStoreURL]

}

class AppStoreURL {

    // Apple App Store
    // Apple Mac App Store

    // Amazon App store
    // Windows Phone Store

    // Google Play
    // Windows Store

    String appStoreName;

    URL url;    //url at the appStore

    String memo;
}

