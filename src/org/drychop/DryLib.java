package org.drychop;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Created by teunh on 21/03/14.
 */
public final class DryLib {

    private DryLib() {}

    public LocalDateHolder from(LocalDate date) {
        return new LocalDateHolder(date);
    }

    public static IntStream _(int... numbers) {
        return Arrays.stream(numbers);
    }
    public static DoubleStream _(double... doubles) {
        return Arrays.stream(doubles);
    }
    public static LongStream _(long... longs) {
        return Arrays.stream(longs);
    }

    public static DryLib $() {
        return new DryLib();
    }

    public static NumberIterator $(int number) {
        return new NumberIterator(number);
    }

    public static StringIterator $(String string) {
        return new StringIterator(string);
    }

    public static <T> void throwIf(T arg, Predicate<T> predicate) {
        if (predicate.test(arg)) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> boolean isNull(T arg) {
        return arg == null;
    }



}
