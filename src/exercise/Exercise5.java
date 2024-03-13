package exercise;

import java.util.Scanner;

public class Exercise5 {
//    Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép người dùng
//    nhập vào 1 khoảng số tự nhiên và yêu cầu tính tổng các số chẵn nằm trong khoảng đó.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter start number: ");
    int start = sc.nextInt();
    System.out.println("Enter end number: ");
    int end = sc.nextInt();
    while (start > end) {
        System.out.println("Invalid input. Please enter again ");
        System.out.println("Enter start number: ");
        start = sc.nextInt();
        System.out.println("Enter end number: ");
        end = sc.nextInt();
    }

    int result = 0;

    for(int i = start; i<= end; i++) {
        if (i%2 == 0) result+=i;
    }

    System.out.println(result);
}
}
