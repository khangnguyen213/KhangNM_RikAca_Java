package exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate double and triple: ");
        int input = sc.nextInt();
        System.out.println(input + " squared is: " + input * input);
        System.out.println(input + " cubed is: " + input * input * input);
    }
}
