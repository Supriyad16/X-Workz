package com.xworkz.vacation.internal;

public class Joy extends Festival {

    Joy(){
        super();
        System.out.println("Joyous festival");
    }

    @Override
    public void happy() {
        System.out.println("Enjoy the festival happily.");
    }

    @Override
    public void sweets(){
        System.out.println("Sweets are made with love.");
    }

    @Override
    public void food(){
        System.out.println("varieties of foods are made in festivals.");
    }

    @Override
    public void clothes(){
        System.out.println("wear new clothes on festivals.");
    }

    @Override
    public void share(){
        System.out.println("share food to others who are in need.");
    }

    public void play(){
        System.out.println("share food to others who are in need.");
    }
}