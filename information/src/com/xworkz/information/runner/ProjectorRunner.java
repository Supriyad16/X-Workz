package com.xworkz.information.runner;

import com.xworkz.information.internal.Projector;
import com.xworkz.information.internal.ProjectorImp;
import com.xworkz.information.external.Epson;

public class ProjectorRunner {

    public static void main(String[] args) {
        Projector projector = new ProjectorImp();
        Epson epson = new Epson(projector);
        epson.startProjection();
    }
}
