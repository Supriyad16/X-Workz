package com.xworkz.task.today;

public class HouseRunner {
    public static void main(String[] args) {
        House house = new House("Independent", 5, true);
        System.out.println("House " + house.toString());

        int code = house.hashCode();
        String value="home";
        System.out.println("Place:" + house.hashCode());
        System.out.println("Place:" + value.hashCode());
    }
}
