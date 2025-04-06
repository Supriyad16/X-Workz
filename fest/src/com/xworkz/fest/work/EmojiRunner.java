package com.xworkz.fest.work;

public class EmojiRunner {
    public static void main(String[] args) {

        Emoji emoji = new Smile();
        emoji.emotion();
        emoji.usedInChats();
        emoji.differentTypes();
        emoji.communication();
        emoji.universalLanguage();

        Smile smile = new Smile();
        smile.emotion();
        smile.universalLanguage();
        smile.usedInChats();
        smile.communication();
        smile.universalLanguage();
    }
}