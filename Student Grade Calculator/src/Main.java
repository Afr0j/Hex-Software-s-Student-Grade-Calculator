import com.manager.StudentManager;
import com.model.Student;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        System.out.println("Enter number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter name for student " + (i + 1) + ":");
            String name = scanner.nextLine();

            System.out.println("Enter student ID for student " + (i + 1) + ":");
            String studentID = scanner.nextLine();

            System.out.println("Enter number of grades for student " + (i + 1) + ":");
            int numGrades = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            int[] grades = new int[numGrades];
            for (int j = 0; j < numGrades; j++) {
                System.out.println("Enter grade " + (j + 1) + ":");
                grades[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline

            Student student = new Student(name, studentID, grades);
            manager.addStudent(student);
        }

        System.out.println("\nClass Information:");
        manager.displayAllStudents();
        System.out.println("Class Average Grade: " + manager.calculateClassAverage());
    }
}