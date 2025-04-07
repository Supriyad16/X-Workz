package com.xworkz.vacation.internal;

public class Write extends  Stories{

    public void poem(Author author){

        author.writeBook();

        if(author instanceof Stories){

            Stories stories = (Stories) author;
            stories.bookLaunch();
            stories.distribute();
            stories.editContent();
            stories.giveInterview();
            stories.publishBook();
            stories.writeBook();
        }


    }
}
