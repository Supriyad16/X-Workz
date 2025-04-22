package com.xworkz.information.internal;

public class SpeakerImp implements Speaker {

    public SpeakerImp() {
        System.out.println("No-arg constructor of SpeakerImp");
    }

    @Override
    public void sound() {
        System.out.println("Speaker sounding in SpeakerImp");
    }
}
