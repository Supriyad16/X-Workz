package com.xworkz.task.today;

public class LANCable {

    private String type;
    private int length;
    private boolean isShielded;

    public LANCable(String type, int length, boolean isShielded) {
        this.type = type;
        this.length = length;
        this.isShielded = isShielded;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", length=" + length + "m, isShielded=" + isShielded + "]";
    }
}
