package demo;

import org.drychop.DryLib;
import org.drychop.StringFactory;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

import static org.drychop.DryLib.*;

public class Demo {


    public static void main(String[] args) {

        int max = _(1, 2, 3).max().orElse(0);

        double min = _(1.0, 2.2, 34.3).min().orElse(0);

        $().from(LocalDate.now())
           .eachDayIn(Period.ofDays(31))
           .doo(System.out::println);

        $().from(LocalDate.now())
           .to(LocalDate.now().plusDays(10))
           .eachDay(System.out::println);

        $(10).times(System.out::println);

        $(10).upTo(20, System.out::println);

        $(10).downTo(5, i -> System.out.println("i = " + i));

        $("Hello\nWorld").eachLine(Demo::handleLine);

        $("Lorem Ipsum\nSecond line\nThird line")
                .eachLine(System.out);

        $("Hello\nWorld\nStop").eachLine(line -> {
            if (line.equalsIgnoreCase("stop")) {
                return false;
            }
            System.out.println(line);
            return true;
        });

        List<Book> books = Arrays.asList(new Book(true), new Book(false));
        StringFactory builder = new StringFactory();
        books.forEach(book -> builder.appendIf(book::isNice, book.toString()));

        String s = null;
        throwIf(s, DryLib::isNull);
    }

    private static boolean handleLine(String line) {
        System.out.println("New line: " + line);
        return true;
    }

    private static class Book {
        private boolean nice;

        private Book(boolean nice) {
            this.nice = nice;
        }

        public boolean isNice() {
            return nice;
        }
    }
}
