package com.kvn.magicw.admin

import com.kvn.magicw.App
import com.kvn.magicw.common.PostalAddress

class Account {

    //account setting  , social setting;
    String uuid;

    String name;

//    Organization organization;

//    User[] managedUsers;

//    App[] ownedApps; //managed mobile apps;
//
//    App[] followedApps;

//    SocialSetting socialSetting;

    static constraints = {
    }

    static embedded = ['organization']

//  static hasMany = [managedUsers: User, ownedApps: App, followedApps: App, socialSettings: SocialSetting]
    static hasMany = [managedUsers: User, ownedApps: App, followedApps: App]

    static belongsTo = [organization: Organization]
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

