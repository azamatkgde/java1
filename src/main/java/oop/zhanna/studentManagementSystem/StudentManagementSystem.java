package oop.zhanna.studentManagementSystem;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // Array to store up to 10 students
        Student[] students = new Student[10];
        int studentCount = 0;

        Scanner scanner = new Scanner(System.in);
        int choice;
        // Menu-driven program using do-while and switch

        do {
            // Show menu
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            // Switch case based on user input
            switch (choice) {
                case 1:
                    // Add student if space is available
                    if (studentCount < students.length) {
                        scanner.nextLine();// Clear input buffer
                        // Get student details
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter grade: ");
                        String grade = scanner.nextLine();
                        // Create and add student
                        students[studentCount] = new Student(name, age, id, grade);
                        studentCount++;
                        System.out.println("Student added.");
                    } else {
                        System.out.println("Student list is full.");
                    }
                    break;

                case 2:
                    // Show all students
                    if (studentCount == 0) {
                        System.out.println("No students found.");
                    } else {
                        for (int i = 0; i < studentCount; i++) {
                            students[i].displayStudentInfo();
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 3:
                    // Search student by ID
                    System.out.print("Enter student ID to search: ");
                    int searchId = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getId() == searchId) {
                            students[i].displayStudentInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    // Delete student by ID
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean deleted = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getId() == deleteId) {
                            //   // Shift students left to fill the gap
                            for (int j = i; j < studentCount - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            students[studentCount - 1] = null;
                            studentCount--;
                            System.out.println("Student deleted.");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    // Exit program
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);// Keep looping until user exits

        scanner.close();
    }
}

