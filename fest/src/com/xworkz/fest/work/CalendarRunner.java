package com.xworkz.fest.work;

public class CalendarRunner {
    public static void main(String[] args) {

        Calendar calendar = new Dates();
        calendar.showMonth();
        calendar.showYear();
        calendar.markHoliday();
        calendar.checkLeapYear();
        calendar.displayWeekDays();


        Dates dates = new Dates();
        dates.showCurrentDate();
        dates.addEvent();
        dates.checkWeekend();
        dates.countDaysBetween();
        dates.setReminder();
    }
}


