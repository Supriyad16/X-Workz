package com.xworkz.fest.work;

class Movies extends Weekend {
        Movies() {
        super();
        System.out.println("Movies class");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing on the weekend by watching movies.");
    }

    @Override
    public void goOut() {
        System.out.println("Going out to watch movies.");
    }

    @Override
    public void sleepMore() {
        System.out.println("Sleeping extra hours without watching movies.");
    }

    @Override
    public void playSports() {
        System.out.println("Playing sports during the weekend without watching movies.");
    }

    @Override
    public void readBook() {
        System.out.println("Reading a book on weekend.");
    }
}