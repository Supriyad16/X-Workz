package com.xworkz.task.today;

public class PinsRunner {
    public static void main(String[] args) {
        Pins pins = new Pins("DefaultType", "DefaultBrand", true);
        System.out.println("Pins " + pins.toString());

        int code = pins.hashCode();
        String value="Pinch";
        System.out.println("Object:" + pins.hashCode());
        System.out.println("Object:" + value.hashCode());
    }
}
