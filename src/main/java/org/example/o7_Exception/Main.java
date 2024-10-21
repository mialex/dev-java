package org.example.o7_Exception;

import org.example.o6_Lambda.Basic;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.EmptyStackException;

public class Main {
    public void run() {
        System.out.println("\n===============================");
        System.out.println("=========== Exception =========");
        System.out.println("===============================\n");

        ListOfNumbers listOfNumbers = new ListOfNumbers();
        listOfNumbers.readList();
        try {
            listOfNumbers.writeListWithResource();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            listOfNumbers.multiTryWithResource("Test.zip", "TestFile");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            listOfNumbers.throwUncheckedException();
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
    }
}
