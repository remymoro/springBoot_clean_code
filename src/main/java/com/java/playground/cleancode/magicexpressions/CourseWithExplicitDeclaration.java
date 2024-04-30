package com.java.playground.cleancode.magicexpressions;

public class CourseWithExplicitDeclaration {
    private static final int MAX_STUDENTS = 30;  // Déclaration explicite de la constante
    private String courseName;
    private int numberOfStudents;

    // Constructeur initialise le nom du cours et le nombre d'étudiants à zéro
    public CourseWithExplicitDeclaration(String courseName) {
        this.courseName = courseName;
        this.numberOfStudents = 0;
    }

    // Inscription d'un étudiant dans le cours
    public void enrollStudent() {
        if (numberOfStudents < MAX_STUDENTS) {  // Utilisation de la constante explicite
            numberOfStudents++;
            System.out.println("Student enrolled in " + courseName);
        } else {
            System.out.println("Sorry, the course is full.");
        }
    }
}
