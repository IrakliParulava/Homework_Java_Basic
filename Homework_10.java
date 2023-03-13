package homework10;

public class Homework_10 {

    public static void main(String[] args) {

        // 1
        reverseString("Hello","World");

        System.out.println();


        // 2.1
        char[] array = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        String string = new String(array);
        string = string.replace("?","e");
        System.out.println(string);

        System.out.println();


        // 2.2
        char[] array1 = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        StringBuilder sb = new StringBuilder();
        for (char i : array1) {
            if (i == '?') {
                sb.append('e');
            } else {
                sb.append(i);
            }
        }
        String string1 = sb.toString();
        System.out.println(string1);

        System.out.println();

        // 3
        reverseWords("I ekil avaj");
    }


    // 1
    public static void reverseString(String s1, String s2) {
        String combineString = s1.concat(s2);
        String reverseString = new StringBuilder(combineString).reverse().toString();
        System.out.println(reverseString);
    }


    // 3
    public static void reverseWords(String input) {
        String[] words = input.split(" ");
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            System.out.print(sb.toString() + " ");
        }
    }
}
