package com.kvn.magicw.admin

class User {

    boolean isPrimary;//administrator who manage this account;

    String loginName;

    String password;

    String memo;

    Date dateCreated

    Date lastUpdated

    static constraints = {
        loginName maxSize: 50
        memo maxSize: 1000
    }

    static hasMany = [preferences: Preference]


    static belongsTo = [account: Account]   //

    static mapping = {
        autoImport false
        table 'account_user'
    }
}


