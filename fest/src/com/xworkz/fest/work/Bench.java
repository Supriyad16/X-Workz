package com.xworkz.fest.work;

class Bench extends Classroom {
    Bench() {
        super();
        System.out.println("Bench class");
    }

    @Override
    public void learning() {
        System.out.println("Learning hub.");
    }

    @Override
    public void blackboard() {
        System.out.println("Now a days they use projector.");
    }

    @Override
    public void benches() {
        System.out.println("Classroom contains benches for students.");
    }

    @Override
    public void teacher() {
        System.out.println("Classroom has teachers .");
    }

    @Override
    public void student() {
        System.out.println("Classroom provides education and knowledge for students.");
    }
}