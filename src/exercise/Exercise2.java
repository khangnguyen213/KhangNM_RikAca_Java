package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the length of array:");
        byte length = Byte.parseByte(scanner.nextLine());
        int[] numbers = new int[length];
        System.out.println("Your inital array: " + Arrays.toString(numbers));
        while (true) {
            System.out.println("Please type the number to insert:");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Please type the index to insert " + number);
            byte index = Byte.parseByte(scanner.nextLine());
            while (index < 0 || index >= length) {
                System.out.printf(String.format("Index must between %d and %d",0,length-1));
                index = Byte.parseByte(scanner.nextLine());
            }
            numbers[index]=number;
            System.out.println("Your result array: "+ Arrays.toString(numbers));

            System.out.println("Continue to insert? (Y/n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Your result array: " + Arrays.toString(numbers));
            };
        }
    }
}
