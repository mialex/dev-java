package org.example.o5_Generics;

public class Util {
    public static <K, V> boolean compare(IBoxMulti<K, V> p1, IBoxMulti<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
