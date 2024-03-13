package exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap so bat dau");
        int number = Integer.parseInt(sc.nextLine());
        while (true) {
            if (number % 3 != 0) {
                number++;
                continue;
            }

            if (number %5 != 0) {
                number++;
                continue;
            }

            if (number %7 != 0) {
                number++;
                continue;
            }

            System.out.println(number);
            break;
        }
    }
}
