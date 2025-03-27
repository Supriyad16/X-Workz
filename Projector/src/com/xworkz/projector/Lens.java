package com.xworkz.projector;

public class Lens {

    private String type;
    private int focalLength;

    Lens(String type, int focalLength) {
        this.type = type;
        this.focalLength = focalLength;
    }

    void displayLensDetails() {
        System.out.println("Lens Type: " + type + ", Focal Length: " + focalLength);
    }
}

