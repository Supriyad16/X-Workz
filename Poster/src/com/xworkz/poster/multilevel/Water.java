package com.xworkz.poster.multilevel;

public class Water extends Algae {

    public Water(String type, String color) {
        super(type, color);
    }

    public void flow() {
        System.out.println("Water helps in the growth of algae");
    }
}
