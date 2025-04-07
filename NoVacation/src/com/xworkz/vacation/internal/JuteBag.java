package com.xworkz.vacation.internal;

public class JuteBag extends Rope{

    public void strong(Jute jute){

        jute.bags();

        if(jute instanceof Rope){

            Rope rope = (Rope) jute;
            rope.bags();
            rope.biodegradable();
            rope.naturalFiber();
            rope.strongAndDurable();
            rope.textile();
            rope.carry();

        }
    }
}
