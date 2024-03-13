package exercise;

import java.util.Scanner;

public class Exercise8 {
//    Trong phần này, chúng ta sẽ phát triển một ứng dụng nhiều chức năng cho phép người dùng chọn chức năng để sử dụng.
//    Menu gồm :
//            1.	Kiểm tra tính chẵn lẻ của 1 số.
//2.	Kiểm tra số nguyên tố.
//3.	Kiểm tra một số có chia hết cho 3 không.
//4.	Thoát

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay chon 1-4:\n1. Kiem tra tinh chan le cua 1 so.\n2. Kiem tra so nguyen to.\n3. Kiem tra mot so co chia het cho 3 khong.\n4. Thoat");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhap so can kiem tra: ");
                int number = scanner.nextInt();
                if (number % 2 == 0) {
                    System.out.println("So " + number + " la so chan.");
                } else {
                    System.out.println("So " + number + " la so le.");
                }
                break;
            case 2:
                System.out.println("Nhap so can kiem tra: ");
                int number2 = scanner.nextInt();
                if (number2 < 2) {
                    System.out.println("So " + number2 + " khong phai la so nguyen to.");
                } else {
                    boolean check = true;
                    for (int i = 2; i <= Math.sqrt(number2); i++) {
                        if (number2 % i == 0) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        System.out.println("So " + number2 + " la so nguyen to.");
                    } else {
                        System.out.println("So " + number2 + " khong phai la so nguyen to.");
                    }
                }
                break;
            case 3:
                System.out.println("Nhap so can kiem tra: ");
                int number3 = scanner.nextInt();
                if (number3 % 3 == 0) {
                    System.out.println("So " + number3 + " chia het cho 3.");
                } else {
                    System.out.println("So " + number3 + " khong chia het cho 3.");
                }
                break;
            case 4:
                System.out.println("Thoat.");
                break;
            default:
                System.out.println("Nhap sai.");
        }
    }
}
