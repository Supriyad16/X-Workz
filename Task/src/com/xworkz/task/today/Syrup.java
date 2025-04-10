package com.xworkz.task.today;

public class Syrup {

    private String name;
    private String flavor;
    private double volume;

    public Syrup(String name, String flavor, double volume) {
        this.name = name;
        this.flavor = flavor;
        this.volume = volume;
    }


    @Override
    public int hashCode() {
        return 86;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", flavor=" + flavor + ", volume=" + volume + "ml]";
    }
}
