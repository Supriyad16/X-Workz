package com.xworkz.rules;

public class JarLid implements Lid {

    @Override
    public void cover() {
        System.out.println("Covering the jar with the lid");
    }

    @Override
    public void open() {
        System.out.println("Opening the jar lid");
    }

    @Override
    public void seal() {
        System.out.println("Sealing the jar with the lid");
    }

    public static void main(String[] args) {
        JarLid lid = new JarLid();
        lid.cover();
        lid.open();
        lid.seal();
    }
}
