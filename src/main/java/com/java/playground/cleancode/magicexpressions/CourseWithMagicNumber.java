package com.java.playground.cleancode.magicexpressions;

public class CourseWithMagicNumber {
    private String courseName;
    private int numberOfStudents;

    // Constructeur initialise le nom du cours et le nombre d'étudiants à zéro
    public CourseWithMagicNumber(String courseName) {
        this.courseName = courseName;
        this.numberOfStudents = 0;
    }

    // Inscription d'un étudiant dans le cours
    public void enrollStudent() {
        if (numberOfStudents < 30) {  // 30 est un "magic number"
            numberOfStudents++;
            System.out.println("Student enrolled in " + courseName);
        } else {
            System.out.println("Sorry, the course is full.");
        }
    }
}
