package homework6;

import java.util.Random;
import java.util.Scanner;

public class Homework_6 {

    public static void main(String[] args) {


        int monthNumber = 3;

        String monthName;
        String seasonName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number";
                break;
        }

        switch ((monthNumber % 12) / 3) {
            case 0:
                seasonName = "Winter";
                break;
            case 1:
                seasonName = "Spring";
                break;
            case 2:
                seasonName = "Summer";
                break;
            case 3:
                seasonName = "Autumn";
                break;
            default:
                seasonName = "Invalid month number";
                break;
        }

        System.out.println("The month is " + monthName);
        System.out.println("The season is " + seasonName);


        // 2
        Random random = new Random();
        int num = random.nextInt(100, 999);

        System.out.println("Random Number is: " + num);

        int digit1 = num / 100;
        int digit2 = num / 10 % 10;
        int digit3 = num % 10;

        if (digit1 >= digit2 && digit1 > digit3) {
            System.out.println("MaxDigit is: " + digit1);
        } else if (digit2 > digit1 && digit2 > digit3) {
            System.out.println("MaxDigit is: " + digit2);
        } else {
            System.out.println("MaxDigit is: " + digit3);
        }



        // 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three digit number: ");
        int threeDigitNumber = scanner.nextInt();

        while (threeDigitNumber < 100 || threeDigitNumber > 999) {
            System.out.println("You have entered an incorrect number, Please enter a three digit number: ");
            threeDigitNumber = scanner.nextInt();
        }

        if (threeDigitNumber > 100 || threeDigitNumber < 999) {
            int firstDigit = threeDigitNumber / 100;
            int secondDigit = threeDigitNumber / 10 % 10;
            int thirdDigit = threeDigitNumber % 10;

            int digitSum = firstDigit + secondDigit + thirdDigit;

            System.out.println("The sum of the digits is: " + digitSum);
        }
    }
}
