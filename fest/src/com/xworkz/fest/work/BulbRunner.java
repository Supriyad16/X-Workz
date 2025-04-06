package com.xworkz.fest.work;

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
    }
}
