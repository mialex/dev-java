package org.example.o5_Generics;

import java.util.List;

public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public void upperBoundWildcard(List<? extends Number> list) {
        for (Number elem : list) {
            System.out.println("?: " + elem.getClass().getName());
        }
    }

    public void unboundWildcard(List<?> list) {
        for (Object elem : list) {
            System.out.println("?: " + elem.getClass().getName());
        }
    }

    public void lowerBoundWildcard(List<? super Number> list) {
        for (Object elem : list) {
            System.out.println("?: " + elem.getClass().getName());
        }
    }
}
