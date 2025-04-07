package com.xworkz.vacation.internal;

public class Seeds extends Tree{

    public  void planted(Plant plant){

        plant.grow();

        if (plant instanceof Tree) {

            Tree tree = (Tree) plant;
            tree.grow();
            tree.absorbWater();
            tree.photosynthesis();
            tree.oxygenRelease();
            tree.provideShade();
        }
    }
}
