package com.kvn.magic.track;

import com.kvn.magic.track.event.Event;

/**
 * Created by kvn on 12/8/14.
 */
public interface Track<E extends Event> {

    void collect(E event);

}
