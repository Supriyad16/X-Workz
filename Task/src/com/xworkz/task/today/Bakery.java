package com.xworkz.task.today;

public class Bakery {
    private String name;
    private String location;
    private int establishedYear;

    public Bakery(String name, String location, int establishedYear) {
        this.name = name;
        this.location = location;
        this.establishedYear = establishedYear;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Bakery bakery = this;
                Bakery bakery1 = (Bakery) obj;
                if (bakery.name.equals(bakery1.name) && bakery1.location.equals(bakery1.location)) {
                    System.out.println("Both aare same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 5;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", location=" + location + ", establishedYear=" + establishedYear + "]";
    }
}
