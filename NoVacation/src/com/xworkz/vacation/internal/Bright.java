package com.xworkz.vacation.internal;

public class Bright extends Dim{

    public void dull(Bulb bulb){

        bulb.brightness();

        if(bulb instanceof Dim){

           Dim dim = (Dim) bulb;

            dim.brightness();
            dim.colours();
            dim.consumeElectricity();
            dim.light();
            dim.shapes();
            dim.burn();
        }
    }
}
