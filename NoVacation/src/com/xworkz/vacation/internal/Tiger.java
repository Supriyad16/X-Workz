package com.xworkz.vacation.internal;

public class Tiger extends Lion{

    public void wild(Forest forest){

        forest.largeArea();

        if(forest instanceof Lion){

            Lion lion = (Lion) forest;
            lion.providesOxygen();
            lion.shelter();
            lion.largeArea();
            lion.ecosystem();
            lion.resources();

        }
    }
}
