package org.drychop;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by teunh on 22/03/14.
 */
public final class LocalDateHolder {

    private final LocalDate from;

    public LocalDateHolder(LocalDate from) {
        this.from = from;
    }

    public LocalPeriodHolder to(LocalDate to) {
       return new LocalPeriodHolder(from, to);
    }

    public PeriodIterator eachDayIn(Period p) {
        return new PeriodIterator(from, p);
    }
}
