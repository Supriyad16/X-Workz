package com.xworkz.task.today;

public class Aeroplane {

    private String model;
    private int capacity;
    private String airline;

    public Aeroplane(String model, int capacity, String airline) {
        this.model = model;
        this.capacity = capacity;
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", capacity=" + capacity + ", airline=" + airline + "]";
    }
}
