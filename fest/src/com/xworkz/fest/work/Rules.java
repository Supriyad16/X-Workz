package com.xworkz.fest.work;

public class Rules extends Traffic {

    Rules(){
        super();
        System.out.println("Follow rules");
    }

    @Override
    public void right(){
        System.out.println("Correct rules");
    }

    @Override
    public void wrong(){
        System.out.println("Incorrect rules");
    }

    @Override
    public void follow(){
        System.out.println("Follow rules.");
    }

    @Override
    public void fine(){
        System.out.println("Pay fine if not follow the rules.");
    }

    @Override
    public void police(){
        System.out.println("Give amount to the police.");
    }

}