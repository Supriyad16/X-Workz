package com.xworkz.external;

import com.xworkz.rules.Pin;

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

    @Override
    public void pinch(){
        System.out.println("mark through map pin");
    }

    public static void main(String[] args) {
        MapPin mapPin = new MapPin();
        mapPin.stick();
        mapPin.remove();
        mapPin.bend();
        mapPin.pinch();
    }
}
