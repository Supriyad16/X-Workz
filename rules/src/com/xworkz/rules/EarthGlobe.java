package com.xworkz.rules;

public class EarthGlobe implements Globe {

    @Override
    public void rotate() {
        System.out.println("Rotating the earth globe");
    }

    @Override
    public void point() {
        System.out.println("Pointing a country on the earth globe");
    }

    @Override
    public void study() {
        System.out.println("Studying geography using the earth globe");
    }

    public static void main(String[] args) {
        EarthGlobe globe = new EarthGlobe();
        globe.rotate();
        globe.point();
        globe.study();
    }
}
