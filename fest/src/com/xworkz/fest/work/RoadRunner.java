package com.xworkz.fest.work;

public class RoadRunner {
    public static void main(String[] args) {

        Road road = new Footpath();
        road.transportation();
        road.connectsPlaces();
        road.walk();
        road.traffic();
        road.construct();


        Footpath footpath = new Footpath();
        footpath.traffic();
        footpath.transportation();
        footpath.walk();
        footpath.construct();
        footpath.connectsPlaces();
    }
}
