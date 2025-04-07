package com.xworkz.vacation.internal;

public class NailPolish extends Nails{

    public void colours(Finger finger){
        finger.gesture();

        if(finger instanceof Nails){

            Nails nails = (Nails) finger;
            nails.eat();
            nails.hold();
            nails.gesture();
            nails.touch();
            nails.type();
            nails.write();
        }
    }
}
