package homework5;

import java.util.Random;

public class Homework_5 {

    public static void main(String[] args) {

        // 1
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;

        System.out.println("I can walk: " + canWalk);


        // 2
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);

        System.out.println("I can buy food, it's " + canBuy);


        // 3
        int temperature1 = 105;
        int temperature2 = 80;

        boolean deviceIsWorking = checkDevice(temperature1, temperature2);

        System.out.println("The device is working: " + deviceIsWorking);


        // 4
        Random random = new Random();
        int n = random.nextInt(28801);

        System.out.println(n + " Seconds remaining");

        int hours = n / 3600;
        if (hours >= 1) {
            System.out.println(hours + " hours left");
        } else {
            System.out.println("Less than an hour left");
        }


        // 5
        int numStudents = 18;
        int randomStudentNumber = getRandomStudentNumber(numStudents);

        System.out.println("Student number: " + randomStudentNumber);
    }









    // 2
    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }


    // 3
    public static boolean checkDevice(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }


    // 5
    public static int getRandomStudentNumber(int numStudents){
        Random random = new Random();
        return random.nextInt(numStudents -1) + 2;
    }
}
