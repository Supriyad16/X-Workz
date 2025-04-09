package com.xworkz.task.today;

public class Mall {

    private String name;
    private int numberOfShops;
    private String city;

    public Mall(String name, int numberOfShops, String city) {
        this.name = name;
        this.numberOfShops = numberOfShops;
        this.city = city;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", numberOfShops=" + numberOfShops + ", city=" + city + "]";
    }
}
