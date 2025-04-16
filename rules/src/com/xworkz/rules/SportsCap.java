package com.xworkz.rules;

public class SportsCap implements Cap {

    @Override
    public void wear() {
        System.out.println("Wearing the sports cap");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting the sports cap");
    }

    @Override
    public void remove() {
        System.out.println("Removing the sports cap");
    }

    public static void main(String[] args) {
        SportsCap cap = new SportsCap();
        cap.wear();
        cap.adjust();
        cap.remove();
    }
}
