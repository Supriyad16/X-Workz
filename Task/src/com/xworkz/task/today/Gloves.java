package com.xworkz.task.today;

public class Gloves {

    private String material;
    private String size;
    private boolean isDisposable;

    public Gloves(String material, String size, boolean isDisposable) {
        this.material = material;
        this.size = size;
        this.isDisposable = isDisposable;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", isDisposable=" + isDisposable + "]";
    }
}
