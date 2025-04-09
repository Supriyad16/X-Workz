package com.xworkz.task.today;

public class SolarSystem {

    private int numberOfPlanets;
    private String starName;
    private boolean hasLife;

    public SolarSystem(int numberOfPlanets, String starName, boolean hasLife) {
        this.numberOfPlanets = numberOfPlanets;
        this.starName = starName;
        this.hasLife = hasLife;
    }

    @Override
    public String toString() {
        return "[numberOfPlanets=" + numberOfPlanets + ", starName=" + starName + ", hasLife=" + hasLife + "]";
    }
}
