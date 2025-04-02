package com.xworkz.fest.work;

public class TeacherRunner {
    public static void main(String[] args) {

        Teacher teacher = new MathTeacher();
        teacher.teach();
        teacher.giveAssignment();
        teacher.takeAttendance();
        teacher.evaluatePapers();
        teacher.provideFeedback();



        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.solveEquations();
        mathTeacher.teachAlgebra();
        mathTeacher.conductMathQuiz();
        mathTeacher.explainGeometry();
        mathTeacher.checkHomework();
    }
}
