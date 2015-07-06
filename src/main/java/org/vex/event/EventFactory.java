package org.vex.event;

import java.util.concurrent.atomic.AtomicLong;

public class EventFactory {

    private AtomicLong maxId;

    public EventFactory(long maxId) {
        this.maxId = new AtomicLong(maxId);
    }

    public <T> Event<T> eventOf(T payload) {
        return new DefaultEvent<>(maxId.incrementAndGet(), payload);
    }

}
