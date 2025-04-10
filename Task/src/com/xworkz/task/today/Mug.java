package com.xworkz.task.today;

public class Mug {
    private String color;
    private String material;
    private double volume;

    public Mug(String color, String material, double volume) {
        this.color = color;
        this.material = material;
        this.volume = volume;
    }


    @Override
    public int hashCode() {
        return 54;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", material=" + material + ", volume=" + volume + "ml]";
    }
}
