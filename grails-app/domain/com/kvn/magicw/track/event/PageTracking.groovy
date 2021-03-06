package com.kvn.magicw.track.event

class PageTracking extends Event{

    String hostName;
    String pagePath;

    String pagePathLevel1Page;
    String pagePathLevel2Page;
    String pagePathLevel3Page;
    String pagePathLevel4Page;

    String pageTitle;
    String landingPage;
    String secondPage;
    String exitPage;
    String previousPage;
    String nextPage;

    int pageDepth;

    static constraints = {
    }

    static belongsTo = [event: Event]

    static mapping = {
        table 'event_page_tracking'
    }
}
