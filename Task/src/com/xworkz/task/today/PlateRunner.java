package com.xworkz.task.today;

public class PlateRunner {
    public static void main(String[] args) {
        Plate plate = new Plate("Glass", "Round", true);

        System.out.println("Plate " + plate.toString());
        System.out.println("Plate"+plate.hashCode());
        //System.out.println("Plate"+plate.hashCode(value));



    }
}
