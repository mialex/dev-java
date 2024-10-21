package org.example.o6_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Basic {
    public boolean predicate(String t) {
        Predicate<String> predicateFn =
            (String s) -> {
                return s.length() == 3;
            };

        Predicate<String> predicateFnSimpler = s -> s.length() == 3;

        return predicateFnSimpler.test(t);
    }

    public void consumerList() {
        List<String> strings = Arrays.asList("A", "B");
        Consumer<String> printer = s -> System.out.println(s);
        strings.forEach(printer);
    }

    public void predicateList() {
        List<String> immutableStrings = List.of("one", "two", "three", "four", "five");
        List<String> strings = new ArrayList<>(immutableStrings);

        Predicate<String> isEvenLength = s -> s.length() % 2 == 0;
        strings.removeIf(isEvenLength);

        System.out.println("strings = " + strings);
    }

    public void unaryList() {
        List<String> strings = Arrays.asList("one", "two", "three");
        UnaryOperator<String> toUpperCase = word -> word.toUpperCase();

        strings.replaceAll(toUpperCase);

        System.out.println(strings);
    }
}
