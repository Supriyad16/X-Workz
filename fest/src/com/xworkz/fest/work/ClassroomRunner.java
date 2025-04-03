package com.xworkz.fest.work;

public class ClassroomRunner {
    public static void main(String[] args) {

        Classroom classroom = new Bench();
        classroom.placeForLearning();
        classroom.hasBlackboardOrWhiteboard();
        classroom.containsBenchesAndChairs();
        classroom.hasTeachersAndStudents();
        classroom.providesEducation();


        Bench bench = new Bench();
        bench.usedForSitting();
        bench.madeOfWoodOrMetal();
        bench.accommodatesMultiplePeople();
        bench.foundInClassrooms();
        bench.providesComfort();
    }
}

