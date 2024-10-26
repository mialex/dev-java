package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("START MAIN");

        var primitivesAndControls = new org.example.o1_PrimitivesAndControls.Main();
        primitivesAndControls.run();

        var classes = new org.example.o2_Classes.Main();
        classes.run();

        var numbersAndString = new org.example.o3_NumbersAndStrings.Main();
        numbersAndString.run();

        var inheritance = new org.example.o4_Inheritance.Main();
        inheritance.run();

        var generics = new org.example.o5_Generics.Main();
        generics.run();

        var lambda = new org.example.o6_Lambda.Main();
        lambda.run();

        var exception = new org.example.o7_Exception.Main();
        exception.run();

        var collection = new org.example.o8_Collections.Main();
        collection.run();

        var streams = new org.example.o9_Streams.Main();
        streams.run();

        System.out.println("\n\n\nFINISH MAIN");
    }
}