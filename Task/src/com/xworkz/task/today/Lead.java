package com.xworkz.task.today;

public class Lead {
    private double weight;
    private String form;
    private boolean isToxic;

    public Lead(double weight, String form, boolean isToxic) {
        this.weight = weight;
        this.form = form;
        this.isToxic = isToxic;
    }


    @Override
    public int hashCode() {
        return 46;
    }

    @Override
    public String toString() {
        return "[weight=" + weight + "g, form=" + form + ", isToxic=" + isToxic + "]";
    }
}
