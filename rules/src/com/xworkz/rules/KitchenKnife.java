package com.xworkz.rules;

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

    public static void main(String[] args) {
        KitchenKnife knife = new KitchenKnife();
        knife.cut();
        knife.slice();
        knife.clean();
    }
}
