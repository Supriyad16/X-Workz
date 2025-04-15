package com.xworkz.poster.multilevel;

public class Door {

    String material;
    String color;

    public Door(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void open() {
        System.out.println("Opening the door");
    }
}
