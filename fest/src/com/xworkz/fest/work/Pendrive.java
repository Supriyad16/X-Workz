package com.xworkz.fest.work;

class Pendrive extends Storage {
    Pendrive() {
        super();
        System.out.println("Pendrive class");
    }

    @Override
    public void store() {
        System.out.println("Pendrive is used to store data.");
    }

    @Override
    public void retrieve() {
        System.out.println("Pendrive allows retrieval of data.");
    }

    @Override
    public void secure() {
        System.out.println("Pendrive provides data security.");
    }

    @Override
    public void manageSpace() {
        System.out.println("Pendrive manages available space efficiently.");
    }

    @Override
    public void supportDifferentFormats() {
        System.out.println("Pendrive supports multiple file formats.");
    }

}