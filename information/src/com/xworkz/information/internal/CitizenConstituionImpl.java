package com.xworkz.information.internal;

public class CitizenConstituionImpl implements Constitution{

    public CitizenConstituionImpl(){
        System.out.println("no arg const of CitizenConstituionImpl");
    }

    @Override
    public void followLaws() {
        System.out.println("Running folloelaws in CitizenConstituionImpl");

    }
}
