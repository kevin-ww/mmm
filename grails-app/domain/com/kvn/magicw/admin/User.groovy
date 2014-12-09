package com.kvn.magicw.admin

class User {

    boolean isPrimary;//administrator who manage this account;

    String signInId;

    String password;

//    Preference[] preferences;


    static constraints = {
    }

    static mapping = {
        autoImport false
    }

    static hasMany = [preferences: Preference]
}

//class Preference {
//    //
//}
