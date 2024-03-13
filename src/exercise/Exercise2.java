package exercise;

import java.util.Scanner;

public class Exercise2 {
//    Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số tự nhiên
//    và kiểm tra xem số đó có chia hết cho 3 và 5 không.

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số tự nhiên: ");
            int number = sc.nextInt();
            boolean even3 = number % 3 == 0;
            boolean even5 = number % 5 == 0;

            if (even3 && even5) {
                System.out.println("Số " + number + " chia hết cho 3 và 5");
            } else if (even3) {
                System.out.println("Số " + number + " chỉ chia hết cho 3");
            } else if (even5) {
                System.out.println("Số " + number + " chỉ chia hết cho 5");
            } else {
                System.out.println("Số " + number + " không chia hết cho 3 và 5");
            }
            System.out.println("Bạn có muốn tiếp tục không? (Y/n)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("N")) {
                run = false;
            }
        }

    }
}
