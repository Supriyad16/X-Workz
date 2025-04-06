package com.xworkz.fest.work;

public class SocialMediaRunner {

    public static void main(String[] args) {

        SocialMedia socialMedia = new Addict();
        socialMedia.createAccount();
        socialMedia.followPeople();
        socialMedia.likePosts();
        socialMedia.sendMessage();
        socialMedia.postContent();

        Addict addict = new Addict();
        addict.createAccount();
        addict.followPeople();
        addict.likePosts();
        addict.sendMessage();
        addict.postContent();

    }
}