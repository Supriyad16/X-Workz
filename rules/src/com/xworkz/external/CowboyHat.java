package com.xworkz.external;

import com.xworkz.rules.Hat;

public class CowboyHat implements Hat {

    @Override
    public void wear() {
        System.out.println("Wearing the cowboy hat");
    }

    @Override
    public void remove() {
        System.out.println("Removing the cowboy hat");
    }

    @Override
    public void style() {
        System.out.println("Styling the cowboy hat");
    }

    @Override
    public void protect(){
        System.out.println("write on the bench");
    }

    public static void main(String[] args) {
        CowboyHat cowboyHat = new CowboyHat();
        cowboyHat.wear();
        cowboyHat.remove();
        cowboyHat.style();
        cowboyHat.protect();
    }
}
