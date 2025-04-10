package com.xworkz.task.today;

public class Motherboard {

    private String model;
    private String socketType;
    private int ramSlots;

    public Motherboard(String model, String socketType, int ramSlots) {
        this.model = model;
        this.socketType = socketType;
        this.ramSlots = ramSlots;
    }


    @Override
    public int hashCode() {
        return 52;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", socketType=" + socketType + ", ramSlots=" + ramSlots + "]";
    }
}
