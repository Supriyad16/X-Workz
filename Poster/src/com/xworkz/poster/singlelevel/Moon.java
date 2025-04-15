package com.xworkz.poster.singlelevel;

public class Moon extends Sun {

    public Moon(double distance, String riseTime) {
        super(distance, riseTime);
    }

    public void glow() {
        System.out.println("Moon glows at night");
    }

    public static void main(String[] args) {
        Moon moon = new Moon(149, "6:00 AM");
        System.out.println("Color: " + moon.distance + ","+" Rise Time: " + moon.riseTime);
        moon.shine();
        moon.glow();
    }
}
