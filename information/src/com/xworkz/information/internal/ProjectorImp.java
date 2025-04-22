package com.xworkz.information.internal;

public class ProjectorImp implements Projector {

    public ProjectorImp() {
        System.out.println("No-arg constructor of ProjectorImp");
    }

    @Override
    public void display() {
        System.out.println("Running display in ProjectorImp");
    }
}
