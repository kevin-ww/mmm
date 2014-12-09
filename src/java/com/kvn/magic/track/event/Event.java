package com.kvn.magic.track.event;

/**
 * Created by kvn on 12/7/14.
 */



//    Notes
//    In the basic data model used in Google Analytics, the user (visitor) interacts with your content over a period of time, and the engagement with your site or app is broken down into a hierarchy. Each of these three levels of interaction defines a specific scope of user engagement.
//
//    User (visitor)—the client that visits the site, such as the browser or mobile phone operated by a person.
//    Session (visit)—the period of time during which the visitor is active on the site.
//            Interaction (hit)—the individual activities that send a GIF request (hit) to the Analytics servers. These are typically characterized by a pageview, but can include:
//    a pageview
//    an event (e.g. click on a movie button)
//    a transaction
//    a social interaction

public class Event {//generic event;

    String uuid;

    String category; //storybook

    Action action;  //download,share, pageview ,click-button[],

    String label;   //button name if action=='click button'


    enum Action{
        DOWNLOAD,
        SHARE,
        PAGEVIEW,
        CLICK,
        OTHERS
        //support more;
    }



}
