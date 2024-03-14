package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows of matrix: ");
        byte rows = Byte.parseByte(sc.nextLine());
        while (rows < 1) {
            System.out.println("Number of rows must be positive");
            rows = Byte.parseByte(sc.nextLine());
        }
        System.out.println("Input number of columns of matrix: ");
        byte cols = Byte.parseByte(sc.nextLine());
        while (cols < 1) {
            System.out.println("Number of columns must be positive");
            cols = Byte.parseByte(sc.nextLine());
        }
        float[][] matrix = new float[rows][cols];
        System.out.println("Your initial matrix: ");
        System.out.println(Arrays.deepToString(matrix));

        for (byte rowIndex = 0; rowIndex < rows; rowIndex++) {
            for(byte colIndex = 0; colIndex < cols; colIndex++){
                System.out.printf("Please insert value at row %d column %d%n",rowIndex+1,colIndex+1);
                matrix[rowIndex][colIndex] = Float.parseFloat(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        float maxValue = matrix[0][0];
        for (float[] row: matrix) {
            for(float cell:row) {
                if (maxValue < cell) maxValue=cell;
            }
        }
        System.out.println("Max value of the matrix is "+maxValue);
    }
}
