package com.xworkz.fest.work;

public class AuthorRunner {
    public static void main(String[] args) {

        Author author = new Stories();
        author.writeBook();
        author.editContent();
        author.publishBook();
        author.giveInterview();
        author.bookLaunch();


        Stories stories = new Stories();
        stories.writeBook();
        stories.editContent();
        stories.publishBook();
        stories.giveInterview();
        stories.bookLaunch();
    }
}