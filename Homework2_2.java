package homework2;

public class Homework2_2 {

    public static void main(String[] args) {

        int n;
        n = 365;
        int e = n % 10;
        int d = n / 10 % 10;
        int s = n / 100;

        System.out.println("цифры этого числа:");
        System.out.println(e);
        System.out.println(d);
        System.out.println(s);

    }
}

