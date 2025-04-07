package com.xworkz.vacation.internal;

public class CalendarRunner {
    public static void main(String[] args) {

        Calendar calendar = new Dates();
        calendar.month();
        calendar.year();
        calendar.holiday();
        calendar.leapYear();
        calendar.weekDays();

        System.out.println("----");

        Dates dates = new Dates();
        dates.month();
        dates.year();
        dates.holiday();
        dates.leapYear();
        dates.weekDays();

        System.out.println("----");

        Stars stars = new Stars();
        stars.holiday();
        stars.weekend();
        stars.leapYear();
        stars.month();
        stars.weekDays();
        stars.month();
    }
}