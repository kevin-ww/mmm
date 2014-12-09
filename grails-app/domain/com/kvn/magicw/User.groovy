package com.kvn.magicw

class User {

    String uuid;

    //dimensions;

    String ageBracket; //like 10-20

    Gender gender;

    String interestOtherCategory;

    String interestAffinityCategory;

    String interestInMarketCategory;

    enum Gender {
        MALE, FEMALE, UNKNOWN
    }

    static constraints = {
    }
}
