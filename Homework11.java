package homework11;

public class Homework11 {

    public static void main(String[] args) {


    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }


            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }

    public static void insertionSort ( int[] array){

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}