package org.vex.event;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.annotation.Id;

class DefaultEvent<T> implements Event<T> {

    @Id
    private long id;
    private T payload;

    DefaultEvent(long id, T payload) {
        this.id = id;
        this.payload = payload;
    }

    @Override
    public Long id() {
        return id;
    }

    @Override
    public T payload() {
        return null;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE, true);
    }
}