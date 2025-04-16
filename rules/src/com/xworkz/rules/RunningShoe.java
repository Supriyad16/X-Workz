package com.xworkz.rules;

public class RunningShoe implements Shoe {

    @Override
    public void wear() {
        System.out.println("Wearing the running shoes");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the running shoes");
    }

    @Override
    public void tie() {
        System.out.println("Tying the running shoes");
    }

    public static void main(String[] args) {
        RunningShoe shoe = new RunningShoe();
        shoe.wear();
        shoe.clean();
        shoe.tie();
    }
}
