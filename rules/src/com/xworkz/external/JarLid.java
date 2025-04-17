package com.xworkz.external;

import com.xworkz.rules.Lid;

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

    @Override
    public void close(){
        System.out.println("Close jar lid");
    }

    public static void main(String[] args) {
        JarLid jarLid = new JarLid();
        jarLid.cover();
        jarLid.open();
        jarLid.seal();
        jarLid.close();
    }
}
