package chenflyingkite.util.tool;

import chenflyingkite.util.functional.IOBase;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtil {

    public static void closeIt(Closeable... c) {
        if (c == null) return;
        for (Closeable d : c) {
            if (d != null) {
                try {
                    d.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void flushIt(Flushable... f) {
        if (f == null) return;
        for (Flushable g : f) {
            if (g != null) {
                try {
                    g.flush();
                } catch (IOException e) {
                    // Ignore it
                }
            }
        }
    }

    private static void runIt(boolean ignore, IOBase... b) {
        if (b == null) return;
        for (IOBase c : b) {
            if (c != null) {
                try {
                    c.run();
                } catch (IOException e) {
                    if (!ignore) {
                        e.printStackTrace();
                    } // else Ignore it
                }
            }
        }
    }

    public static InputStreamReader getReader(String filename) {
        return getReader(new File(filename));
    }

    public static InputStreamReader getReader(File file) {
        try {
            return new InputStreamReader(new FileInputStream(file), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
