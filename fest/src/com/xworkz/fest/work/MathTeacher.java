package com.xworkz.fest.work;

public class MathTeacher extends Teacher {

    MathTeacher() {
        super();
        System.out.println("A Math teacher is assigned");
    }

    @Override
    public void teach() {
        System.out.println("Teacher is teaching.");
    }

    @Override
    public void giveAssignment() {
        System.out.println("Teacher gives an assignment.");
    }

    @Override
    public void takeAttendance() {
        System.out.println("Math Teacher is taking attendance");
    }

    @Override
    public void evaluatePapers() {
        System.out.println("Math Teacher is evaluating exam papers");
    }

    @Override
    public void provideFeedback() {
        System.out.println("Math Teacher is providing feedback to students");
    }

}
