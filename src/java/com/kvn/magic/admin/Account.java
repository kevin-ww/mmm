package com.kvn.magic.admin;

import com.kvn.magic.App;
import com.kvn.magic.common.PostalAddress;

/**
 * Created by kvn on 12/7/14.
 */
public class Account {

    //account setting  , social setting;
    String uuid;

    String name;

    Organization organization;

    User adminUser;//administrator who manage this account;

    App[] apps; //managed mobile apps;

    Organization org;

    Preference[] preferences;

    SocialSetting socialSetting;

    class Organization{

        //http://schema.org/Organization

        PostalAddress address;

        //ContactPoint,use formatted Json at this moment;

        String contactPoint;
    }

    class Preference{
        //
    }

    class SocialSetting{
        //
    }

}

