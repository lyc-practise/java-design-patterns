package com.myself.event;

import com.myself.framework.Event;

public abstract class BaseEvent implements Event {

    @Override
    public Class getType(){
        return getClass();
    }
}
