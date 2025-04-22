package com.xworkz.information.internal;

public class MusicianImp implements Musician {

    public MusicianImp() {
        System.out.println("No-arg constructor of MusicianImp");
    }

    @Override
    public void perform() {
        System.out.println("Performing music in MusicianImp");
    }
}
