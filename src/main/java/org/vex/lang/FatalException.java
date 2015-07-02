package org.vex.lang;

public class FatalException extends RuntimeException {

    public FatalException(Exception e) {
        super(e);
    }
}
