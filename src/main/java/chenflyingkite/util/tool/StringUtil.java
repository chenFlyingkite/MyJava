package chenflyingkite.util.tool;

import chenflyingkite.util.functional.Get_LL_L;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StringUtil {

    public static int containsAt(String key, String[] data) {
        return containsAt(key, Arrays.asList(data));
    }

    public static int containsAt(String key, List<String> data) {
        if (data != null) {
            for (int i = 0; i < data.size(); i++) {
                if (key.contains(data.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static String contains(String key, Collection<String> data) {
        if (data != null) {
            for (String s : data) {
                if (s.contains(key)) {
                    return s;
                }
            }
        }
        return null;
    }

    private static final Get_LL_L<String, Boolean> contains = String::contains;
    private static final Get_LL_L<String, Boolean> equals = String::equals;

    /**
     * Convert milliseconds to mm:ss.SSS format
     * E.g. MMSSFFF(123456 ms)
     *    = MMSSFFF(123.456 sec)
     *    = MMSSFFF(2 min 3.5 sec)
     *    = "02:03.5"
     */
    public static String MMSSFFF(long ms) {
        if (ms < 0) return "-" + MMSSFFF(-ms);

        final long f = ms % 1000;
        final long s = ms / 1000;
        final long sec = s % 60;
        final long min = s / 60;
        return String.format(java.util.Locale.US, "%02d:%02d.%03d", min, sec, f);
    }
}
