package com.kvn.magicw

import com.kvn.magicw.admin.Account

class App {

//    String uuid;

    String name;

    String token;

    String version;

    String memo;

    //Automatic timestamping
    Date dateCreated

    Date lastUpdated

    static constraints = {
        memo maxSize: 1000
    }
//    static embedded=['appStoreURLs']

    static hasMany = [appStoreURLs: AppStoreURL]

    static belongsTo = [account: Account]

    static mapping = {

        id generator: 'guid'
//        users joinTable: [name  : 'account_user']

    }

}


