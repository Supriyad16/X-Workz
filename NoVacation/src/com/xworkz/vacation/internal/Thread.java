package com.xworkz.vacation.internal;

public class Thread extends Paper{

    public void handle(Kite kite){

        kite.fly();

        if (kite instanceof Paper){

            Paper paper = (Paper) kite;
            paper.festivals();
            paper.shapes();
            paper.string();
            paper.fly();
            paper.lightMaterial();
        }
    }
}
