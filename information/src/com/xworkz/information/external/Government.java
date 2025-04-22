package com.xworkz.information.external;

import com.xworkz.information.internal.Constitution;

public class Government {

    private Constitution constitution;

    public Government(Constitution constitution){
        this.constitution=constitution;
        System.out.println("arg const of Government");
    }

    public void rule(){
        if(this.constitution!=null){
            this.constitution.followLaws();
        }

        else{
            System.out.println("Constitution is null");
        }
    }
}
