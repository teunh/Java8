package org.drychop;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Consumer;

/**
 * Created by teunh on 22/03/14.
 */
public class LocalPeriodHolder {
    private final LocalDate from;
    private final LocalDate to;

    public LocalPeriodHolder(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }

    public void eachDay(Consumer<LocalDate> consumer) {
        Period period = Period.between(from, to);
        new PeriodIterator(from, period).doo(consumer);
    }
}
