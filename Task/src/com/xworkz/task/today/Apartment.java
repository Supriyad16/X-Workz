package com.xworkz.task.today;

public class Apartment {
    private String name;
    private int floors;
    private String location;

    public Apartment(String name, int floors, String location) {
        this.name = name;
        this.floors = floors;
        this.location = location;
    }

    @Override
    public int hashCode() {
        return 4;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", floors=" + floors + ", location=" + location + "]";
    }
}
