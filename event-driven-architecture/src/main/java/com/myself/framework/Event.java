package com.myself.framework;

public interface Event {

    Class<? extends Event> getType();
}
