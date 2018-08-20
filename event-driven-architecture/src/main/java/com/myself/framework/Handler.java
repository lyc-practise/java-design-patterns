package com.myself.framework;

public interface  Handler<E extends Event> {

     void onEvent(E e);
}
