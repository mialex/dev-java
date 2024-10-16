package org.example.o2_Classes;

public class EnumObject {

    public void showExampleEnum() {
        EnumClass weekStart = EnumClass.MONDAY;

        if (weekStart == EnumClass.MONDAY) {
            System.out.println("The week starts on Monday.");
        }

        // ----

        EnumClass someDay = EnumClass.MONDAY;

        switch (someDay) {
            case MONDAY ->
                System.out.println("MONDAY.");
            case TUESDAY, WEDNESDAY ->
                System.out.println("TUESDAY, WEDNESDAY, THURSDAY.");
            default ->
                throw new AssertionError("Should not happen");
        }

        weekStart.doSomething();
    }

    public void specialMethods() {
        System.out.println("name(): " + EnumClass.MONDAY.name());    // prints "MONDAY"
        System.out.println("ordinal(): " + EnumClass.MONDAY.ordinal());// prints "0" because MONDAY is the first constant in the DayOfWeek enum

        EnumClass[] days = EnumClass.values(); // all days of the week
        EnumClass monday = EnumClass.valueOf("MONDAY");
    }
}
