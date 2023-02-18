package homework4;

import java.util.Scanner;

public class Homework_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two even-length words:");
        String word1 = scanner.next();
        String word2 = scanner.next();

//        System.out.println(word1 + " " + word2);

        int halfLength =word1.length() / 2;
//        System.out.println(halfLength);

        String firstHalf =word1.substring(0, halfLength);
//        System.out.println(firstHalf);
        String secondHalf = word2.substring(halfLength);
//        System.out.println(secondHalf);
        String result = firstHalf + secondHalf;
        System.out.println("Result: " + result);


//

        int addResult = addTwoNumbers(3,5);
        System.out.println(addResult);

        int dedResult = dedTwoNumbers(7, 2);
        System.out.println(dedResult);

        int mulResult = mulTwoNumbers(2,3);
        System.out.println(mulResult);

        int divResult = divTwoNumbers(6, 3);
        System.out.println(divResult);


//

        double usdAmount = convertEuroToUSD(100, 1.2);
        System.out.println("USD Amount: " + usdAmount);


//

        double pizza1 = 24;
        double pizza2 =28;
        double caloriesPerSqCm = 40;

        double areaPizza1 = area(pizza1/2);
        double areaPizza2 = area(pizza2/2);

        double extraCalories =(areaPizza2 - areaPizza1) * caloriesPerSqCm;
        System.out.println("Extra calories is: " + extraCalories);

    }



    private static int addTwoNumbers(int a, int b) throws NullPointerException {
        int result = a + b;
        return result;
    }

    private static int dedTwoNumbers(int a, int b) throws ArithmeticException {
        int result = a - b;
        return result;
    }

    private static int mulTwoNumbers(int a, int b) throws ArithmeticException {
        int result = a * b;
        return result;
    }

    private static int divTwoNumbers(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }


//

    private static double convertEuroToUSD(double euroAmount, double exchangeRate) {
        double usdAmount = euroAmount * exchangeRate;
        return usdAmount;
    }


//

    private static double area(double radius) {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

}
