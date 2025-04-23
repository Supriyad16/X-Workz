package com.xworkz.Thursday;

public class Ecapsulation {

    private String name="Supriya";
    private int age;

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return  age;

    }

    public void setAge(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        Ecapsulation ecapsulation = new Ecapsulation();
        ecapsulation.setName("");
        ecapsulation.setAge(20);

        ecapsulation.getName();
        ecapsulation.getAge();

        System.out.println("Name: "+ ecapsulation.getName() + "Age: "+ ecapsulation.getAge());
    }
}


