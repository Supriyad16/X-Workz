package com.xworkz.task.today;

public class Coffee {
    private String type;
    private boolean hasMilk;
    private int sugarLevel;

    public Coffee(String type, boolean hasMilk, int sugarLevel) {
        this.type = type;
        this.hasMilk = hasMilk;
        this.sugarLevel = sugarLevel;
    }

    @Override
    public int hashCode() {
        return 22;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", hasMilk=" + hasMilk + ", sugarLevel=" + sugarLevel + "]";
    }
}
