package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
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

        System.out.println("Type the column index you want to calculate the sum of: ");
        byte colIndex = (byte) (Byte.parseByte(sc.nextLine()) - 1);
        while (colIndex < 0 || colIndex >= cols) {
            System.out.println("Column index must be within the range of the matrix");
            colIndex = (byte) (Byte.parseByte(sc.nextLine()) - 1);
        }
        float sum = 0;
        for (byte rowIndex = 0; rowIndex < rows; rowIndex++) {
            sum += matrix[rowIndex][colIndex];
        }
        System.out.println("Sum of column " + colIndex + " is " + sum);
    }
}
