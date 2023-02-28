package homework7;

public class Homework_7 {

    public static void main(String[] args) {

        // 1
        for (int i = 0; i < 20; i++) {
            System.out.println("Это строка номер " + i);
        }


        // 2
        for (int i = 40; i >= 20; i--) {
            System.out.println(i);
        }


        // 3
        int sum = 0;
        for (int i = 20; i <= 60; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);


        // 4
        int numberOfLifts = numberOfLifts(25, 7, 2);

        System.out.println("The elevator will need to go up " + numberOfLifts + " times to reach the top floor.");
    }


    public static int numberOfLifts(int floors, int stepUp, int stepDown) {
        int currentFloor = 1;
        int lifts = 0;

        while (currentFloor < floors) {
            lifts++;
            currentFloor += stepUp;

            if (currentFloor >= floors) {
                return lifts;
            }
            currentFloor -= stepDown;
        }
        return lifts;
    }

}
