package com.xworkz.vacation.internal;

public class JuteRunner {
    public static void main(String[] args) {

        Jute jute = new Rope();
        jute.naturalFiber();
        jute.biodegradable();
        jute.bags();
        jute.strongAndDurable();
        jute.textile();

        Rope rope = new Rope();
        rope.naturalFiber();
        rope.biodegradable();
        rope.bags();
        rope.strongAndDurable();
        rope.textile();
        rope.carry();

        JuteBag juteBag = new JuteBag();
        juteBag.bags();
        juteBag.biodegradable();
        juteBag.naturalFiber();
        juteBag.strongAndDurable();
        juteBag.textile();
        juteBag.carry();

    }

}
