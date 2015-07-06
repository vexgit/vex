package org.vex.event;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vex.AbstractFullTestContext;

public class EventRepositoryTest extends AbstractFullTestContext {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private EventRepository eventRepository;

    @Test
    public void shouldPersistEvent() {

    }

}
