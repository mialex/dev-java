package org.example.o9_Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Basic {
    public void firstTry() {
        List<String> strings = List.of("one","two","three","four");

        var map = strings
                .stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        map.forEach((key, value) -> System.out.println(key + " :: " + value));
    }
}
