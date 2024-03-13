package exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRun = true;
        while(isRun) {
            System.out.println("Hay nhap 1 so tu nhien: ");
            int number = Integer.parseInt(sc.nextLine()) ;
            while (number < 0 || number > 999) {
                System.out.println("So nhap vao khong hop le, hay nhap vao 1 so khac:");
                number = Integer.parseInt(sc.nextLine());
            }

            int hundreds = number/100;
            int tens = (number%100)/10;
            int ones = number%10;

            String readOnes;
            String readTens;
            String readHundreds;

            switch (ones) {
                case 0:
                    readOnes = "zero";
                    break;
                case 1:
                    readOnes = "one";
                    break;
                case 2:
                    readOnes = "two";
                    break;
                case 3:
                    readOnes = "three";
                    break;
                case 4:
                    readOnes = "four";
                    break;
                case 5:
                    readOnes = "five";
                    break;
                case 6:
                    readOnes = "six";
                    break;
                case 7:
                    readOnes = "seven";
                    break;
                case 8:
                    readOnes = "eight";
                    break;
                case 9:
                    readOnes = "nine";
                    break;
                default:
                    readOnes="";
            }
            switch (tens) {
                case 9:
                    readTens = "ninety";
                    break;
                case 8:
                    readTens = "eighty";
                    break;
                case 7:
                    readTens = "seventy";
                    break;
                case 6:
                    readTens = "sixty";
                    break;
                case 5:
                    readTens = "fifty";
                    break;
                case 4:
                    readTens = "forty";
                    break;
                case 3:
                    readTens = "thirty";
                    break;
                case 2:
                    readTens = "twenty";
                    break;
                case 1:
                    switch (ones) {
                        case 0:
                            readTens = "ten";
                            break;
                        case 1:
                            readTens = "eleven";
                            break;
                        case 2:
                            readTens = "twelve";
                            break;
                        case 3:
                            readTens = "thirteen";
                            break;
                        case 4:
                            readTens = "fourteen";
                            break;
                        case 5:
                            readTens = "fifthteen";
                            break;
                        case 6:
                            readTens = "sixteen";
                            break;
                        case 7:
                            readTens = "seventeen";
                            break;
                        case 8:
                            readTens = "eighteen";
                            break;
                        case 9:
                            readTens = "nineteen";
                            break;
                        default:
                            readTens="";
                    };
                    break;
                default:
                    readTens="";

            }
            switch (hundreds) {

                case 1:
                    readHundreds = "one hundred";
                    break;
                case 2:
                    readHundreds = "two hundred";
                    break;
                case 3:
                    readHundreds = "three hundred";
                    break;
                case 4:
                    readHundreds = "four hundred";
                    break;
                case 5:
                    readHundreds = "five hundred";
                    break;
                case 6:
                    readHundreds = "six hundred";
                    break;
                case 7:
                    readHundreds = "seven hundred";
                    break;
                case 8:
                    readHundreds = "eight hundred";
                    break;
                case 9:
                    readHundreds = "nine hundred";
                    break;
                default:
                    readHundreds="";
            }

            if (hundreds == 0) {
                if(tens == 0) {
                    System.out.println(readOnes);
                } else if (ones == 0){
                    System.out.println(String.format("%s",readTens));
                } else {
                    if(tens == 1) {
                        System.out.println(readTens);
                    } else {
                        System.out.println(String.format("%s %s",readTens,readOnes));
                    }
                }
            } else {
                if(tens == 0) {
                    if(ones == 0) {
                        System.out.println(String.format("%s",readHundreds));
                    } else {
                        System.out.println(String.format("%s and %s",readHundreds,readOnes));
                    }
                } else if (ones == 0){
                    System.out.println(String.format("%s and %s",readHundreds,readTens));
                } else {
                    if(tens == 1) {
                        System.out.println(String.format("%s and %s",readHundreds,readTens));
                    } else {
                        System.out.println(String.format("%s and %s %s",readHundreds,readTens,readOnes));
                    }
                }
            }

            System.out.println("Ban co muon tiep tuc khong? (Y/n)");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("n")){
                isRun= false;
            }
        }
    }
}
