package homework8;

import java.util.Arrays;
import java.util.Random;

public class Homework_8 {

    public static void main(String[] args) {

        // 1
        System.out.println("Задача 1");
        int a = 20;
        int[] intArray = new int[a - 1];
        intArray[intArray.length - 1] = a;

        for (int i = 0; i < intArray.length - 1; i++) {
            intArray[i] = i + 1;
        }

        int expectedSum = (a * (a + 1)) / 2;
        int actualSum = Arrays.stream(intArray).sum();
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);

        System.out.println();


        // 2
        System.out.println("Задача 2");
        int N = 20;
        int K = 30;

        int[] array = new int[N];
        Random random = new Random();

        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt(N);
            System.out.print(array[i] + ", ");
        }

        int countPairs = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == K) {
                    countPairs++;
                }
            }
        }

        System.out.println();
        System.out.println("The number of sums of elements equal to k is: " + countPairs);
    }
}

