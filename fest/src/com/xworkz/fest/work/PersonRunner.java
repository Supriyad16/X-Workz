package com.xworkz.fest.work;

public class PersonRunner {


    public static void main(String[] args) {

        Human human = new Student();
        human.eat();
        human.sleep();
        human.walk();
        human.talk();
        human.think();



        Student student = new Student();
        student.study();
        student.attendClasses();
        student.doHomework();
        student.giveExams();
        student.participateInActivities();
    }
}

