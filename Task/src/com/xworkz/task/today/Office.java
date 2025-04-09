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
    public String toString() {
        return "[name=" + name + ", city=" + city + ", employees=" + employees + "]";
    }
}
