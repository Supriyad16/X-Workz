package com.xworkz.fest.work;

class Dates extends Calendar {
    Dates() {
        super();
        System.out.println("Dates class");
    }

    public void showCurrentDate() {
        System.out.println("Showing today's date.");
    }

    public void addEvent() {
        System.out.println("Adding an event to a specific date.");
    }

    public void checkWeekend() {
        System.out.println("Checking if the selected date is a weekend.");
    }

    public void countDaysBetween() {
        System.out.println("Calculating the number of days between two dates.");
    }

    public void setReminder() {
        System.out.println("Setting a reminder for a specific date.");
    }
}


