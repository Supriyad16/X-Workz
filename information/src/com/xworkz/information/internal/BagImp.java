package com.xworkz.information.internal;

public class BagImp implements Bag{

    public BagImp(){
        System.out.println("no arg const of BagImp ");

    }

    @Override
    public void carry() {
        System.out.println("Running bag in bagimp");

    }
}
