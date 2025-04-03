package com.xworkz.fest.work;

public class AuthorRunner {
    public static void main(String[] args) {

        Author author = new Stories();
        author.writeBook();
        author.editContent();
        author.publishBook();
        author.giveInterview();
        author.attendBookLaunch();


        Stories story = new Stories();
        story.createPlot();
        story.writeShortStory();
        story.addCharacters();
        story.setStoryTheme();
        story.publishStory();
    }
}