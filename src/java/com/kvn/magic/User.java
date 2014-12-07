package com.kvn.magic;

/**
 * Created by kvn on 12/7/14.
 */
public class User {//visitor

    String uuid;

    //dimensions;

    String ageBracket; //like 10-20

    Gender gender;

    String interestOtherCategory;

    String interestAffinityCategory;

    String interestInMarketCategory;

    public enum Gender {
        MALE, FEMALE,UNKNOWN
    }
}
