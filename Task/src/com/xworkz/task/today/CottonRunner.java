package com.xworkz.task.today;

public class CottonRunner {

    public static void main(String[] args) {
        Cotton cotton = new Cotton("Premium", 2.0, "Bandage");
        System.out.println("Cotton " + cotton.toString());

        int code = cotton.hashCode();
        String value="tree";
        System.out.println("Soft:" + cotton.hashCode());
        System.out.println("Soft:" + value.hashCode());
    }
}
