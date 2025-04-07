package com.xworkz.vacation.internal;

public class Stars extends Dates{

    public void GoodDay(Calendar calendar){

        calendar.holiday();

        if(calendar instanceof Dates){

            Dates dates = (Dates) calendar;
            dates.holiday();
            dates.weekend();
            dates.leapYear();
            dates.month();
            dates.weekDays();
            dates.month();

        }

    }
}
