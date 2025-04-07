package com.xworkz.vacation.internal;

public class Institution extends  Principal{

    public void rule(Head head){
        head.makesDecisions();

        if (head instanceof Principal){

            Principal principal = (Principal) head;
            principal.leadsOrganization();
            principal.makesDecisions();
            principal.managesOperations();
            principal.representsAuthority();
            principal.ensuresDiscipline();
        }
    }
}
