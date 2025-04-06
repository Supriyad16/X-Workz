package com.xworkz.fest.work;

public class StorageRunner {
    public static void main(String[] args) {


        Storage storage = new Pendrive();
        storage.secure();
        storage.retrieve();
        storage.store();
        storage.manageSpace();
        storage.supportDifferentFormats();


        Pendrive pendrive = new Pendrive();
        pendrive.secure();
        pendrive.retrieve();
        pendrive.store();
        pendrive.manageSpace();
        pendrive.supportDifferentFormats();
    }

}