package com.model;

public class Student {
    private String name;
    private String studentID;
    private int[] grades;

    // Constructor
    public Student(String name, String studentID, int[] grades) {
        this.name = name;
        this.studentID = studentID;
        this.grades = grades;
    }

    // Method to calculate the average grade
    public double calculateAverage() {
        if (grades == null || grades.length == 0) return 0;

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Method to display individual grades
    public void displayGrades() {
        System.out.println("Grades for " + name + " (ID: " + studentID + "):");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

    // Method to determine if the student has passed or failed
    public boolean hasPassed() {
        double average = calculateAverage();
        return average >= 60; // Assuming passing grade is 60 or above
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public int[] getGrades() {
        return grades;
    }
}

