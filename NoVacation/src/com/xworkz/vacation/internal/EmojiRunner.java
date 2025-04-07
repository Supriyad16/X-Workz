package com.xworkz.vacation.internal;

public class EmojiRunner {
    public static void main(String[] args) {

        Emoji emoji = new Smile();
        emoji.emotion();
        emoji.usedInChats();
        emoji.differentTypes();
        emoji.communication();
        emoji.universalLanguage();

        System.out.println("----");

        Smile smile = new Smile();
        smile.emotion();
        smile.universalLanguage();
        smile.usedInChats();
        smile.communication();
        smile.universalLanguage();

        System.out.println("----");

        Emotions emotions = new Emotions();
        emotions.communication();
        emotions.differentTypes();
        emotions.emotion();
        emotions.expression();
        emotions.universalLanguage();
        emotions.usedInChats();
    }
}