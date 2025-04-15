package com.xworkz.poster.multilevel;

public class Music extends Guitar{

    public Music(String type, String brand){
        super(type, brand);

    }

    public void vibrate(){
        System.out.println("Music comes from vibration");
    }
}
