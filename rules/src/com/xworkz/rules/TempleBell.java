package com.xworkz.rules;

public class TempleBell implements Bell {

    @Override
    public void ring() {
        System.out.println("Ringing the temple bell");
    }

    @Override
    public void hang() {
        System.out.println("Hanging the temple bell");
    }

    @Override
    public void sound() {
        System.out.println("Sound of the temple bell");
    }

    public static void main(String[] args) {
        TempleBell bell = new TempleBell();
        bell.ring();
        bell.hang();
        bell.sound();
    }
}
