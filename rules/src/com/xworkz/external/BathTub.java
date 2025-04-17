package com.xworkz.external;

import com.xworkz.rules.*;

public class BathTub implements Tub {

    @Override
    public void fill() {
        System.out.println("Filling the bathtub with water");
    }

    @Override
    public void drain() {
        System.out.println("Draining the bathtub");
    }

    @Override
    public void soak() {
        System.out.println("Soaking in the bathtub");
    }

    @Override
    public void bath(){
        System.out.println("bath in bathtub");
    }

    public static void main(String[] args) {
        BathTub bathTub = new BathTub();
        bathTub.fill();
        bathTub.drain();
        bathTub.soak();
        bathTub.bath();
    }

}