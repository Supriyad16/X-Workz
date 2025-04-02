package com.xworkz.fest.work;

public class GhostRunner {
    public static void main(String[] args) {

        Ghost ghost = new Priest();
        ghost.haunt();
        ghost.disappear();
        ghost.makeWeirdNoises();
        ghost.possessObjects();
        ghost.floatAround();



        Priest priest = new Priest();
        priest.throwObjects();
        priest.screamLoudly();
        priest.messWithElectronics();
        priest.openDoorsRandomly();
        priest.terrorizePeople();
    }
}