package com.xworkz.fest.work;

class Placement extends Campus {
    Placement() {
        super();
        System.out.println("Placement class");
    }

    @Override
    public void classes() {
        System.out.println("Campus conducts classes .");
    }

    @Override
    public void facilities() {
        System.out.println("Campus provides various facilities.");
    }

    @Override
    public void organizeEvents() {
        System.out.println("Campus organizes events.");
    }

    @Override
    public void research() {
        System.out.println("Campus encourages students to participate in activities.");
    }

    @Override
    public void internships() {
        System.out.println("Campus provides internship to students.");
    }
}


