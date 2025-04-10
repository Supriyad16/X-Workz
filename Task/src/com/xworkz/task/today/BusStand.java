package com.xworkz.task.today;

public class BusStand {

    private String name;
    private int platforms;
    private boolean hasParking;

    public BusStand(String name, int platforms, boolean hasParking) {
        this.name = name;
        this.platforms = platforms;
        this.hasParking = hasParking;
    }


    @Override
    public int hashCode() {
        return 15;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", platforms=" + platforms + ", hasParking=" + hasParking + "]";
    }
}
