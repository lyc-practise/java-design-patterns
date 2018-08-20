package com.myself.handler;

import com.myself.event.JobUpdateEvent;
import com.myself.framework.Handler;

public class JobUpdateEventHandler implements Handler<JobUpdateEvent> {
    @Override
    public void onEvent(JobUpdateEvent jobUpdateEvent) {

        System.out.println("handle "+jobUpdateEvent.toString());
    }
}
