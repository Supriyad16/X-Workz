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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Tea tea = this;
                Tea tea1 = (Tea) obj;
                if (tea1.flavor.equals(tea.flavor) && tea1.strength==tea1.strength) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 88;
    }

    @Override
    public String toString() {
        return "[flavor=" + flavor + ", isHot=" + isHot + ", strength=" + strength + "]";
    }
}
