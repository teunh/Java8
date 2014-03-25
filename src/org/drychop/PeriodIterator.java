package org.drychop;

import sun.jvm.hotspot.ci.ciConstant;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Consumer;

/**
 * Created by teunh on 22/03/14.
 */
public class PeriodIterator {

    private LocalDate start;
    private Period period;

    public PeriodIterator(LocalDate start, Period period) {
        this.start = start;
        this.period = period;
    }

    public void doo(Consumer<LocalDate> consumer) {
        DryLib.$(period.getDays())
                .times(day -> consumer.accept(start.plusDays(day)));
    }
}
