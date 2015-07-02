package org.vex.lang;

public interface Threads {
    static void sleep(long millis) {
        Try.run(() -> Thread.sleep(millis));
    }
}
