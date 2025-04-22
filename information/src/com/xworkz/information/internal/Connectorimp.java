package com.xworkz.information.internal;

public class Connectorimp implements Connector{


   public  Connectorimp(){
        System.out.println("no arg const of Connectorimp");
    }


    @Override
    public void connects() {
        System.out.println("Running connects in Connectorimp");
    }
}
