package com.xworkz.task.today;

public class Office {
    private String name;
    private String city;
    private int employees;

    public Office(String name, String city, int employees) {
        this.name = name;
        this.city = city;
        this.employees = employees;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Office office = this;
                Office office1 = (Office) obj;
                if (office1.name.equals(office.name) && office1.employees==office.employees) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 58;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", city=" + city + ", employees=" + employees + "]";
    }
}
