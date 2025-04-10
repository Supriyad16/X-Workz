package com.xworkz.task.today;

public class Wall {

    private String material;
    private double height;
    private String color;

    public Wall(String material, double height, String color) {
        this.material = material;
        this.height = height;
        this.color = color;
    }


    @Override
    public int hashCode() {
        return 97;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", height=" + height + ", color=" + color + "]";
    }
}
