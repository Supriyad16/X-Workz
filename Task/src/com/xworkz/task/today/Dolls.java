package com.xworkz.task.today;

public class Dolls {
    private String type;
    private String material;
    private double height;

    public Dolls(String type, String material, double height) {
        this.type = type;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", material=" + material + ", height=" + height + " cm]";
    }
}
