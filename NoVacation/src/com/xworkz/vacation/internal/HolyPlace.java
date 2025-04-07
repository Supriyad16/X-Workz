package com.xworkz.vacation.internal;

public class HolyPlace extends Priest{

    public void pray(Ghost ghost){

        ghost.disappear();

        if (ghost instanceof Priest){

            Priest priest = (Priest) ghost;
            priest.haunt();
            priest.disappear();
            priest.weirdNoises();
            priest.magic();
            priest.floatAround();
        }
    }
}
