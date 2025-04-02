package com.xworkz.fest.work;

public class ShapeRunner {


        public static void main(String[] args) {

            Shape shape = new Circle();
            shape.draw();
            shape.area();
            shape.perimeter();
            shape.resize();
            shape.displayColor();


            Circle circle = new Circle();
            circle.calculateDiameter();
            circle.calculateCircumference();
            circle.drawSmoothEdges();
            circle.rotate();
            circle.fillColor();
        }
    }


