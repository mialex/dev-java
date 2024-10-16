package org.example.o2_Classes;

import java.awt.*;

public class ABicycle {

    // Object variables
    public int cadence = 0;
    public int speed = 0;
    public int gears = 0;
    public int gearsPrivate = initializePrivateVariable();

    //<editor-fold desc="Initialize">

    {
        gears = 100;
    }

    protected final int initializePrivateVariable() {
        return 200;
    }

    //</editor-fold>

    //<editor-fold desc="Constructors">

    public ABicycle() {
        // refers to the public Bicycle(int startCadence) {
        this(0);
    }

    public ABicycle(int cadence) {
        this(cadence, 0);
    }

    public ABicycle(int cadence, int speed) {
        this.cadence = cadence;
        this.speed = speed;
    }

    //</editor-fold>

    public int getGears() {
        return this.gears;
    }

    public int getGearsPrivate() {
        return this.gearsPrivate;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public int getSpeed() {
        return this.speed;
    }

    //<editor-fold desc="Overloading">

    public void build(String s) {
        // ...
    }

    public void build(int i) {
        // ...
    }

    //</editor-fold>

    /**
     * Reference type declaration with Array
     */
    public Polygon polygonFrom(Point[] corners) {
        return new Polygon();
    }

    /**
     * Varargs
     */
    public Polygon polygonFromVarargs(Point... corners) {
        int numberOfSides = corners.length;

        System.out.println(corners[1].x);

        return new Polygon();
    }
}
