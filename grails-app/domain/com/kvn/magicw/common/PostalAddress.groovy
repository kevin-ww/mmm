package com.kvn.magicw.common

class PostalAddress {

    String country;
    String locality;
    String region;
    String postalCode;
    String streetAddress;

    String formattedAddress;

    Date dateCreated

    Date lastUpdated

    static constraints = {
    }
}
