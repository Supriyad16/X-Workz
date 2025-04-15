package com.xworkz.realworld.examples;

public class Sports extends Cricket{

    @Override
    public void score(){
        System.out.println("The score is more to chase..!");
    }

    @Override
    public void match(){
        System.out.println("The has been held at Narendra Modi Staduim");
    }

    public static void main(String[] args) {
        Cricket cricket = new Sports();
        cricket.match();
        cricket.score();
    }
}
