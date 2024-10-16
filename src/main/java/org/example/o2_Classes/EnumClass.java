package org.example.o2_Classes;

public enum EnumClass {
    // MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    // MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");

    MONDAY("MON") {
        @Override
        void doSomething() {
            System.out.println("MON implement abstract");
        }
    },
    TUESDAY("TUE") {
        @Override
        void doSomething() {
            System.out.println("TUE implement abstract");
        }
    },
    WEDNESDAY("WED") {
        @Override
        void doSomething() {
            System.out.println("WED implement abstract");
        }
    };

    private final String name;

    EnumClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void doSomething();
}
