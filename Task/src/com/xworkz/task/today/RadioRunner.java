package com.xworkz.task.today;

public class RadioRunner {

    public static void main(String[] args) {
        Radio radio = new Radio("Philips", true, 108.0);
        System.out.println("Radio " + radio.toString());

        int code = radio.hashCode();
        String value="listen";
        System.out.println("Retro:" + radio.hashCode());
        System.out.println("Retro:" + value.hashCode());
    }
}
