package org.vex.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.vex.components.ThreadManager;
import org.vex.lang.Closable;

import javax.annotation.PostConstruct;

@Component
class KeepAliveThread implements Closable {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final ThreadManager threadManager;
    private final Thread keepAlive;

    @Autowired
    KeepAliveThread(ThreadManager threadManager) {
        this.threadManager = threadManager;
        keepAlive = new Thread(() -> {
            threadManager.sleep(Long.MAX_VALUE);
        });
        keepAlive.setName(KeepAliveThread.class.getName());
    }

    @PostConstruct
    void run() {
        keepAlive.start();
    }

    @Override
    public void close() {
        logger.info("closing the keepAliveThread");
        keepAlive.interrupt();
    }
}
