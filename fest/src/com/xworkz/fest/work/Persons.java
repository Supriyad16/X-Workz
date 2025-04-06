package com.xworkz.fest.work;

public class Persons extends Family {

    Persons() {
        super();
        System.out.println("Persons make up a family");
    }
    @Override
    public void surname() {
        System.out.println("Every family Persons has a surname");
    }

    @Override
    public void values() {
        System.out.println("Family Persons teaches moral values");
    }

    @Override
    public void traditions() {
        System.out.println("Family Persons follow traditions");
    }

    @Override
    public void bonding() {
        System.out.println("Strong bonding among family Persons");
    }

    @Override
    public void support() {
        System.out.println("Family Persons provides support in difficult times");
    }
}