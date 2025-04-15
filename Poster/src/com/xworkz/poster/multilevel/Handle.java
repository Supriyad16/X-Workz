package com.xworkz.poster.multilevel;

public class Handle extends Door {

    public Handle(String material, String color) {
        super(material, color);
    }

    public void rotate() {
        System.out.println("Rotating the handle to open the door");
    }
}
