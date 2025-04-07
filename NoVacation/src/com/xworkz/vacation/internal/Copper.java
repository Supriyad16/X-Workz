package com.xworkz.vacation.internal;

public class Copper extends Steel{

    public void water(Bottle bottle){

        bottle.materials();

        if(bottle instanceof Steel){

            Steel steel = (Steel) bottle;
            steel.colour();
            steel.portable();
            steel.materials();
            steel.reusable();
            steel.shapes();
            steel.store();

        }
    }
}
