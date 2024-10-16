package org.example.o4_Inheritance;

import org.example.o1_PrimitivesAndControls.ArrayType;
import org.example.o1_PrimitivesAndControls.ControlFlow;
import org.example.o1_PrimitivesAndControls.Declaration;
import org.example.o1_PrimitivesAndControls.PrimitiveTypes;

import java.io.IOException;

public class Main {
    public void run() {
        System.out.println("\n===============================");
        System.out.println("========= Inheritance =========");
        System.out.println("===============================\n");

        Child objChild = new Child(1, 2);
        // or
        Object obj = new Child(1, 2);
        // or
        Parent objParent = new Child(1, 2);

        // compile-time error because obj is not known to the compiler to be a MountainBike
        // Child objChild = obj;

        Parent objChildParent = (Parent)obj;
        // or save way
        if (obj instanceof Parent) {
            Parent objChildParent2 = (Parent)obj;
        }

        objChild.showCadence();
        objChildParent.showCadence();
        Child.classMethod();
        Parent.classMethod();
    }
}
