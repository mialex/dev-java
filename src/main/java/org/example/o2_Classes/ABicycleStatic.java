package org.example.o2_Classes;

public class ABicycleStatic {

    // Class variables
    private static int numberOfBicycles = initializePrivateVariable();
    public static int numberOfBicyclesPublic;

    // Constant
    static final double PI = 3.141592653589793;

    //<editor-fold desc="Initialize">

    static {
        // whatever code is needed for initialization goes here
        numberOfBicyclesPublic = 10;
    }

    private static int initializePrivateVariable() {
        // initialization code goes here
        return 20;
    }

    //</editor-fold>

    //<editor-fold desc="Constructors">

    public ABicycleStatic() {
        ABicycleStatic.numberOfBicycles++;
        ABicycleStatic.numberOfBicyclesPublic++;
    }

    //</editor-fold>

    /**
     * Class method
     */
    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }
}
