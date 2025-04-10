package com.xworkz.task.today;

public class Ring {
    private String metal;
    private double size;
    private boolean hasStone;

    public Ring(String metal, double size, boolean hasStone) {
        this.metal = metal;
        this.size = size;
        this.hasStone = hasStone;
    }


    @Override
    public int hashCode() {
        return 70;
    }

    @Override
    public String toString() {
        return "[metal=" + metal + ", size=" + size + ", hasStone=" + hasStone + "]";
    }
}
