package com.xworkz.task.today;

public class Curler {
    private String type;
    private int temperature;
    private boolean isAutomatic;

    public Curler(String type, int temperature, boolean isAutomatic) {
        this.type = type;
        this.temperature = temperature;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", temperature=" + temperature + "°C, isAutomatic=" + isAutomatic + "]";
    }
}
