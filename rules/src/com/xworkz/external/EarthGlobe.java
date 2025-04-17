package com.xworkz.external;

import com.xworkz.rules.Globe;

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

    @Override
    public void mark(){
        System.out.println("mark location on globe");
    }

    public static void main(String[] args) {
        EarthGlobe earthGlobe = new EarthGlobe();
        earthGlobe.rotate();
        earthGlobe.point();
        earthGlobe.study();
        earthGlobe.mark();
    }
}
