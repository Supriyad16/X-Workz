package com.xworkz.vacation.internal;

public class WaterGlass extends Spoon{

    public void drink(Plate plate){

        plate.clean();

        if (plate instanceof Spoon){

            Spoon spoon = (Spoon) plate;
            spoon.shape();
            spoon.clean();
            spoon.hold();
            spoon.size();
            spoon.material();
        }
    }
}
