package com.myself;

import com.myself.event.JobInsertEvent;
import com.myself.event.JobUpdateEvent;
import com.myself.framework.Dispatch;
import com.myself.framework.Event;
import com.myself.framework.Handler;
import com.myself.handler.JobInsertEventHandler;
import com.myself.handler.JobUpdateEventHandler;

public class App {

    public static void main(String[] args) {



        Handler insertHandler = new JobInsertEventHandler();
        Handler updateHandler = new JobUpdateEventHandler();

        Dispatch dispatch = new Dispatch();
        dispatch.registHandle(JobInsertEvent.class, insertHandler);
        dispatch.registHandle(JobUpdateEvent.class, updateHandler);

        // 分发 insertEvent
        dispatch.dispatch(new JobInsertEvent());
        // 分发 updateEvent
        dispatch.dispatch(new JobUpdateEvent());

    }
}
