package com.xworkz.task.today;

public class Tablet {

    private String name;
    private int dosage;
    private String use;

    public Tablet(String name, int dosage, String use) {
        this.name = name;
        this.dosage = dosage;
        this.use = use;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", dosage=" + dosage + "mg, use=" + use + "]";
    }
}
