package com.xworkz.vacation.internal;

public class HeadRunner {
    public static void main(String[] args) {

        Head head = new Principal();
        head.leadsOrganization();
        head.makesDecisions();
        head.managesOperations();
        head.representsAuthority();
        head.ensuresDiscipline();

        Principal principal = new Principal();
        principal.leadsOrganization();
        principal.makesDecisions();
        principal.managesOperations();
        principal.representsAuthority();
        principal.ensuresDiscipline();

        Institution institution = new Institution();
        institution.leadsOrganization();
        institution.makesDecisions();
        institution.managesOperations();
        institution.representsAuthority();
        institution.ensuresDiscipline();
    }
}
