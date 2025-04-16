package com.xworkz.rules;

public class FryingPan implements Pan {

    @Override
    public void heat() {
        System.out.println("Heating the frying pan");
    }

    @Override
    public void cook() {
        System.out.println("Cooking food in the frying pan");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the frying pan");
    }

    public static void main(String[] args) {
        FryingPan pan = new FryingPan();
        pan.heat();
        pan.cook();
        pan.clean();
    }
}
