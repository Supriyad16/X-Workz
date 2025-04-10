package com.xworkz.task.today;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("Milton", 1.0, true);
        System.out.println("Bottle " + bottle.toString());


        int code = bottle.hashCode();
        String value="design";
        System.out.println("Material:" + bottle.hashCode());
        System.out.println("Material:" + value.hashCode());
    }
}
