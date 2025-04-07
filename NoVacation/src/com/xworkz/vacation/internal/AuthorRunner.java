package com.xworkz.vacation.internal;

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


        Write write = new Write();
        write.bookLaunch();
        write.distribute();
        write.editContent();
        write.giveInterview();
        write.publishBook();
        write.writeBook();
    }
}