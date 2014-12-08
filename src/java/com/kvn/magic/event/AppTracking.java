package com.kvn.magic.event;

import com.kvn.magic.App;
import com.kvn.magic.AppInstallation;

/**
 * Created by kvn on 12/7/14.
 */
public class AppTracking extends Event{

//    Dimensions
//    ga:appInstallerIdApp Installer ID
//    ga:appVersionApp Version
//    ga:appNameApp Name
//    ga:appIdApp ID
//    ga:screenNameScreen Name
//    ga:screenDepthScreen Depth
//    ga:landingScreenNameLanding Screen
//    ga:exitScreenNameExit Screen

//    String appInstallerId;
//    String version;
//    String name;
//    String uuid;
    String screenName;
    String screenDepth;
    String landingScreen;
    String exitScreen;

    AppInstallation appInstallation;//app download?




}
