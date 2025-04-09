package com.xworkz.task.today;

public class Plastic {
    private String type;
    private boolean recyclable;
    private String color;

    public Plastic(String type, boolean recyclable, String color) {
        this.type = type;
        this.recyclable = recyclable;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", recyclable=" + recyclable + ", color=" + color + "]";
    }
}
