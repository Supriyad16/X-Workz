package com.xworkz.fest.work;

public class AuthorRunner {
    public static void main(String[] args) {

        Author author = new Stories();
        author.writeBook();
        author.editContent();
        author.publishBook();
        author.giveInterview();
        author.bookLaunch();


        Stories story = new Stories();
        story.writeBook();
        story.editContent();
        story.publishBook();
        story.giveInterview();
        story.bookLaunch();
    }
}