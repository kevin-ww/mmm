package com.kvn.magicw.track.event

import com.kvn.magicw.Device

class Event {

    String uuid;

    String category; //storybook or campaign

    Action action;  //download,share, pageview ,click-button[],

    String label;   //button name if action=='click button'

    Device device;

    Date dateCreated

    Date lastUpdated

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
        label nullable: true
    }

    static mapping = {
//        tablePerHierarchy true
        tablePerHierarchy false
//        id generator: 'uuid'
    }

    static embedded = ['device']



}
