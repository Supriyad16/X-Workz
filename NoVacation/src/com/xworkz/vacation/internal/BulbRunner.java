package com.xworkz.vacation.internal;

public class BulbRunner {
    public static void main(String[] args) {


        Bulb bulb = new Dim();
        bulb.light();
        bulb.consumeElectricity();
        bulb.shapes();
        bulb.colours();
        bulb.brightness();


        Dim dim = new Dim();
        dim.light();
        dim.colours();
        dim.consumeElectricity();
        dim.brightness();
        dim.shapes();

        Bright bright = new Bright();
        bright.brightness();
        bright.colours();
        bright.consumeElectricity();
        bright.light();
        bright.shapes();
        bright.burn();
    }
}