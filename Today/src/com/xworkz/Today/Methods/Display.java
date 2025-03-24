package com.xworkz.Today.Methods;

import java.security.PublicKey;

public class Display {

     String name;
     String brand;
    public void ads(){

        System.out.println("The is class display");
    }
//constructor
    public Display() {
        System.out.println("Default constructor");
    }


    // one class constructor to another constructor

    public Display(String name) {
        this();
        System.out.println("parametrized constructor");
        // one constructor to another constructor

        this.name = name;


    }

    public Display(String name, String brand) {
        this(name);
        // constructor chaining
         // same construcor name but different parameters/datatype or length of paramters

//        this.name = name;
        this.brand = brand;
    }



    public static void main(String[] args) {

        Display display = new Display("laptop");
    }







}
