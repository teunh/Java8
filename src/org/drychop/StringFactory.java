package org.drychop;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by teunh on 22/03/14.
 */
public class StringFactory {

    private StringBuilder builder = new  StringBuilder();

    public StringFactory() {}

    public StringFactory(String string) {
        builder.append(string);
    }

    public StringFactory appendIf(Supplier<Boolean> supplier, String substring) {
        if (supplier.get()) {
            append(substring);
        }
        return this;
    }

    public StringFactory appendIf(boolean condition, String substring) {
        if (condition) {
            builder.append(substring);
        }
        return this;
    }

    public StringFactory append(String substring) {
        builder.append(substring);
        return this;
    }


}
