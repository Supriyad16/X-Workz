package com.xworkz.task.today;

public class Theater {

    private String name;
    private int capacity;
    private String location;

    public Theater(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Theater theater = this;
                Theater theater1 = (Theater) obj;
                if (theater1.name.equals(theater1.name) && theater1.capacity==theater1.capacity) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 90;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", capacity=" + capacity + ", location=" + location + "]";
    }
}
