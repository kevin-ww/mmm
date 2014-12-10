package com.kvn.magicw

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

    //Automatic timestamping
    Date dateCreated

    Date lastUpdated


    static belongsTo = [app: App]


    static mapping = {
//        autoImport false
        table 'appstore_url'
    }

    static constraints = {
        memo maxSize: 1000
    }
}
