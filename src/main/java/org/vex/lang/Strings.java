package org.vex.lang;

import org.slf4j.helpers.MessageFormatter;

public interface Strings {

    static String slfFormat(String pattern, Object... params) {
        return MessageFormatter.arrayFormat(pattern, params).getMessage();
    }

}
