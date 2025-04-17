package com.xworkz.external;

import com.xworkz.rules.Bell;

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

    @Override
    public void inform(){
        System.out.println("Inform the owner");
    }
    public static void main(String[] args) {
        TempleBell templeBell = new TempleBell();
        templeBell.ring();
        templeBell.hang();
        templeBell.sound();
        templeBell.inform();
    }
}
