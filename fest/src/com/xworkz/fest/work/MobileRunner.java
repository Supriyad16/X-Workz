package com.xworkz.fest.work;

public class MobileRunner {
    public static void main(String[] args) {

        Mobile mobile = new Charger();
        mobile.makeCall();
        mobile.sendText();
        mobile.browseInternet();
        mobile.takePhoto();
        mobile.playMusic();


        Charger charger = new Charger();
        charger.connectToMobile();
        charger.supplyPower();
        charger.fastCharging();
        charger.stopCharging();
        charger.checkBatteryStatus();
    }
}
