package exercise;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Circle circle1 = new Circle(12,"red");
        circle1.displayData();
        System.out.println(circle1.calArea());
    }
    private double radius;
    private String color;

    public Circle() {}

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Insert radius: ");
        setRadius(Double.parseDouble(scanner.nextLine()));
        System.out.println("Insert color of circle: ");
        setColor(scanner.nextLine());
    }

    public void displayData() {
        System.out.printf("The circle has radius is %f and has %s color \n",radius,color);
    }

    public double calPerimeter() {
        return 2*3.14*radius;
    }

    public double calArea() {
        return 3.14*Math.sqrt(radius);
    }
}
