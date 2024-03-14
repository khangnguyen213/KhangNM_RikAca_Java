package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    //input an array of integer and return min value
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the array: ");
        byte size = Byte.parseByte(sc.nextLine());
        while (size < 1) {
            System.out.println("Size of the array must be positive");
            size = Byte.parseByte(sc.nextLine());
        }
        int[] arr = new int[size];
        for (byte i = 0; i < size; i++) {
            System.out.printf("Please insert value at index %d%n", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int minValue = arr[0];
        for (int value : arr) {
            if (minValue > value) minValue = value;
        }
        System.out.println("Your initial array: " + Arrays.toString(arr));
        System.out.println("Min value of the array is " + minValue);
    }
}
