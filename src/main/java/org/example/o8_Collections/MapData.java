package org.example.o8_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapData {

    public void simpleMap() {
        Map<Integer, String> map = Map.of(
            1, "one",
            2, "two",
            3, "three"
        );

        Map.Entry<Integer, String> e1 = Map.entry(1, "one");
        Map.Entry<Integer, String> e2 = Map.entry(2, "two");

        Map<Integer, String> mapLonger = Map.ofEntries(e1, e2);

        // or

        Map<Integer, String> map3 = Map.ofEntries(
            Map.entry(1, "one"),
            Map.entry(2, "two")
        );
    }

    public void addItems() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, null);
        map.put(3, "three");

        for (Integer key : map.keySet()) {
            // add default values instead of null
            // only if the key is not already present and not associated to a null value
            map.putIfAbsent(key, "none");
        }

        for (String value : map.values()) {
            System.out.println("value = " + value);
        }

        for (int key = 0; key < 5; key++) {
            System.out.println(map.getOrDefault(key,"UNDEFINED"));
        }

        map.forEach((key, value) -> System.out.println(key + " :: " + value));

        List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven");
        Map<Integer, List<String>> mapCompute = new HashMap<>();

        for (String word: strings) {
            mapCompute.computeIfAbsent(
                word.length(),
                key -> new ArrayList<>()
            ).add(word);
        }
    }
}
