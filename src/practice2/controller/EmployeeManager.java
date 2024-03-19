package practice2.controller;

import practice2.model.Employee;

import java.util.Scanner;

public class EmployeeManager {
    private Employee[] employees = new Employee[0];

    public EmployeeManager() {}

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public static Employee createEmployeeFromScanner(Scanner scanner) {
        System.out.println("Enter employee id: ");
        String employeeId = scanner.nextLine();
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter employee dob: ");
        String dob = scanner.nextLine();
        System.out.println("Enter employee address: ");
        String address = scanner.nextLine();
        System.out.println("Enter employee phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter employee base salary: ");
        int baseSalary = Integer.parseInt(scanner.nextLine());
        return new Employee(employeeId, name, dob, address, phoneNumber, baseSalary);
    }

    ;

    public void addEmployees(Scanner scanner) {
        System.out.println("Enter number of employees: ");
        byte n = Byte.parseByte(scanner.nextLine());
        Employee[] newEmployees = new Employee[employees.length + n];
        for (byte i = 0; i < employees.length; i++) {
            newEmployees[i] = employees[i];
        }
        for (byte i = (byte) employees.length; i < employees.length + n; i++) {
            newEmployees[i] = createEmployeeFromScanner(scanner);
        }
        employees = newEmployees;
    }

    public void displayEmployees() {
        System.out.println("-".repeat(50));
        System.out.println("List of employees: ");
        for (byte i = 0; i < employees.length; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            System.out.println(employees[i]);
        }
        System.out.println("-".repeat(50));
    }

    public void displayEmployeeById(Scanner scanner) {
        String employeeId = scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void displayEmployeeByName(Scanner scanner) {
        String name = scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void updateEmployee(Scanner sc) {
        byte index = (byte) (Byte.parseByte(sc.nextLine()) -1);
        if (index < 0 || index >= employees.length) {
            System.out.println("Invalid index!");
            return;
        }
        employees[index] = createEmployeeFromScanner(sc);
    }

    public void deleteEmployee(Scanner scanner) {
        byte index = (byte) (Byte.parseByte(scanner.nextLine()) -1);
        if (index < 0 || index >= employees.length) {
            System.out.println("Invalid index!");
            return;
        }
        Employee[] newEmployees = new Employee[employees.length - 1];
        for (byte i = 0; i < index; i++) {
            newEmployees[i] = employees[i];
        }
        for (byte i = (byte) (index + 1); i < employees.length; i++) {
            newEmployees[i - 1] = employees[i];
        }
        employees = newEmployees;
    }
}
