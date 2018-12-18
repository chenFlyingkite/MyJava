package chenflyingkite.util.log;

public interface Formatter {
    default String _fmt(String format, Object... param) {
        return String.format(java.util.Locale.US, format, param);
    }
}
