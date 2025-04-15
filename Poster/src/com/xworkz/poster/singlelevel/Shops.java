package com.xworkz.poster.singlelevel;

public class Shops extends Mall{

    public Shops(String name, String area){
        super(name, area);
    }

    public void items(){
        System.out.println("Shops have different items");
    }

    public static void main(String[] args) {
        Shops shops = new Shops("Orion", "Rajajinagar");
        System.out.println("Name: "+ shops.name + " Area: " + shops.area);
        shops.shopping();
        shops.items();
    }


}
