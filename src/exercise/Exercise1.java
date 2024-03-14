package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the length of array:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[length];
        for (byte i = 0; i < length; i++) {
            System.out.println("Please insert number in index " + i);
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }
        System.out.println(Arrays.toString(numbers));
        while (true) {
            System.out.println("Please insert the number you want to delete");
            int deleteNumber = Integer.parseInt(scanner.nextLine());
            byte index = 0;
            for (int number : numbers) {
                if (number == deleteNumber) break;
                index++;
            }

            for (byte i = (byte) (index + 1); i < length; i++) {
                numbers[i - 1] = numbers[i];
                numbers[i] = 0;
            }

            System.out.println(Arrays.toString(numbers));

            System.out.println("Continute to delete? (Y/n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) break;
        }
    }
}
