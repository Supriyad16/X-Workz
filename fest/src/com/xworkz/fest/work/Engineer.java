package com.xworkz.fest.work;

public class Engineer extends Job {

    Engineer() {
        super();
        System.out.println("SoftwareEngineer class");
    }

    @Override
    public void writeCode() {
        System.out.println("Software engineers write code.");
    }

    @Override
    public void debug() {
        System.out.println("Software engineers debugs the code.");
    }

    @Override
    public void testSoftware() {
        System.out.println("Software engineers tests the code.");
    }

    @Override
    public void deployApplication() {
        System.out.println("Software engineers deploying the application");
    }

    @Override
    public void collaborateWithTeam() {
        System.out.println("Software engineers Collaborating with team members");
    }
}
