package com.xworkz.task.today;

public class Bandage {

    private String size;
    private String material;
    private boolean isSterile;

    public Bandage(String size, String material, boolean isSterile) {
        this.size = size;
        this.material = material;
        this.isSterile = isSterile;
    }

    @Override
    public int hashCode() {
        return 8;
    }

    @Override
    public String toString() {
        return "[size=" + size + ", material=" + material + ", isSterile=" + isSterile + "]";
    }
}
