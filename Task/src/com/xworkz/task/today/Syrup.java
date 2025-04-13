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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Syrup syrup = this;
                Syrup syrup1 = (Syrup) obj;
                if (syrup1.name.equals(syrup1.name) && syrup1.volume==syrup1.volume) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
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
