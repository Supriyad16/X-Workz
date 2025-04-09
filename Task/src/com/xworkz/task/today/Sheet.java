package com.xworkz.task.today;

public class Sheet {

    private String material;
    private String size;
    private String color;

    public Sheet(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", color=" + color + "]";
    }
}
