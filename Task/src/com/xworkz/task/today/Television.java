package com.xworkz.task.today;

public class Television {

    private String brand;
    private int size;
    private boolean isSmart;

    public Television(String brand, int size, boolean isSmart) {
        this.brand = brand;
        this.size = size;
        this.isSmart = isSmart;
    }


    @Override
    public int hashCode() {
        return 89;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", size=" + size + "inch, isSmart=" + isSmart + "]";
    }
}
