package com.xworkz.fest.work;

public class OfficeRunner {
    public static void main(String[] args) {

        Office office = new Room();
        office.work();
        office.conductMeetings();
        office.useComputers();
        office.printDocuments();
        office.takeBreaks();


        Room room = new Room();
        room.openDoor();
        room.closeDoor();
        room.turnOnLights();
        room.arrangeFurniture();
        room.cleanRoom();
    }
}
