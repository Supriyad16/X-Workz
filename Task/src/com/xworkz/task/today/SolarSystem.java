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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                SolarSystem solarSystem = this;
                SolarSystem solarSystem1 = (SolarSystem) obj;
                if (solarSystem1.starName.equals(solarSystem.starName) && solarSystem1.numberOfPlanets==solarSystem.numberOfPlanets) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 80;
    }

    @Override
    public String toString() {
        return "[numberOfPlanets=" + numberOfPlanets + ", starName=" + starName + ", hasLife=" + hasLife + "]";
    }
}
