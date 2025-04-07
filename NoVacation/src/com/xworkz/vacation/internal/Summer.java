package com.xworkz.vacation.internal;

public class Summer extends College{

    public  void hot(Ice ice){

        ice.freeze();

        if (ice instanceof Cool){

            Cool cool = (Cool) ice;
            cool.freeze();
            cool.melt();
            cool.floatOnWater();
            cool.temperature();
            cool.crystals();
        }
    }
}
