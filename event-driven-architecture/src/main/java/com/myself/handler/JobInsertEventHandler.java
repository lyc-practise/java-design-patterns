package com.myself.handler;

import com.myself.event.JobInsertEvent;
import com.myself.framework.Handler;

public class JobInsertEventHandler implements Handler<JobInsertEvent> {
    @Override
    public void onEvent(JobInsertEvent jobInsertEvent) {
        System.out.println("handle " + jobInsertEvent.toString());
    }
}
