package com.xworkz.fest.work;

public class JobRunner {
    public static void main(String[] args) {

        Job job = new Engineer();
        job.writeCode();
        job.debug();
        job.testSoftware();
        job.deployApplication();
        job.collaborateWithTeam();

        Engineer engineer = new Engineer();
        engineer.writeCode();
        engineer.debug();
        engineer.testSoftware();
        engineer.deployApplication();
        engineer.collaborateWithTeam();
    }
}
