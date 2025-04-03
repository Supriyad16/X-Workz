package com.xworkz.fest.work;

class Room extends Office {
    Room() {
        super();
        System.out.println("Room class");
    }

    public void openDoor() {
        System.out.println("Opening the room door.");
    }

    public void closeDoor() {
        System.out.println("Closing the room door.");
    }

    public void turnOnLights() {
        System.out.println("Turning on the lights in the room.");
    }

    public void arrangeFurniture() {
        System.out.println("Arranging furniture in the room.");
    }

    public void cleanRoom() {
        System.out.println("Cleaning the room.");
    }
}