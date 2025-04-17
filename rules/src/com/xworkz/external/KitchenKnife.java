package com.xworkz.external;

import com.xworkz.rules.Knife;

public class KitchenKnife implements Knife {

    @Override
    public void cut() {
        System.out.println("Cutting vegetables with the kitchen knife");
    }

    @Override
    public void slice() {
        System.out.println("Slicing fruits with the kitchen knife");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the kitchen knife");
    }

    @Override
    public void wipe(){
        System.out.println("Wipe knife");
    }

    public static void main(String[] args) {
        KitchenKnife kitchenKnife = new KitchenKnife();
        kitchenKnife.cut();
        kitchenKnife.slice();
        kitchenKnife.clean();
        kitchenKnife.wipe();
    }
}
