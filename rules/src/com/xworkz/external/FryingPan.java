package com.xworkz.external;

import com.xworkz.rules.Pan;

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

    @Override
    public void fry(){
        System.out.println("Fry veggies in pan");
    }

    public static void main(String[] args) {
        FryingPan fryingPan = new FryingPan();
        fryingPan.heat();
        fryingPan.cook();
        fryingPan.clean();
        fryingPan.fry();
    }
}
