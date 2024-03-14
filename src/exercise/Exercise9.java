package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of number array: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Your input array: " + Arrays.toString(numbers));

        int max = numbers[0];
        int max2 = numbers[0];

        boolean isAssignedMax2 = false;

        for (int number:numbers) {
            if (number > max) {
                max2 = max;
                max = number;
                isAssignedMax2 = true;
            } else if (number != max) {
                if (isAssignedMax2) {
                    if (number > max2) max2 = number;
                } else {
                    max2 = number;
                    isAssignedMax2 = true;
                }
            }

        }

        System.out.println("The result is " + max2);
    }
}
