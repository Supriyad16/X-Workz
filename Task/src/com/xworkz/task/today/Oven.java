package com.xworkz.task.today;

public class Oven {
    private int capacity;
    private boolean isMicrowave;
    private String brand;

    public Oven(int capacity, boolean isMicrowave, String brand) {
        this.capacity = capacity;
        this.isMicrowave = isMicrowave;
        this.brand = brand;
    }


    @Override
    public int hashCode() {
        return 59;
    }

    @Override
    public String toString() {
        return "[capacity=" + capacity + "L, isMicrowave=" + isMicrowave + ", brand=" + brand + "]";
    }
}
