package com.xworkz.task.today;

public class Aeroplane {

    private String model;
    private int capacity;
    private String airline;

    public Aeroplane(String model, int capacity, String airline) {
        this.model = model;
        this.capacity = capacity;
        this.airline = airline;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Aeroplane aeroplane = this;
                Aeroplane aeroplane1 = (Aeroplane) obj;
                if (aeroplane1.model.equals(aeroplane1.model) && aeroplane1.capacity==aeroplane1.capacity) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", capacity=" + capacity + ", airline=" + airline + "]";
    }
}
