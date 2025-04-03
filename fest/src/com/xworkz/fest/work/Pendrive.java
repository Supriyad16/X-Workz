package com.xworkz.fest.work;

class Pendrive extends Storage {
    Pendrive() {
        super();
        System.out.println("Pendrive class");
    }

    public void plugAndPlay() {
        System.out.println("Pendrive supports plug-and-play functionality.");
    }

    public void transferFiles() {
        System.out.println("Pendrive allows quick file transfer.");
    }

    public void portableDevice() {
        System.out.println("Pendrive is a portable storage device.");
    }

    public void supportUsbInterface() {
        System.out.println("Pendrive supports USB interfaces.");
    }

    public void provideBackup() {
        System.out.println("Pendrive can be used to backup important files.");
    }
}