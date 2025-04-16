package com.xworkz.rules;

public class DinnerPlate implements Plate {

    @Override
    public void serve() {
        System.out.println("Serving food on the dinner plate");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the dinner plate");
    }

    @Override
    public void stack() {
        System.out.println("Stacking the dinner plates");
    }

    public static void main(String[] args) {
        DinnerPlate plate = new DinnerPlate();
        plate.serve();
        plate.clean();
        plate.stack();
    }
}
