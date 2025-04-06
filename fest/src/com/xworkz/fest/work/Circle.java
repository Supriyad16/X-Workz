package com.xworkz.fest.work;

public class Circle extends Shape {

    Circle() {
        super();
        System.out.println("Circle class");
    }

    @Override
    public void draw() {
        System.out.println("Drawing the shape of circle.");
    }

    @Override
    public void area() {
        System.out.println("Calculating area of circle");
    }

    @Override
    public void perimeter() {
        System.out.println("Calculating perimeter of circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing the circle");
    }

    @Override
    public void dimension() {
        System.out.println("calculate the dimension of circle.");
    }
}


