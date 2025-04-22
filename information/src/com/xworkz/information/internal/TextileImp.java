package com.xworkz.information.internal;

public class TextileImp implements Textile {

    public TextileImp() {
        System.out.println("No-arg constructor of TextileImp");
    }

    @Override
    public void produce() {
        System.out.println("Running produce in TextileImp");
    }
}
