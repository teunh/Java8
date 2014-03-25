package org.drychop;

/**
 * Created by teunh on 14/03/14.
 */
public final class Number {

    private long times;

    private Number(long times) {
        this.times = times;
    }

    static Number integer(int number) {
        return new Number(Long.valueOf(number));
    }

    public void times(Runnable function) {
        for (int i = 0; i < times; i++) {
            function.run();
        }
    }





}
