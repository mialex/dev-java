package org.example.o2_Classes;

public class CreateStaticObject {

    public void create() {
        System.out.println("\n * Static variables");

        ABicycleStatic bicycle = new ABicycleStatic();
        ABicycleStatic bicycle2 = new ABicycleStatic();

        // Class method and variables

        System.out.println("Number private: " + ABicycleStatic.getNumberOfBicycles());
        System.out.println("Number public: " + ABicycleStatic.numberOfBicyclesPublic);
    }
}
