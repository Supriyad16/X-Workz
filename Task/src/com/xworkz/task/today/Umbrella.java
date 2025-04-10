package com.xworkz.task.today;

public class Umbrella {
    private String color;
    private boolean isFoldable;
    private String material;

    public Umbrella(String color, boolean isFoldable, String material) {
        this.color = color;
        this.isFoldable = isFoldable;
        this.material = material;
    }


    @Override
    public int hashCode() {
        return 96;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", isFoldable=" + isFoldable + ", material=" + material + "]";
    }
}
