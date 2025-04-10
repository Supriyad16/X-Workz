package com.xworkz.task.today;

public class Theater {

    private String name;
    private int capacity;
    private String location;

    public Theater(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
    }


    @Override
    public int hashCode() {
        return 90;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", capacity=" + capacity + ", location=" + location + "]";
    }
}
