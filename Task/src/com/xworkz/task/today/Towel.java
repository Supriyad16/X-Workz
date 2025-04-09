package com.xworkz.task.today;

public class Towel {
    private String color;
    private String size;
    private boolean isCotton;

    public Towel(String color, String size, boolean isCotton) {
        this.color = color;
        this.size = size;
        this.isCotton = isCotton;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", size=" + size + ", isCotton=" + isCotton + "]";
    }
}
