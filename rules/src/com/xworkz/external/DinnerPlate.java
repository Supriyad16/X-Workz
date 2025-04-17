package com.xworkz.external;

import com.xworkz.rules.Plate;

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

    @Override
    public void breakfast(){
        System.out.println("eat dinner in plate");
    }

    public static void main(String[] args) {
        DinnerPlate dinnerPlate = new DinnerPlate();
        dinnerPlate.serve();
        dinnerPlate.clean();
        dinnerPlate.stack();
        dinnerPlate.breakfast();
    }
}
