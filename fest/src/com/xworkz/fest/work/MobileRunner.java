package com.xworkz.fest.work;

public class MobileRunner {
    public static void main(String[] args) {

        Mobile mobile = new Charger();
        mobile.makeCall();
        mobile.sendText();
        mobile.browse();
        mobile.apps();
        mobile.playMusic();


        Charger charger = new Charger();
        charger.makeCall();
        charger.sendText();
        charger.browse();
        charger.apps();
        charger.playMusic();
    }
}
