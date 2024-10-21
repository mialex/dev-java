package org.example.o6_Lambda;

import org.example.Common.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Compare {

    public void compare() {
        Comparator<Integer> comparator = (i1, i2) -> Integer.compare(i1, i2);
        // OR
        Comparator<Integer> comparatorSimple = Integer::compare;
    }

    public void compareFactory() {
        Function<String, Integer> toLength = String::length;
        Comparator<String> comparator =
            (s1, s2) -> Integer.compare(
                    toLength.apply(s1),
                    toLength.apply(s2)
            );

        // OR

        Comparator<String> comparator3 = Comparator.comparing(String::length);
    }

    public void compareChain() {
        Comparator<User> byFirstName = Comparator.comparing(User::getFirstName);
        Comparator<User> byLastName = Comparator.comparing(User::getLastName);

        Comparator<User> byFirstNameThenLastName = byFirstName.thenComparing(byLastName);

        // OR

        Comparator<User> byFirstNameThenLastName2 = Comparator.comparing(User::getFirstName)
            .thenComparing(User::getLastName);
    }

    public void compareNaturalOrder() {
        Comparator<String> byLengthThenAlphabetically = Comparator.comparing(String::length)
            .thenComparing(Comparator.naturalOrder());

        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

        strings.sort(byLengthThenAlphabetically);
        System.out.println(strings);

        // reversed
        strings.sort(byLengthThenAlphabetically.reversed());
        System.out.println(strings);
    }

    public void compareNullValues() {
        List<String> strings = Arrays.asList("one", null, "two", "three", null, null, "four", "five");
        Comparator<String> naturalNullsLast = Comparator.nullsLast(Comparator.naturalOrder());
        
        strings.sort(naturalNullsLast);
        System.out.println(strings);
    }
}
