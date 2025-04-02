package com.xworkz.fest.work;

public class StationeryRunner {
    public static void main(String[] args) {


        Stationery stationery = new Items();
        stationery.write();
        stationery.draw();
        stationery.store();
        stationery.organize();
        stationery.use();


        Items items = new Items();
        items.listItems();
        items.sharpen();
        items.erase();
        items.measure();
        items.staple();
    }
}
