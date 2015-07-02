package org.vex.components;

import org.springframework.stereotype.Component;
import org.vex.lang.Try;

@Component
public class ThreadManager {

    public void sleep(long timeout) {
        Try.run(() ->  Thread.sleep(timeout));
    }

}
