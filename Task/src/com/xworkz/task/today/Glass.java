package com.xworkz.task.today;

public class Glass {
    private String type;
    private double volume;
    private boolean isTransparent;

    public Glass(String type, double volume, boolean isTransparent) {
        this.type = type;
        this.volume = volume;
        this.isTransparent = isTransparent;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", volume=" + volume + "ml, isTransparent=" + isTransparent + "]";
    }
}
