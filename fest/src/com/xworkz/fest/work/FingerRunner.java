package com.xworkz.fest.work;

public class FingerRunner {
    public static void main(String[] args) {

        Finger finger = new Nails();
        finger.hold();
        finger.touch();
        finger.type();
        finger.write();
        finger.gesture();

        Nails nails = new Nails();
        nails.hold();
        nails.touch();
        nails.type();
        nails.write();
        nails.gesture();
    }

}
