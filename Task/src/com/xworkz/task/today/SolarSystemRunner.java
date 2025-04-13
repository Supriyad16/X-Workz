package com.xworkz.task.today;

public class SolarSystemRunner {

    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(8, "Sun", true);
        System.out.println("SolarSystem " + solarSystem.toString());

        int code = solarSystem.hashCode();
        String value="galaxy";
        System.out.println("Galaxy:" + solarSystem.hashCode());
        System.out.println("Galaxy:" + value.hashCode());

        SolarSystem solarSystem1 = new SolarSystem(9, "Aquaries", false);
        boolean equal= solarSystem1.equals(solarSystem1);
        System.out.println("equal :"+ equal);
    }
}
