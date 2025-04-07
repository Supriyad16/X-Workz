package com.xworkz.vacation.internal;

class Stories extends Author {
    Stories() {
        super();
        System.out.println("Stories class");
    }

    @Override
    public void writeBook() {
        System.out.println("Author is writing a Stories book.");
    }

    @Override
    public void editContent() {
        System.out.println("Author is editing the Stories content.");
    }

    @Override
    public void publishBook() {
        System.out.println("Author is publishing Stories the book.");
    }

    @Override
    public void giveInterview() {
        System.out.println("Author is giving the interview.");
    }

    @Override
    public void bookLaunch() {
        System.out.println("Author is attending the event.");
    }

    public void distribute() {
        System.out.println("Book is distributed.");
    }
}