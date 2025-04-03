package com.xworkz.fest.work;

public class StorageRunner {
    public static void main(String[] args) {


        Storage storage = new Pendrive();
        storage.storeData();
        storage.retrieveData();
        storage.secureData();
        storage.manageSpace();
        storage.supportDifferentFormats();


        Pendrive pendrive = new Pendrive();
        pendrive.plugAndPlay();
        pendrive.transferFiles();
        pendrive.portableDevice();
        pendrive.supportUsbInterface();
        pendrive.provideBackup();
    }
}