package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the length of first array: ");
        byte length1 = Byte.parseByte(sc.nextLine());
        int[] array1 = new int[length1];
        for (byte i = 0; i < length1; i++) {
            System.out.println("Insert the value of first array at index " + i);
            int number = Integer.parseInt(sc.nextLine());
            array1[i] = number;
        }
        System.out.println("Your first array: " + Arrays.toString(array1));

        System.out.println("Insert the length of second array: ");
        byte length2 = Byte.parseByte(sc.nextLine());
        int[] array2 = new int[length2];
        for (byte i = 0; i < length2; i++) {
            System.out.println("Insert the value of second array at index " + i);
            int number = Integer.parseInt(sc.nextLine());
            array2[i] = number;
        }
        System.out.println("Your second array: " + Arrays.toString(array2));
        System.out.println("Merging...");

        byte length3 = (byte) (length1 + length2);
        int[] array3 = new int[length3];
        byte currentIndex = 0;
        for (int number:array1) {
            array3[currentIndex] = number;
            currentIndex++;
        }
        for (int number:array2) {
            array3[currentIndex] = number;
            currentIndex++;
        }
        System.out.println("Your first array: " + Arrays.toString(array1));
        System.out.println("Your second array: " + Arrays.toString(array2));
        System.out.println("Your merged array: " + Arrays.toString(array3));
    }
}
