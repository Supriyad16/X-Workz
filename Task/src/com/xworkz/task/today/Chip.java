package com.xworkz.task.today;

public class Chip {

    private String type;
    private String manufacturer;
    private double size;

    public Chip(String type, String manufacturer, double size) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", manufacturer=" + manufacturer + ", size=" + size + "nm]";
    }
}
