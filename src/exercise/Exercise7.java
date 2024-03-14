package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input square's side's length: ");
        byte length = Byte.parseByte(sc.nextLine());
        while (length < 1) {
            System.out.println("Length must be positive");
            length = Byte.parseByte(sc.nextLine());
        }

        float[][] matrix = new float[length][length];
        System.out.println("Your initial square matrix: ");
        System.out.println(Arrays.deepToString(matrix));

        for (byte rowIndex = 0; rowIndex < length; rowIndex++) {
            for(byte colIndex = 0; colIndex < length; colIndex++){
                System.out.printf("Please insert value at row %d column %d%n",rowIndex+1,colIndex+1);
                matrix[rowIndex][colIndex] = Float.parseFloat(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        float sumOfMainDiagonal = 0;
        float sumOfSecondaryDiagonal = 0;

        for (byte rowIndex = 0; rowIndex < length; rowIndex++) {
            for (byte colIndex = 0; colIndex < length; colIndex++) {
                if (rowIndex == colIndex) {
                    sumOfMainDiagonal += matrix[rowIndex][colIndex];
                }
                if (rowIndex + colIndex == length - 1) {
                    sumOfSecondaryDiagonal += matrix[rowIndex][colIndex];
                }
            }
        }

        System.out.println("Sum of main diagonal is " + sumOfMainDiagonal);
        System.out.println("Sum of secondary diagonal is " + sumOfSecondaryDiagonal);
    }
}
