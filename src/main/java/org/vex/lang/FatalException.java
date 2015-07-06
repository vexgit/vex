package org.vex.lang;

public class FatalException extends RuntimeException {

    public FatalException(Exception e) {
        super(e);
    }

    public FatalException(String message, Object ... args) {
        super(Strings.slfFormat(message, args));
    }
}
