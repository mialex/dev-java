package org.example.o2_Classes;

public class CreateObject {

    public void create() {
        System.out.println("\n * Object variables");

        ABicycle bicycle = new ABicycle();
        ABicycle bicycle2 = new ABicycle(10);
        ABicycle bicycle3 = new ABicycle(10, 20);

        // it can also be used directly in an expression

        int cadence = new ABicycle(10).cadence;
        int speedMethod = new ABicycle(10, 20).getSpeed();

        System.out.println("Speed property: " + bicycle3.speed);
        System.out.println("Speed method: " + speedMethod);
        System.out.println("Gears: " + bicycle.getGears());
        System.out.println("Gears private: " + bicycle.getGearsPrivate());

        // Class method and variables
    }
}
