package com.xworkz.rules;

public class YogaMat implements Mat {

    @Override
    public void lay() {
        System.out.println("Laying down the yoga mat");
    }

    @Override
    public void step() {
        System.out.println("Stepping on the yoga mat");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the yoga mat");
    }

    public static void main(String[] args) {
        YogaMat mat = new YogaMat();
        mat.lay();
        mat.step();
        mat.clean();
    }
}
