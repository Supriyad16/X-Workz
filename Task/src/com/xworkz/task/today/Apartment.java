package com.xworkz.task.today;

public class Apartment {
    private String name;
    private int floors;
    private String location;

    public Apartment(String name, int floors, String location) {
        this.name = name;
        this.floors = floors;
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Apartment apartment = this;
                Apartment apartment1 = (Apartment) obj;
                if (apartment1.floors==(apartment.floors) && apartment1.name.equals(apartment1.name)) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }


    @Override
    public int hashCode() {
        return 4;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", floors=" + floors + ", location=" + location + "]";
    }
}
