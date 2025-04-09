package com.xworkz.task.today;

public class Wire {

    private String material;
    private int length;
    private boolean isInsulated;

    public Wire(String material, int length, boolean isInsulated) {
        this.material = material;
        this.length = length;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", length=" + length + "m, isInsulated=" + isInsulated + "]";
    }
}
