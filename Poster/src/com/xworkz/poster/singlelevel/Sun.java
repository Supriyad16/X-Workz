package com.xworkz.poster.singlelevel;

public class Sun {
    double distance;
    String riseTime;

    public Sun(double distance, String riseTime) {
        this.distance = distance;
        this.riseTime = riseTime;
    }

    public void shine() {
        System.out.println("Sun shines brightly in the sky");
    }
}
