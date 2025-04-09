package com.xworkz.task.today;

public class Tea {
    private String flavor;
    private boolean isHot;
    private int strength;

    public Tea(String flavor, boolean isHot, int strength) {
        this.flavor = flavor;
        this.isHot = isHot;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "[flavor=" + flavor + ", isHot=" + isHot + ", strength=" + strength + "]";
    }
}
