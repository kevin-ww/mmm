package com.kvn.magicw.track.event

class Event {

    String uuid;

    String category; //storybook or campaign

    Action action;  //download,share, pageview ,click-button[],

    String label;   //button name if action=='click button'

    Date timestamp;

    enum Action {
        DOWNLOAD,
        SHARE,
        PAGEVIEW,
        CLICK,
        INSTALL,
        UNINSTALL,
        OTHERS
        //support more;
    }

    static constraints = {
    }
}
