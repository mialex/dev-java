package org.example.o4_Inheritance;

public class Parent {
    public int cadence;

    public Parent(int cadence) {
        this.cadence = cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void showCadence() {
        System.out.println("Parent cadence: " + this.getCadence());
    }

    public static void classMethod() {
        System.out.println("Parent static method");
    }

    public final int getCadence() {
        return cadence;
    }
}
