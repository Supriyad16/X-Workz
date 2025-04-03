package com.xworkz.fest.work;

public class RoadRunner {
    public static void main(String[] args) {

        Road road = new Footpath();
        road.usedForVehicles();
        road.connectsPlaces();
        road.madeOfDifferentMaterials();
        road.haveTrafficRules();
        road.maintainedByGovernment();


        Footpath footpath = new Footpath();
        footpath.usedByPedestrians();
        footpath.provideSafety();
        footpath.madeOfConcrete();
        footpath.haveStreetVendors();
        footpath.foundAlongRoads();
    }
}
