package com.xworkz.vacation.internal;

public class Peacock extends Bird{

    public void nationalBird(Animal animal){
        animal.eat();

        if(animal instanceof Bird){

            Bird bird = (Bird) animal;
            bird.grow();
            bird.breathe();
            bird.fly();
            bird.move();
            bird.eat();
            bird.sleep();
        }
    }
}
