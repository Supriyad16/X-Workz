package com.xworkz.vacation.internal;

public class PlateRunner {

    public static void main(String[] args) {

        Plate plate = new Spoon();
        plate.shape();
        plate.clean();
        plate.hold();
        plate.size();
        plate.material();

        Spoon spoon = new Spoon();
        spoon.shape();
        spoon.clean();
        spoon.hold();
        spoon.size();
        spoon.material();

        WaterGlass waterGlass = new WaterGlass();
        waterGlass.shape();
        waterGlass.clean();
        waterGlass.hold();
        waterGlass.size();
        waterGlass.material();

    }
}
