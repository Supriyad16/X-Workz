package com.xworkz.vacation.internal;

public class Galaxy extends Martian {

    public void milkyWay(Alien alien){
        alien.abductHumans();

        if(alien instanceof Martian){

            Martian martian = (Martian) alien;
            martian.abductHumans();
            martian.bigEyes();
            martian.communicate();
            martian.eatRocks();
            martian.regenerate();
            martian.spaceship();
        }
    }

}
