package com.xworkz.poster.singlelevel;

public class Butter {
    String flavor;
    String texture;

    public Butter(String flavor, String texture) {
        this.flavor = flavor;
        this.texture = texture;
    }

    public void spread() {
        System.out.println("Butter is being spread on bread");
    }
}
