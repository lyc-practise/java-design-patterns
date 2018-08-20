package com.myself.event;

public class JobInsertEvent extends BaseEvent {


    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
