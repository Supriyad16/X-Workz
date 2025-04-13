package com.xworkz.task.today;

public class PinsRunner {
    public static void main(String[] args) {
        Pins pins = new Pins("Clevis Pins", "steel", true);
        System.out.println("Pins " + pins.toString());

        int code = pins.hashCode();
        String value="Pinch";
        System.out.println("Object:" + pins.hashCode());
        System.out.println("Object:" + value.hashCode());

        Pins pins1 = new Pins("Egyptian", "Iron", false);
        boolean equal= pins1.equals(pins1);
        System.out.println("equal :"+ equal);
    }
}
