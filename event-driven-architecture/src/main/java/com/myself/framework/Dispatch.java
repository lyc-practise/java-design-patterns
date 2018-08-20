package com.myself.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * 事件分发器
 */
public class Dispatch {

    private Map<Class<? extends Event> ,  Handler<? extends Event>> handlerRegist ;

    public Dispatch(){
        handlerRegist = new HashMap<>();
    }

    /**
     * 注册事件和处理器的对应关系，以EventClass为key，handler 为value
     * @param eventClass
     * @param handler
     */
    public <E extends Event> void  registHandle(Class<E> eventClass, Handler<E> handler){
        handlerRegist.put(eventClass, handler);
    }


    /**
     * 事件分发
     * 这里注意需要将 Handler<? extends Event> 转换为  Handler<E>
     * 及 < E extends Event > 与 <? extends Event> 不指代相同含义
     */
    public <E extends Event> void  dispatch(E event){

        Handler<E> handler = (Handler<E>)handlerRegist.get(event.getType());
        if(null != handlerRegist.get(event.getType())){
            handler.onEvent(event);
        }
    }





}
