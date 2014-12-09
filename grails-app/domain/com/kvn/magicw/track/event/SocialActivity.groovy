package com.kvn.magicw.track.event

class SocialActivity {

    SocialNetwork socialNetwork;
    URL endorseURL;
    String displayName;
    String post;
    String userHandle;
    URL contentURL;
    String[] tagsSummary;
    String action;
    String socialNetworkAction;
    //    String timestamp;


    enum SocialNetwork {
        WECHAT,
        WEIBO,
        Google,
        OTHERS
        //support more;
    }

    static constraints = {
    }
}
