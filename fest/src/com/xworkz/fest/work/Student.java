package com.xworkz.fest.work;


    public class Student extends Human {

        Student() {
            super();
            System.out.println("Student class");
        }

        @Override
        public void eat() {
            System.out.println("Student eats food");
        }

        @Override
        public void sleep() {
            System.out.println("Student sleeps");
        }

        @Override
        public void walk() {
            System.out.println("Student walks");
        }

        @Override
        public void talk() {
            System.out.println("Student talks");
        }

        @Override
        public void think() {
            System.out.println("Student thinks");
        }
    }


