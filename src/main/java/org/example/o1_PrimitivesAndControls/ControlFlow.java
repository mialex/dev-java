package org.example.o1_PrimitivesAndControls;

public class ControlFlow {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY
    }

    public void exampleIfThen(boolean isMoving, int currentSpeed) {
        if (isMoving) {
            // the "then" clause: decrease current speed
            currentSpeed--;
        }

        // or

        if (isMoving)
            currentSpeed--;
    }

    public void exampleIfThenElse(boolean isMoving, int currentSpeed, int testscore) {
        if (isMoving) {
            currentSpeed--;
        } else {
            System.err.println("The bicycle has already stopped!");
        }

        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }

    public void exampleWhileAndDo() {
        int count = 1;

        // while

        while (count < 11) {
            count++;
        }

        // do - while

        do {
            count--;
        } while (count > 1);

        // infinite loop

        while (true) {
            // your code goes here
        }
    }

    public void exampleFor() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Count is: " + i);
        }

        // enhanced for

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }

        // infinite loop

        for ( ; ; ) {
            // your code goes here
        }
    }

    public void exampleBreak() {

        // unlabeled

        int[] arrayOfInts = { 32, 87, 3, 589 };

        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == 12) {
                break;
            }
        }

        // labeled
        // The break statement terminates the labeled statement; it does not transfer the flow of control to the label.

        int[][] arrayOfInts2 = {
            {  32,   87,    3, 589 },
            {  12, 1076, 2000,   8 },
            { 622,  127,   77, 955 }
        };

    search:
        for (int i = 0; i < arrayOfInts2.length; i++) {
            for (int j = 0; j < arrayOfInts2[i].length; j++) {
                if (arrayOfInts2[i][j] == 12) {
                    break search;
                }
            }
        }
    }

    public void exampleContinue() {

        // unlabeled

        String searchMe = "peter piper picked a " + "peck of pickled peppers";

        for (int i = 0; i < searchMe.length(); i++) {
            if (searchMe.charAt(i) != 'p') {
                continue;
            }
        }

        // labeled

        String substring = "sub";

    test:
        for (int i = 0; i <= searchMe.length() - substring.length(); i++) {
            int n = substring.length();
            int j = i;
            int k = 0;

            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
        }
    }

    public int exampleYield(Day day) {
        return switch (day) {
            case MONDAY, TUESDAY -> 0;
            default -> {
                int remainingWorkDays = 5 - day.ordinal();
                yield remainingWorkDays;
            }
        };
    }

    public void exampleSwitch(int quarter, Day day) {
        String quarterLabel = null;

        // switch statement

        switch (quarter) {
            case 1: case 2:
                if (2 == quarter)
                    quarterLabel = "Q2 - Winter";
                else
                    quarterLabel = "Q1 - Winter";
                break;
            case 3: quarterLabel = "Q3 - Spring";
                break;
            default: quarterLabel = "Unknown quarter";
        }

        // switch expression

        quarterLabel = switch (day) {
            case MONDAY, TUESDAY -> {
                if (2 == quarter)
                    yield "Q2 - Winter";
                else
                    yield "Q1 - Winter";
            }
            case WEDNESDAY -> "Q3 - Spring";
            default -> "Unknown quarter";
        };

        // with yeild

        quarterLabel = switch (day) {
            case MONDAY, TUESDAY: yield "Q1 - Winter";
            case WEDNESDAY: yield "Q3 - Spring";
            case THURSDAY: yield "Q4 - Spring";
        };
    }
}
