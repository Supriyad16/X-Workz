package com.xworkz.information.internal;

public class KnifeImp implements Knife {

    public KnifeImp() {
        System.out.println("No-arg constructor of KnifeImp");
    }

    @Override
    public void cut() {
        System.out.println("Cutting with KnifeImp");
    }
}
