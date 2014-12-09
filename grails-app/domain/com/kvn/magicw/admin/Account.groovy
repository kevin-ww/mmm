package com.kvn.magicw.admin

import com.kvn.magicw.App
import com.kvn.magicw.common.PostalAddress

class Account {

    //account setting  , social setting;
    UUID uuid;

    String name;

    Organization organization;

    Date dateCreated

    Date lastUpdated


    static constraints = {
    }

    static embedded = ['organization']

    static hasMany = [users: User, ownedApps: App, followedApps: App, socialSettings: SocialSetting]

    static mapping = {

        users joinTable: [name  : 'account_user']

    }

//    static belongsTo = [organization: Organization]
}

//class Organization { //declared as nested class since only used within account , to increase encapsulation as well
//
//    //http://schema.org/Organization
//
//    PostalAddress address;
//
////    static hasOne = [address:PostalAddress]
//
//    //ContactPoint,use formatted Json at this moment;
//
//    String contactPoint;
//
//    static mapping = {
////        autoImport false
//    }
//}

//class SocialSetting {
//    //
//}

