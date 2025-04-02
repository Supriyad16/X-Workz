package com.xworkz;

import org.w3c.dom.ls.LSException;

public class LaptopRunner {

    public static void main(String[] args) {


Laptop laptop=new Laptop();
        int a=laptop.getPrice();
        System.out.println(a);

        laptop.setPrice(100);

        System.out.println(laptop.getPrice());
    }
}
