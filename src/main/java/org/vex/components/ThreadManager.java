package org.vex.components;

import org.springframework.stereotype.Component;

@Component
public class ThreadManager {

    public void sleep(long timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {}
    }

}
