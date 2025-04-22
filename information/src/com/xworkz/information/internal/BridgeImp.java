package com.xworkz.information.internal;

public class BridgeImp implements Bridge {

    public BridgeImp() {
        System.out.println("No-arg constructor of BridgeImp");
    }

    @Override
    public void build() {
        System.out.println("Running build in BridgeImp");
    }
}
