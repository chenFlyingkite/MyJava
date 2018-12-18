package chenflyingkite.util.log;

import chenflyingkite.util.functional.Run_LL;

import java.util.Locale;

public interface Loggable extends Formatter {
    /**
     * Writing the log with message
     * @param msg The message to be logged
     */
    void log(String msg);

    /**
     * Writing the log with String format and its parameters
     *
     * @see String#format(String, Object...)
     * @see String#format(Locale, String, Object...)
     */
    default void log(String format, Object... param) {
        log(_fmt(format, param));
    }

    default void printLog(Run_LL ss, String tag, String message) {
        ss.get(tag, message);
    }

    default void printfLog(Run_LL ss, String tag, String format, Object... param) {
        printLog(ss, tag, _fmt(format, param));
    }
}
