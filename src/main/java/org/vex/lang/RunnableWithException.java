package org.vex.lang;

@FunctionalInterface
public interface RunnableWithException {

    void run() throws Exception;
}