package com.manager;

import com.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to calculate the class average
    public double calculateClassAverage() {
        if (students.isEmpty()) return 0;

        double totalSum = 0;
        int totalGrades = 0;

        for (Student student : students) {
            totalSum += student.calculateAverage();
            totalGrades += student.getGrades().length;
        }

        return totalSum / students.size();
    }

    // Method to display all students' information
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Student ID: " + student.getStudentID());
            student.displayGrades();
            System.out.println("Average Grade: " + student.calculateAverage());
            System.out.println("Status: " + (student.hasPassed() ? "Passed" : "Failed"));
            System.out.println();
        }
    }

}
