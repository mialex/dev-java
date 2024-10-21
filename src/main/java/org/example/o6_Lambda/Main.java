package org.example.o6_Lambda;

import org.example.o5_Generics.Box;

public class Main {
    public void run() {
        System.out.println("\n===============================");
        System.out.println("=========== Lambda ==========");
        System.out.println("===============================\n");

        Basic basic = new Basic();
        System.out.println(basic.predicate("One") ? "=3" : "!=3");

        basic.consumerList();
        basic.predicateList();
        basic.unaryList();

        Combine combine = new Combine();
        combine.chainWithDefault();
        combine.factoryMethod();
    }
}
