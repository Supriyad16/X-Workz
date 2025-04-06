package com.xworkz.fest.work;

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
    }
}

