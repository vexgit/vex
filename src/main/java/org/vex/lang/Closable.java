package org.vex.lang;

public interface Closable extends AutoCloseable {

    @Override
    void close();
}
