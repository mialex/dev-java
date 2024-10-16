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

        System.out.println("\n\n\nFINISH MAIN");
    }
}