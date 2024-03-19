package practice;

import practice.controller.StudentManager;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert number of students: ");
            StudentManager studentManager = new StudentManager();
            while (true) {
                System.out.println("1. Add student");
                System.out.println("2. Display students");
                System.out.println("3. Delete student");
                System.out.println("4. Update student");
                System.out.println("5. Exit");
                System.out.println("Choose: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        studentManager.addStudent(scanner);
                        break;
                    case 2:
                        studentManager.displayStudents();
                        break;
                    case 3:
                        System.out.println("Insert index to delete: ");
                        studentManager.removeStudent(Integer.parseInt(scanner.nextLine())- 1);
                        break;
                    case 4:
                        System.out.println("Insert index to update: ");
                        studentManager.updateStudent(Integer.parseInt(scanner.nextLine()) - 1, scanner);
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }

}
