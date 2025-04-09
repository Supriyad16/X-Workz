package com.xworkz.task.today;

public class Dress {

        private String material;
        private String color;
        private double price;

        public Dress(String material, String color, double price) {
            this.material = material;
            this.color = color;
            this.price = price;
        }

        @Override
        public String toString() {
            return "[material=" + material + ", color=" + color + ", price=" + price + "]";
        }
    }



