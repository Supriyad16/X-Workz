package com.xworkz.rules;

public class WinterQuilt implements Quilt {

    @Override
    public void cover() {
        System.out.println("Covering with the winter quilt");
    }

    @Override
    public void warm() {
        System.out.println("Keeping warm with the winter quilt");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the winter quilt");
    }

    public static void main(String[] args) {
        WinterQuilt quilt = new WinterQuilt();
        quilt.cover();
        quilt.warm();
        quilt.clean();
    }
}
