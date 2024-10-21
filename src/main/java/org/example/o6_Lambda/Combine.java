package org.example.o6_Lambda;

import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;

public class Combine {

    public void chainWithDefault() {
        String var = "Hello";

        Predicate<String> nonNull = s -> s != null;
        Predicate<String> nonEmpty = s -> !s.isEmpty();
        Predicate<String> shorterThan5 = s -> s.length() < 5;

        Predicate<String> p = nonNull.and(nonEmpty).and(shorterThan5);
        p.test(var);

        // OR

        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);
        Predicate<String> isNotNullNorEmpty = isNullOrEmpty.negate();
        Predicate<String> shorterThan5size = s -> s.length() < 5;

        Predicate<String> p2 = isNotNullNorEmpty.and(shorterThan5size);
        p2.test(var);
    }

    public void factoryMethod() {
        Predicate<String> isEqualToDuke = Predicate.isEqual("Duke");

        Predicate<Collection<String>> isEmpty = Collection::isEmpty;
        Predicate<Collection<String>> isNotEmpty = Predicate.not(isEmpty);
    }
}
