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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Lead lead = this;
                Lead lead1 = (Lead) obj;
                if (lead1.weight==(lead.weight) && lead1.form.equals(lead.form)) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
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
