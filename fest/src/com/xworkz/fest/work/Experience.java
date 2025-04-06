package com.xworkz.fest.work;


public class Experience extends Company {

    Experience() {
        super();
        System.out.println("Gaining work experience");
    }

    @Override
    public void work() {
        System.out.println("Employees work daily for experience.");
    }

    @Override
    public void meeting() {
        System.out.println("Meetings are scheduled.");
    }

    @Override
    public void projects() {
        System.out.println("Done various projects.");
    }

    @Override
    public void salary() {
        System.out.println("Employees receive salaries.");
    }

    @Override
    public void benefits() {
        System.out.println("Company provides benefits.");
    }

}