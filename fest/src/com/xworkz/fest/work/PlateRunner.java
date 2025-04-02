package com.xworkz.fest.work;

public class PlateRunner {

    public static void main(String[] args) {

        Plate plate = new Spoon();

        plate.shape();
        plate.clean();
        plate.hold();
        plate.size();
        plate.material();

        Spoon spoon = new Spoon();

        spoon.eat();
        spoon.design();
        spoon.measure();
        spoon.stir();
        spoon.scoop();
    }
}
