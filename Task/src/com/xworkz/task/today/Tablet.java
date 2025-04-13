package com.xworkz.task.today;

import javafx.scene.control.Tab;

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Tablet tablet = this;
                Tablet tablet1 = (Tablet) obj;
                if (tablet1.name.equals(tablet1.name) && tablet1.dosage==tablet1.dosage) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 87;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", dosage=" + dosage + "mg, use=" + use + "]";
    }
}
