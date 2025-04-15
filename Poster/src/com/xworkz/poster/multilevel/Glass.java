package com.xworkz.poster.multilevel;

public class Glass extends Spoon{

    public Glass(String type, String material){
        super(type, material);
    }

    public void drink(){
        System.out.println("Drink water using Glass");
    }

    public static void main(String[] args) {
        Glass glass = new Glass("Breakfast", "Ceramic");
        System.out.println("Type: "+ glass.type + ","+ " Material: "+ glass.material);
        glass.eat();
        glass.use();
        glass.drink();
    }
}
