package exercise;

import java.util.Scanner;

public class Exercise8 {
    //input a string and input a charater to count the occurences of that character in the string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();
        System.out.println("Input a character: ");
        char c = sc.nextLine().charAt(0);
        int count = 0;
for (char ch : str.toCharArray()) {
            if (ch == c) count++;
        }
        System.out.println(String.format("Character %c appears %d times in the string", c, count));

    }
}
