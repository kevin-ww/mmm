package com.kvn.magicw

class App {

    String uuid;

    String name;

    String version;

    String memo;

    //Automatic timestamping
    Date dateCreated

    Date lastUpdated

    static constraints = {
    }
//    static embedded=['appStoreURLs']

    static hasMany = [appStoreURLs: AppStoreURL]

}


