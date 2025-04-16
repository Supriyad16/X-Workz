package com.xworkz.rules;

public class MapPin implements Pin {

    @Override
    public void stick() {
        System.out.println("Sticking the map pin");
    }

    @Override
    public void remove() {
        System.out.println("Removing the map pin");
    }

    @Override
    public void bend() {
        System.out.println("Bending the map pin");
    }

    public static void main(String[] args) {
        MapPin pin = new MapPin();
        pin.stick();
        pin.remove();
        pin.bend();
    }
}
