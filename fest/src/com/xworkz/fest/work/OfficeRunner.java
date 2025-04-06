package com.xworkz.fest.work;

public class OfficeRunner {
    public static void main(String[] args) {

        Office office = new Room();
        office.work();
        office.meetings();
        office.computers();
        office.documents();
        office.breaks();


        Room room = new Room();
        room.work();
        room.meetings();
        room.computers();
        room.documents();
        room.breaks();
    }

}