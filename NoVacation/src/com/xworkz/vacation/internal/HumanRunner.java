package com.xworkz.vacation.internal;

public class HumanRunner {

    public static void main(String[] args) {

        Human human = new Student();
        human.eat();
        human.sleep();
        human.walk();
        human.talk();
        human.think();

        Student student = new Student();
        student.eat();
        student.sleep();
        student.talk();
        student.walk();
        student.think();

        College college = new College();
        college.eat();
        college.sleep();
        college.talk();
        college.walk();
        college.think();
    }
    }


