package com.xworkz.information.internal;

public class IndianCricketTeamIccImpl implements Icc{

    public IndianCricketTeamIccImpl(){
        System.out.println("non arg const of IndianCricketTeamIccImpl");
    }


    @Override
    public void fairplay() {
        System.out.println("Running connects in IndianCricketTeamIccImpl");
    }
}
