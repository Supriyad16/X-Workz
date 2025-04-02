package com.xworkz.fest.work;

public class CompanyRunner {

    public static void main(String[] args) {

        Company company = new Experience();

        company.benefits();
        company.meeting();
        company.projects();
        company.salary();
        company.work();

        Experience experience = new Experience();

        experience.challenges();
        experience.learning();
        experience.promotions();
        experience.networking();
        experience.teamwork();
    }
}
