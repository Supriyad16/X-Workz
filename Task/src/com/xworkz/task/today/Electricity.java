package com.xworkz.task.today;

public class Electricity {

    private String source;
    private int voltage;
    private boolean isAvailable;

    public Electricity(String source, int voltage, boolean isAvailable) {
        this.source = source;
        this.voltage = voltage;
        this.isAvailable = isAvailable;
    }


    @Override
    public int hashCode() {
        return 29;
    }

    @Override
    public String toString() {
        return "[source=" + source + ", voltage=" + voltage + "V, isAvailable=" + isAvailable + "]";
    }
}
