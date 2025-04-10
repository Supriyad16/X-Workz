package com.xworkz.task.today;

public class Plate {
    private String material;
    private String shape;
    private boolean isMicrowaveSafe;

    public Plate(String material, String shape, boolean isMicrowaveSafe) {
        this.material = material;
        this.shape = shape;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public int hashCode() {
        String value = "X-workz";
        return 66;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", shape=" + shape + ", isMicrowaveSafe=" + isMicrowaveSafe + "]";
    }
}
