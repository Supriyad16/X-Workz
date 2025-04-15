package com.xworkz.realworld.examples;

public abstract class Building {

    String name;
    int builtYear;
    String area;

    public void Building(String name, int builtYear, String area) {
        this.name = name;
        this.builtYear=builtYear;
        this.area=area;

    }
}

//An abstract class with three variables and declare a const to init 3 variables