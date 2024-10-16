package org.example.o2_Classes;

public class AMountainBike extends ABicycle {

    public int seatHeight;

    public AMountainBike(int startHeight, int startCadence, int startSpeed) {
        super(startCadence, startSpeed);

        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
