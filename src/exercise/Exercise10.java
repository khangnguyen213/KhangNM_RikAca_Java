package exercise;

import java.util.Scanner;

public class Exercise10 {
//    Trong phần này, chúng ta sẽ phát triển một ứng dụng
//    cho phép người dùng nhập vào 3 cạnh của tam giác,
//    kiểm tra xem nếu 3 cạnh đấy thoả mãn điều kiện trở thành 1 tam giác thì
//    cho phép tính diện tích và chu vi, nếu không thì bắt người dùng nhập lại

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        do {
            System.out.println("Nhập vào 3 cạnh của tam giác: ");
            System.out.print("Nhập cạnh a: ");
            a = scanner.nextDouble();
            System.out.print("Nhập cạnh b: ");
            b = scanner.nextDouble();
            System.out.print("Nhập cạnh c: ");
            c = scanner.nextDouble();
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("3 cạnh không thoả mãn điều kiện của tam giác. Mời nhập lại!");
            }
        } while (a + b <= c || a + c <= b || b + c <= a);
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Diện tích tam giác là: " + s);
        System.out.println("Chu vi tam giác là: " + (a + b + c));
    }
}
