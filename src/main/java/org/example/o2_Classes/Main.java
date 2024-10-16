package org.example.o2_Classes;

import java.io.IOException;

public class Main {
    public void run() throws IOException {
        System.out.println("\n===============================");
        System.out.println("========== Classes ============");
        System.out.println("===============================\n");

        var bicycle = new CreateObject();
        bicycle.create();

        var bicycleStatic = new CreateStaticObject();
        bicycleStatic.create();

        // Nested Classes

        System.out.println("\n * Nested Classes");

        System.out.println("\nInner class:");
        NestedOuterClasses outerObject = new NestedOuterClasses();
        NestedOuterClasses.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        NestedOuterClasses.StaticNestedClass staticNestedObject = new NestedOuterClasses.StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nLocal class:");
        outerObject.localClass("New Local parameter value");

        System.out.println("\nAnonymous class:");
        outerObject.anonymousMethod("Anonymous argument");

        System.out.println("\n * Enum");

        var enumObject = new EnumObject();
        enumObject.showExampleEnum();
        enumObject.specialMethods();

        System.out.println("\n * Record");

        var recordClass = new RecordClass(10, 20);
        System.out.println("Record start value:" + recordClass.start());
        System.out.println("Record end value:" + recordClass.end());
    }
}
