package exercise;

import java.util.Scanner;

public class Exercise1 {
//    Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số từ 0 -9
//    và hiển thị cách đọc của số đó ra màn hình .
//    Ví dụ người dùng nhập số 1 thì hiển thị là “Số Một”.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số từ 0 - 9: ");
        int number = sc.nextInt();
        switch (number) {
            case 0:
                System.out.println("Số không");
                break;
            case 1:
                System.out.println("Số một");
                break;
            case 2:
                System.out.println("Số hai");
                break;
            case 3:
                System.out.println("Số ba");
                break;
            case 4:
                System.out.println("Số bốn");
                break;
            case 5:
                System.out.println("Số năm");
                break;
            case 6:
                System.out.println("Số sáu");
                break;
            case 7:
                System.out.println("Số bảy");
                break;
            case 8:
                System.out.println("Số tám");
                break;
            case 9:
                System.out.println("Số chín");
                break;
            default:
                System.out.println("Số không hợp lệ");
        }
    }
}
