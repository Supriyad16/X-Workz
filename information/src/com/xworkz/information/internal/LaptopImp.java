package com.xworkz.information.internal;

public class LaptopImp implements Laptop{

    public LaptopImp(){
        System.out.println("no arg const of laptopimp");
    }


    @Override
    public void process() {
        System.out.println("Running process laptopimp");
    }
}
