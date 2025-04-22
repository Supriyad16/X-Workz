package com.xworkz.information.runner;


import com.xworkz.information.external.ConnectorUser;
import com.xworkz.information.internal.Connector;
import com.xworkz.information.internal.Connectorimp;

public class ConnectorRunner {

    public static void main(String[] args) {

        Connector connector = new Connectorimp();

        ConnectorUser connectorUser = new ConnectorUser(connector);
        connectorUser.Execute();
    }
}