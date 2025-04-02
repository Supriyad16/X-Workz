package com.xworkz.fest.work;

public class Hacker extends Spy {

    Hacker() {
        super();
        System.out.println("A hacker has joined the mission!");
    }

    public void hackSecurity() {
        System.out.println("Hacker is breaking into security systems...");
    }

    public void stealData() {
        System.out.println("Hacker is stealing confidential data...");
    }

    public void writeVirus() {
        System.out.println("Hacker is creating a computer virus...");
    }

    public void eraseEvidence() {
        System.out.println("Hacker is erasing all traces...");
    }

    public void takeControl() {
        System.out.println("Hacker has taken full control of the system...");
    }
}
