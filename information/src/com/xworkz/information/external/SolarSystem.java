package com.xworkz.information.external;

import com.xworkz.information.internal.Planet;

public class SolarSystem {

    private Planet planet;

    public SolarSystem(Planet planet) {
        this.planet = planet;
        System.out.println("Arg constructor of SolarSystem");
    }

    public void showOrbit() {
        System.out.println("Displaying orbit...");
        if (this.planet != null) {
            this.planet.revolve();
        } else {
            System.out.println("Planet is null");
        }
    }
}
