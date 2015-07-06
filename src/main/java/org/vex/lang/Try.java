package org.vex.lang;

public interface Try {

    static void run(RunnableWithException r) {
        try {
            r.run();
        } catch (Exception e) {
            throw fatal(e);
        }
    }

    static FatalException fatal(Exception e) {
        return new FatalException(e);
    }
    static FatalException fatal(String message, Object ... args) {
        return new FatalException(message, args);
    }

}