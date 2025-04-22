package com.xworkz.information.runner;

import com.xworkz.information.internal.Planet;
import com.xworkz.information.internal.PlanetImp;
import com.xworkz.information.external.SolarSystem;

public class PlanetRunner {

    public static void main(String[] args) {
        Planet planet = new PlanetImp();
        SolarSystem solarSystem = new SolarSystem(planet);
        solarSystem.showOrbit();
    }
}
