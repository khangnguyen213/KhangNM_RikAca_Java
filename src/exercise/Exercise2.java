package exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final short usdToVnd = 23000;
        System.out.println("Enter the amount of USD: ");
        int input = sc.nextInt();
        System.out.println("The amount of VND: " + input * usdToVnd);
    }
}
