package com.kvn.magicw.track.event

class SocialActivity extends Event{

    SocialNetwork socialNetwork;
    URL endorseURL;
    String displayName;
    String post;
    String userHandle;
    URL contentURL;
    String[] tagsSummary;
    String socialAction;
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
        tagsSummary maxSize: 1000
    }

    static belongsTo = [event: Event]

    static mapping = {
        endorseURL column :'endorse_url'
        contentURL column :'content_url'
        tagsSummary type:  String
        table 'event_social_activity'
    }
}
