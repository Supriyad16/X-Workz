package com.xworkz.task.today;

public class Machine {
    private String type;
    private String usage;
    private int power;

    public Machine(String type, String usage, int power) {
        this.type = type;
        this.usage = usage;
        this.power = power;
    }


    @Override
    public int hashCode() {
        return 49;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", usage=" + usage + ", power=" + power + "W]";
    }
}
