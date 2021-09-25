package com.rk.learnkotlin.learnkotlin.oo.challenge.javacode;

public class MountainBike extends Bicycle {

    private int seatHeight;

    public MountainBike(int seatHeight,
                        int cadence,
                        int speed,
                        int gear) {
        super(cadence, speed, gear);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The MountainBike has a seat height of " + seatHeight + " inches.");
    }
}
