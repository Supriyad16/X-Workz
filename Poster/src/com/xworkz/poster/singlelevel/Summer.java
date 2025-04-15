package com.xworkz.poster.singlelevel;

public class Summer extends Bottle{

    public Summer(String brand, String material){
        super(brand, material);
    }

    public void carry(){
        System.out.println("Carry water bottle during summer");
    }

    public static void main(String[] args) {

        Summer summer = new Summer("Milton", "Steel");
        System.out.println("Brand: " + summer.brand + "," + " Material: "+ summer.material);
        summer.drink();
        summer.carry();
    }
}
