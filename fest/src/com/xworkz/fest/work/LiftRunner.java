package com.xworkz.fest.work;


public class LiftRunner {
    public static void main(String[] args) {

        Lift lift = new Travel();
        lift.moveUp();
        lift.moveDown();
        lift.stop();
        lift.carryPeople();
        lift.indicateDirection();


        Travel travel = new Travel();
        travel.startJourney();
        travel.reachDestination();
        travel.exploreNewPlaces();
        travel.requireTransport();
        travel.createMemories();
    }
}
