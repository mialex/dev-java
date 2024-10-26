package org.example.o8_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class ListData {

    public void arrayList() {
        Collection<String> strings = new ArrayList<>();

        strings.add("one");
        strings.add("two");
        strings.remove("one");
        strings.contains("one");
        strings.size();
        strings.isEmpty();

        Collection<String> otherStrings = new ArrayList<>();
        otherStrings.add("one");
        otherStrings.add("two");

        strings.containsAll(otherStrings);
        strings.addAll(otherStrings);
        strings.retainAll(otherStrings);
        strings.removeAll(otherStrings);
    }

    public void simpleArray() {
        Collection<String> strings = List.of("one", "two");
//        Collection<String> strings = List.of("one", "two", "three", "four", "five", "six");

        String[] largerTab = {"three", "three", "three", "I", "was", "there"};
        System.out.println("largerTab = " + Arrays.toString(largerTab));

        String[] result = strings.toArray(largerTab);
        System.out.println("result = " + Arrays.toString(result));
    }

    public void removeIf() {
        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);

        Collection<String> strings = new ArrayList<>();
        strings.add(null);
        strings.add("");
        strings.add("one");

        strings.removeIf(isNullOrEmpty);
    }
}
