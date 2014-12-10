package com.kvn.magicw.admin

import com.kvn.magicw.App
import com.kvn.magicw.common.PostalAddress

class Account {

    //account setting  , social setting;

    String name;

    Organization organization;

    Date dateCreated

    Date lastUpdated

//    App[] followedApps

    static constraints = {
    }

//    static embedded = ['organization']

    static hasMany = [users: User, ownedApps: App,  socialSettings: SocialSetting]

    static mapping = {

        id generator: 'guid'
//        users joinTable: [name  : 'account_user']

    }

//    static belongsTo = [organization: Organization]
}


