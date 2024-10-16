package org.example.o4_Inheritance;

public class Child extends Parent {
    public int speed;

    public Child(int cadence, int speed) {
        super(cadence);

        this.speed = speed;
    }

    public void setSpeed(int newValue) {
        speed = newValue;
    }

    @Override
    public void showCadence() {
        System.out.println("Child cadence: " + (this.getCadence() + 10));
    }

    public static void classMethod() {
        System.out.println("Child static method");
    }
}
