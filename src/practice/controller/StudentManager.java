package practice.controller;

import practice.model.Student;

import java.util.Scanner;

public class StudentManager {

    private String classroomId;
    private Student[] students = new Student[0];

    public StudentManager() {
    }

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Scanner scanner) {
        System.out.println("Number of student to add: ");
        Student[] oldStudents = students;
        students = new Student[oldStudents.length + Integer.parseInt(scanner.nextLine())];
        for (int i = 0; i < oldStudents.length; i++) {
            students[i] = oldStudents[i];
        }

        for (int i = oldStudents.length; i < students.length; i++) {
            System.out.println("Insert student id: ");
            String studentId = scanner.nextLine();
            System.out.println("Insert student name: ");
            String name = scanner.nextLine();
            System.out.println("Insert student age: ");
            byte age = Byte.parseByte(scanner.nextLine());
            System.out.println("Insert student score: ");
            float score = Float.parseFloat(scanner.nextLine());
            System.out.println("Insert student gender: ");
            boolean gender = Boolean.parseBoolean(scanner.nextLine());
            Student student = new Student(studentId, name, age, gender, score);
            students[i] = student;
        }

    }

    public void removeStudent(int index) {
        if (index < 0 || index >= students.length) {
            System.out.println("Invalid index");
            return;
        }
        Student[] studentsAfterDeleted = new Student[students.length - 1];
        for (int i = 0; i < index; i++) {
            studentsAfterDeleted[i] = students[i];
        }
        for (int i = index; i < studentsAfterDeleted.length; i++) {
            studentsAfterDeleted[i] = students[i + 1];
        }
        students = studentsAfterDeleted;
    }

    public void updateStudent(int index, Scanner scanner) {
        if (index < 0 || index >= students.length) {
            System.out.println("Invalid index");
            return;
        }

        System.out.println("Insert student id: ");
        String studentId = scanner.nextLine();
        System.out.println("Insert student name: ");
        String name = scanner.nextLine();
        System.out.println("Insert student age: ");
        byte age = Byte.parseByte(scanner.nextLine());
        System.out.println("Insert student score: ");
        float score = Float.parseFloat(scanner.nextLine());
        System.out.println("Insert student gender: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        Student student = new Student(studentId, name, age, gender, score);
        students[index] = student;

    }

    public void displayStudents() {
        System.out.println("------------------------------------------------");

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {

                System.out.printf("%d. Student id: %s, name: %s, age: %d, gender: %s, score: %.2f\n",
                        i + 1,
                        students[i].getStudentId(),
                        students[i].getName(),
                        students[i].getAge(),
                        students[i].getGender(), students[i].getScore());
            }
        }
        System.out.println("------------------------------------------------");

    }
}
