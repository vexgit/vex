package org.vex.event;

public interface Event<T> {

    Long id();
    T payload();

}
