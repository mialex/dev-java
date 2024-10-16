package org.example.o1_PrimitivesAndControls;

import java.io.IOException;

public class Main {
    public void run() throws IOException {
        System.out.println("\n===============================");
        System.out.println("=== Primitives and Controls ===");
        System.out.println("===============================\n");

        var primitiveTypes = new PrimitiveTypes();
        primitiveTypes.examples();

        var arrayType = new ArrayType();
        arrayType.exampleOne();

        var controlFlow = new ControlFlow();
        controlFlow.exampleIfThen(true, 2);

        var declaration = new Declaration();
        declaration.examplesVar();
    }
}
