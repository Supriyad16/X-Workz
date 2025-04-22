package com.xworkz.information.internal;

public class LightImp implements Light {

    public LightImp() {
        System.out.println("No-arg constructor of LightImp");
    }

    @Override
    public void glow() {
        System.out.println("Light is glowing in LightImp");
    }
}
