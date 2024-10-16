package org.example.o5_Generics;

import java.util.Arrays;

public class Main {
    public void run() {
        System.out.println("\n===============================");
        System.out.println("=========== Generics ==========");
        System.out.println("===============================\n");

        Box<Integer> integerBox1 = new Box<Integer>();
        Box<Integer> integerBox2 = new Box<>(); // Type inference

        IBoxMulti<String, Integer> p11 = new BoxMulti<String, Integer>("Even", 8);
        IBoxMulti<String, String>  p12 = new BoxMulti<String, String>("hello", "world");
        IBoxMulti<String, Box<Integer>> p13 = new BoxMulti<String, Box<Integer>>("primes", new Box<Integer>());
        //or
        BoxMulti<String, Integer> p21 = new BoxMulti<>("Even", 8);
        BoxMulti<String, String>  p22 = new BoxMulti<>("hello", "world");
        BoxMulti<String, Box<Integer>> p23 = new BoxMulti<>("primes", new Box<Integer>());

        boolean same1 = Util.<String, Integer>compare(p11, p21);
        // or
        boolean same2 = Util.compare(p11, p21); // type inference

        // wildcard
        System.out.println(" - wildcard upper bounded \n");
        integerBox1.upperBoundWildcard(Arrays.asList(1, 2));
        integerBox1.upperBoundWildcard(Arrays.asList(1.2, 2.3));

        System.out.println("\n - wildcard unbounded \n");
        integerBox1.unboundWildcard(Arrays.asList(1, 2));
        integerBox1.unboundWildcard(Arrays.asList(1.2, 2.3));

        // wildcard
        System.out.println("\n - wildcard lower bounded \n");
        integerBox1.lowerBoundWildcard(Arrays.asList(1, 2));
//        integerBox1.lowerBoundWildcard(Arrays.asList(1.2, 2.3));
    }
}
