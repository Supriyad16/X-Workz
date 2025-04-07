package com.xworkz.vacation.internal;

public class GhostRunner {
    public static void main(String[] args) {

        Ghost ghost = new Priest();
        ghost.haunt();
        ghost.disappear();
        ghost.weirdNoises();
        ghost.magic();
        ghost.floatAround();

        Priest priest = new Priest();
        priest.haunt();
        priest.disappear();
        priest.weirdNoises();
        priest.magic();
        priest.floatAround();

        HolyPlace holyPlace = new HolyPlace();
        holyPlace.haunt();
        holyPlace.disappear();
        holyPlace.weirdNoises();
        holyPlace.magic();
        holyPlace.floatAround();
    }
}