package practice2;

import practice2.controller.EmployeeManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();
        byte choice;
        while (true) {
            System.out.println("1.Add employees");
            System.out.println("2.Display employees");
            System.out.println("3. Display employee by id");
            System.out.println("4. Update employee by index");
            System.out.println("5. Delete employee by index");
            System.out.println("6. Display employee by name");
            System.out.println("7. Exit");

            System.out.println("Enter your choice: ");
            choice = Byte.parseByte(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeManager.addEmployees(scanner);
                    break;
                case 2:
                    employeeManager.displayEmployees();
                    break;
                case 3:
                    employeeManager.displayEmployeeById(scanner);
                    break;
                case 4:
                    employeeManager.updateEmployee(scanner);
                    break;
                case 5:
                    employeeManager.deleteEmployee(scanner);
                    break;
                case 6:
                    employeeManager.displayEmployeeByName(scanner);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
