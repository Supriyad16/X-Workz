package com.xworkz.information.external;

import com.xworkz.information.internal.Connector;

public class ConnectorUser {

    private Connector connector;

    public ConnectorUser(Connector connector){
        this.connector=connector;

        System.out.println("Running connector in Connectoruser");
    }

    public  void Execute(){
        if(this.connector!=null){
            this.connector.connects();
        }

        else{
            System.out.println("connector is null");
        }
    }

}
