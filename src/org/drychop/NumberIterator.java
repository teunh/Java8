package org.drychop;

/**
 * Created by teunh on 21/03/14.
 */
public class NumberIterator {

    private int n;

    NumberIterator(int n) {
        this.n = n;
    }

    public void times(Iteration iter) {
        for (int i = 0; i < n; i++) {
            iter.run(i);
        }
    }

    public void upTo(int x, Iteration iter) {
        if (x < n) {
            throw new IllegalArgumentException();
        }
        for (int i = n; i < i; i++) {
            iter.run(i);
        }
    }

    public void downTo(int x, Iteration iter) {
        if (x > n) {
            throw new IllegalArgumentException();
        }
        for (int i = n; i > x; i--) {
            iter.run(i);
        }
    }

    public interface Iteration {
        public void run(int n);
    }

}
