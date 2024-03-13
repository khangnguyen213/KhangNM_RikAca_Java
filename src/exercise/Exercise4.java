package exercise;

import java.util.Scanner;

public class Exercise4 {
//    Xây dựng một ứng dụng tính toán điểm trung bình các môn
//    , đánh giá học lực  , hiển thị kết quả ra màn hình.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter math score: ");
    int math = sc.nextInt();
    while (math < 0 || math > 10) {
        System.out.println("Invalid input. Please enter again: ");
        math = sc.nextInt();
    }
    System.out.println("Enter literature score: ");
    int literature = sc.nextInt();
    while (literature < 0 || literature > 10) {
        System.out.println("Invalid input. Please enter again: ");
        literature = sc.nextInt();
    }
    System.out.println("Enter english score: ");
    int english = sc.nextInt();
    while (english < 0 || english > 10) {
        System.out.println("Invalid input. Please enter again: ");
        english = sc.nextInt();
    }
    float average = (math + literature + english) / 3;
    String type = average >= 9 ? "Xuat sac" : average >= 8 ? "Gioi" : average >= 6.5 ? "Kha" : average >= 5 ? "Trung binh" : "Yeu";

    System.out.println("Diem trung binh: " + average);
    System.out.println("Hoc luc: " + type);
}
}
