package org.drychop;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.function.Function;

/**
 * Created by teunh on 21/03/14.
 */
public class StringIterator {

    private String string;

    StringIterator(String string) {
        this.string = string;
    }

    public Function<String, Boolean> eachLine(Function<String, Boolean> function) {
        String[] parts = string.split("\n");
        for (String part : parts) {
            if (!function.apply(part)) {
                break;
            }
        }
        return function;
    }

    public Function<String, Boolean> eachLine(PrintStream writer) {
        return eachLine(line -> { writer.println(line); return true; });
    }

    public StringFactory construct() {
        return new StringFactory(string);
    }
}
