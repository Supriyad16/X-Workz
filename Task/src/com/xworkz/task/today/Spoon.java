package com.xworkz.task.today;

public class Spoon {
    private String size;
    private String material;
    private boolean isDisposable;

    public Spoon(String size, String material, boolean isDisposable) {
        this.size = size;
        this.material = material;
        this.isDisposable = isDisposable;
    }

    @Override
    public int hashCode() {
        return 82;
    }

    @Override
    public String toString() {
        return "[size=" + size + ", material=" + material + ", isDisposable=" + isDisposable + "]";
    }
}
