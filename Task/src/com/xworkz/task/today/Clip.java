package com.xworkz.task.today;

public class Clip {

    private String type;
    private String color;
    private int quantity;

    public Clip(String type, String color, int quantity) {
        this.type = type;
        this.color = color;
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        return 21;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", color=" + color + ", quantity=" + quantity + "]";
    }
}
