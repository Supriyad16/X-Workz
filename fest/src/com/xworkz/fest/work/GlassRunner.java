package com.xworkz.fest.work;

public class GlassRunner {

    public static void main(String[] args) {

        Glass glass = new Specs();
        glass.fragile();
        glass.heatResistance();
        glass.reflect();
        glass.material();
        glass.transparency();

        Specs specs = new Specs();
        specs.fragile();
        specs.heatResistance();
        specs.reflect();
        specs.material();
        specs.transparency();
    }
}

