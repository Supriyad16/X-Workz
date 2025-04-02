package com.xworkz.fest.work;

public class JobRunner {
    public static void main(String[] args) {

        Job job = new Engineer();
        job.work();
        job.attendMeetings();
        job.receiveSalary();
        job.getPromotion();
        job.takeLeave();

        Engineer engineer = new Engineer();
        engineer.writeCode();
        engineer.debug();
        engineer.testSoftware();
        engineer.deployApplication();
        engineer.collaborateWithTeam();
    }
}
