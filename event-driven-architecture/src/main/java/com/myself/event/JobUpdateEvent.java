package com.myself.event;

public class JobUpdateEvent extends BaseEvent {

    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
