package com.xworkz.vacation.internal;

public class Shades extends Specs{

    public void summer(Glass glass){

        glass.fragile();

        if (glass instanceof Specs){

            Specs specs = (Specs) glass;
            specs.fragile();
            specs.heatResistance();
            specs.reflect();
            specs.material();
            specs.transparency();
        }
    }
}
