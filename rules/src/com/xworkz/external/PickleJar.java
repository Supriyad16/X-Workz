package com.xworkz.external;

import com.xworkz.rules.Jar;

public class PickleJar implements Jar {

    @Override
    public void open() {
        System.out.println("Opening the pickle jar");
    }

    @Override
    public void store() {
        System.out.println("Storing pickles in the jar");
    }

    @Override
    public void close() {
        System.out.println("Closing the pickle jar");
    }

    @Override
    public void container(){
        System.out.println("container stores pickle");
    }

    public static void main(String[] args) {
        PickleJar pickleJar = new PickleJar();
        pickleJar.open();
        pickleJar.store();
        pickleJar.close();
        pickleJar.container();
    }
}
