package com.kvn.magicw.admin

class SocialSetting {

    Date dateCreated

    Date lastUpdated

    static constraints = {
    }

    static belongsTo = [account: Account]   //
}
