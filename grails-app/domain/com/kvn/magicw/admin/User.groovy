package com.kvn.magicw.admin

class User {

    boolean isPrimary;//administrator who manage this account;

    String signInId;

    String password;

    Date dateCreated

    Date lastUpdated

    static constraints = {
    }

    static mapping = {
        autoImport false
        table 'account_user'
    }

    static hasMany = [preferences: Preference]
}

//class Preference {
//    //
//}
