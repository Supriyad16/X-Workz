package com.xworkz.fest.work;

public class Items extends Stationery {

    Items() {
        super();
        System.out.println("Items are part of stationery and used in daily tasks!");
    }

    public void listItems() {
        System.out.println("Common stationery items include pens, pencils, erasers, and rulers...");
    }

    public void sharpen() {
        System.out.println("Pencil needs sharpening to write properly...");
    }

    public void erase() {
        System.out.println("Erasers help remove mistakes...");
    }

    public void measure() {
        System.out.println("Rulers help in measuring...");
    }

    public void staple() {
        System.out.println("Staplers help in binding pages together...");
    }
}
