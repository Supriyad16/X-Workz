package com.xworkz.vacation.internal;

class Dates extends Calendar {
    Dates() {
        super();
        System.out.println("Dates class");
    }

    @Override
    public void month() {
        System.out.println("Displays the current month.");
    }

    @Override
    public void year() {
        System.out.println("Displays the current year.");
    }

    @Override
    public void holiday() {
        System.out.println("Marking a holiday date.");
    }

    @Override
    public void leapYear() {
        System.out.println("This year is a leap year.");
    }

    @Override
    public void weekDays() {
        System.out.println("Monday to friday are weekdays.");
    }

    public void weekend(){
        System.out.println("Saturday and Sunday are weekends.");
    }
}