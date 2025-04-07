package com.xworkz.vacation.internal;

public class College extends Student{

    public void exam(Human human){

        human.think();

        if (human instanceof Student){

            Student student = (Student) human;
            student.eat();
            student.sleep();
            student.talk();
            student.walk();
            student.think();
        }
    }
}
