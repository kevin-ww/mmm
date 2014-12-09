package com.kvn.magicw.track.event

import com.kvn.magicw.AppStoreURL


class AppTracking {

    String appId;

    AppStoreURL appStoreURL;    //required only if tracking app download

    String screenName;
    int screenDepth;
    String landingScreen;
    String exitScreen;


    static constraints = {
    }
}
