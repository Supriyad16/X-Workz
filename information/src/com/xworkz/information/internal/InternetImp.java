package com.xworkz.information.internal;

public class InternetImp implements Internet {

    public InternetImp() {
        System.out.println("No-arg constructor of InternetImp");
    }

    @Override
    public void connect() {
        System.out.println("Running connect in InternetImp");
    }
}
