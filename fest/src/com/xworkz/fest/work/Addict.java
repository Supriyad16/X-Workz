package com.xworkz.fest.work;

class Addict extends SocialMedia {
    Addict() {
        super(); // Calls the parent class constructor
        System.out.println("Addict class");
    }

    @Override
    public void createAccount() {
        System.out.println("Create another account.");
    }

    @Override

    public void postContent() {
        System.out.println("never post anything.");
    }

    @Override

    public void likePosts() {
        System.out.println("Like the video.");
    }

    @Override
    public void followPeople() {
        System.out.println("Following good people.");
    }

    @Override
    public void sendMessage() {
        System.out.println("never send messages.");
    }
}