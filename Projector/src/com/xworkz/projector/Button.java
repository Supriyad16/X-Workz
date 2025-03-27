package com.xworkz.projector;

public class Button {

        private String shape;
       private String material;

        Button(String shape, String material) {
            this.shape = shape;
            this.material = material;
        }

        void press() {
            System.out.println("Button " + material + " is pressed.");
        }
    }


