package com.xworkz.poster.hybrid;

public class Drip extends Drop {
    public void leak() {
        System.out.println("Drip leaks slowly.");
    }

    public static void main(String[] args) {
        Drip drip = new Drip();
        drip.splash();
        drip.fall();
        drip.leak();

        Mist mist = new Mist();
        mist.splash();
        mist.floatAround();
    }
}
