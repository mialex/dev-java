package org.example.o1_PrimitivesAndControls;

/**
 * An array is a container object that holds a fixed number of values of a single type.
 * The length of an array is established when the array is created.
 * After creation, its length is fixed.
 */
public class ArrayType {

    public void exampleOne() {

        int[] anArray;         // declares an array of integers
        anArray = new int[10]; // allocates memory for 2 integers

        anArray[0] = 100;
        anArray[1] = 200;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);

        System.out.println(anArray.length);

        // Element at index 0: 100
        // Element at index 1: 200
    }

    public void exampleTwo() {

        int[] anArray = {100, 200, 300}; // declares and allocates memory for 2 integers

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);

        // Element at index 0: 100
        // Element at index 1: 200
    }

    public void multidimensional() {
        String[][] names = {
            {"Mr. ", "Mrs. "},
            {"Smith", "Jones"}
        };

        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][1] + names[1][1]);

        // Mr. Smith
        // Ms. Jones
    }

    public void copy() {
        String[] copyFrom = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado"};

        String[] copyTo = new String[2];
        System.arraycopy(copyFrom, 2, copyTo, 0, 2);

        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }

        // Cappuccino Corretto
    }

    public void copyTwo() {
        String[] copyFrom = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",};

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 2);

        System.out.println(java.util.Arrays.toString(copyTo));

        // Cappuccino Corretto
    }
}
