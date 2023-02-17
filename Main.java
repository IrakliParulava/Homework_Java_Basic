package homework3.homework3_2;

public class Main {

    public static void main(String[] args) {

        String newString = processString("I Study Basic Java!");
        System.out.println(newString);

        System.out.println(newString.charAt(18));

        System.out.println(newString.contains("Java"));

        System.out.println(newString.replace("a", "o"));

        System.out.println(newString.toUpperCase());
        System.out.println(newString.toLowerCase());

        System.out.println(newString.substring(14, 18));

    }

    public static String processString(String inputString) {
        return inputString;
    }
}

