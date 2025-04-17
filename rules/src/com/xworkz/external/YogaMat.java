package com.xworkz.external;

import com.xworkz.rules.Mat;

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

    @Override
    public void sweep(){
        System.out.println("do yoga ");
    }

    public static void main(String[] args) {
        YogaMat yogaMat = new YogaMat();
        yogaMat.lay();
        yogaMat.step();
        yogaMat.clean();
        yogaMat.sweep();
    }
}
