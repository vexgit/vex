package org.vex.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VexMainContext extends AnnotationConfigApplicationContext {

    private final Logger logger = LoggerFactory.getLogger(VexMainContext.class);

    public VexMainContext() {
        super();
        this.setDisplayName(VexMainContext.class.getName());
        this.registerShutdownHook();
        this.scan("org.vex");

    }

    @Override
    public void refresh() {
        super.refresh();
        logger.info("Started Vex.");
    }
}