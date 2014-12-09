package com.kvn.magicw.admin

import com.kvn.magicw.common.PostalAddress

class Organization {

    //http://schema.org/Organization

    PostalAddress address;

//    static hasOne = [address:PostalAddress]

    //ContactPoint,use formatted Json at this moment;

    String contactPoint;

    static mapping = {
//        autoImport false
    }

    static constraints = {
    }

    static embedded = ['address']
}
