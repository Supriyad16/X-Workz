package com.xworkz.poster.singlelevel;

    public class Rectangle extends Shape {

        public Rectangle(String color, int vertex) {
            super(color, vertex);
        }

        public void area() {
            System.out.println("The area of the rectangle is length cross breadth");
        }

        public static void main(String[] arguments) {
            Rectangle rectangle = new Rectangle("Purple", 4);
            System.out.println("Colour: "+rectangle.color+ ","+" Vertex: "+ rectangle.vertex);
            rectangle.display();
            rectangle.area();
        }
    }
