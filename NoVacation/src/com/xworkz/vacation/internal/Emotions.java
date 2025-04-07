package com.xworkz.vacation.internal;

public class Emotions extends Smile{

    public void show(Emoji emoji){

        emoji.emotion();

        if(emoji instanceof Smile){

            Smile smile = (Smile) emoji;
            smile.communication();
            smile.differentTypes();
            smile.emotion();
            smile.expression();
            smile.universalLanguage();
            smile.usedInChats();
        }
    }
}
