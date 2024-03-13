package exercise;

import java.util.Scanner;

public class Exercise9 {
//    Trong phần này, chúng ta sẽ phát triển một ứng dụng tính chu vi  và diện tích theo từng loại hình dựa trên menu chức năng.
//    Menu gồm :
//            1.	Tính chu vi và diện tích hình chữ nhật .
//2.	Tính chu vi và diện tích hình tam giác
//3.	Tính chu vi và diện tích hình tròn.
//            4.	Thoát

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tinh chu vi cua hinh, hay nhap 1-4 de chon: 1. Hinh chu nhat, 2. Hinh tam giac, 3. Hinh tron, 4. Thoat");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhap chieu dai: ");
                int length = scanner.nextInt();
                System.out.println("Nhap chieu rong: ");
                int width = scanner.nextInt();
                System.out.println("Chu vi hinh chu nhat la: " + (length + width) * 2);
                System.out.println("Dien tich hinh chu nhat la: " + length * width);
                break;
            case 2:
                System.out.println("Nhap canh a: ");
                int a = scanner.nextInt();
                System.out.println("Nhap canh b: ");
                int b = scanner.nextInt();
                System.out.println("Nhap canh c: ");
                int c = scanner.nextInt();
                System.out.println("Chu vi hinh tam giac la: " + (a + b + c));
                System.out.println("Dien tich hinh tam giac la: " + Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a)) / 4);
                break;
            case 3:
                System.out.println("Nhap ban kinh: ");
                int r = scanner.nextInt();
                System.out.println("Chu vi hinh tron la: " + 2 * Math.PI * r);
                System.out.println("Dien tich hinh tron la: " + Math.PI * r * r);
                break;
            case 4:
                System.out.println("Thoat");
                break;
            default:
                System.out.println("Nhap sai, vui long nhap lai");
        }
    }

}
