package exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        int width = sc.nextInt();
        System.out.println("Enter the height: ");
        int height = sc.nextInt();
        int perimeter = (height+width)*2;
        int area = height*width;
        System.out.println(String.format("Perimeter: %d", perimeter));
        System.out.println(String.format("Area: %d", area));

    }
}
