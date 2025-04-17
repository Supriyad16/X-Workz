package com.xworkz.external;

import com.xworkz.rules.Plate;
import com.xworkz.rules.Spoon;

public class Serve implements Plate, Spoon {

    @Override
    public void stack() {
        System.out.println("Placing food on the plate");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the plate");
    }

    @Override
    public void serve() {
        System.out.println("Serving food on the plate");
    }

    @Override
    public void scoop() {
        System.out.println("Scooping food with the spoon");
    }

    @Override
    public void stir() {
        System.out.println("Stirring with the spoon");
    }

    @Override
    public void eat() {
        System.out.println("Cleaning the spoon");
    }

    public static void main(String[] args) {
        Plate plate = new Serve();
        plate.stack();
        plate.clean();
        plate.serve();

        Spoon spoon = new Serve();
        spoon.scoop();
        spoon.stir();
        spoon.eat();
    }
}
