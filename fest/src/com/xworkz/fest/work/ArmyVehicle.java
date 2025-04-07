package com.xworkz.fest.work;

public class ArmyVehicle {

    public void vehicle(Rubber rubber){

        rubber.expand();
        // ref instanceof datatype
        if(rubber instanceof Tyre) {
            System.out.println("rubber is tyre");

            Tyre tyre = (Tyre) rubber;  //casting
            tyre.compress();
        }

        if(rubber instanceof MrfTyre) {
            System.out.println("rubber is MRFtyre");

            MrfTyre mrfTyre = (MrfTyre) rubber;
            mrfTyre.compress();
            mrfTyre.radial();
        }

        System.out.println("Army Vehicle.");
    }
}

// casting : converting parent data type to sub class data type.

