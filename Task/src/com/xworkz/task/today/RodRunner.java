package com.xworkz.task.today;

public class RodRunner {

    public static void main(String[] args) {
        Rod rod = new Rod("Iron", 2.5, 1.2);
        System.out.println("Rod " + rod.toString());

        int code = rod.hashCode();
        String value="pole";
        System.out.println("Weight:" + rod.hashCode());
        System.out.println("Weight:" + value.hashCode());
    }
}
