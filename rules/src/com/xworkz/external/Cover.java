package com.xworkz.external;

import com.xworkz.rules.Hat;
import com.xworkz.rules.Jar;

public class Cover implements Hat, Jar {

    @Override
    public void wear() {
        System.out.println("Wearing the hat");
    }

    @Override
    public void remove() {
        System.out.println("Removing the hat");
    }

    @Override
    public void style() {
        System.out.println("Adjusting the hat");
    }

    @Override
    public void open() {
        System.out.println("Opening the jar");
    }

    @Override
    public void close() {
        System.out.println("Closing the jar");
    }

    @Override
    public void store() {
        System.out.println("Storing things in the jar");
    }

    public static void main(String[] args) {
        Hat hat = new Cover();
        hat.wear();
        hat.remove();
        hat.style();

        Jar jar = new Cover();
        jar.open();
        jar.close();
        jar.store();
    }
}
