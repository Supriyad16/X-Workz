package com.xworkz.fest.work;


public class CampusRunner {
    public static void main(String[] args) {

        Campus campus = new Placement();
        campus.conductClasses();
        campus.provideFacilities();
        campus.organizeEvents();
        campus.encourageResearch();
        campus.offerInternships();


        Placement placement = new Placement();
        placement.conductInterviews();
        placement.inviteCompanies();
        placement.provideTraining();
        placement.assistInResumeBuilding();
        placement.ensureJobOpportunities();
    }
}
