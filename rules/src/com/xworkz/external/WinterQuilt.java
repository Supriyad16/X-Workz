package com.xworkz.external;

import com.xworkz.rules.Quilt;

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

    @Override
    public void winter(){
        System.out.println("quilt needs in winter ");
    }

    public static void main(String[] args) {
        WinterQuilt winterQuilt = new WinterQuilt();
        winterQuilt.cover();
        winterQuilt.warm();
        winterQuilt.clean();
        winterQuilt.winter();
    }
}
