package exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your math score:");
        final byte mathScore = sc.nextByte();
        System.out.println("Enter your liteture score:");
        final byte litetureScore = sc.nextByte();
        System.out.println("Enter your english score:");
        final byte englishScore = sc.nextByte();

        int total =  mathScore+litetureScore+englishScore;
        float average = (float) total /3;

        System.out.printf("Total score is %d \n",total);
        System.out.printf("Average score is %.2f",average);

    }
}
