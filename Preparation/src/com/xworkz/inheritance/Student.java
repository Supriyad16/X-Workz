package com.xworkz.inheritance;

public class Student {

    private String name;
    private int age;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("abc");
        student.getName();
        System.out.println(student.getName());
    }
}