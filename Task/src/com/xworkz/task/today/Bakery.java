package com.xworkz.task.today;

public class Bakery {
    private String name;
    private String location;
    private int establishedYear;

    public Bakery(String name, String location, int establishedYear) {
        this.name = name;
        this.location = location;
        this.establishedYear = establishedYear;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", location=" + location + ", establishedYear=" + establishedYear + "]";
    }
}
