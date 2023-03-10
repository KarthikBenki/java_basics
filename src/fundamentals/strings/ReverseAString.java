package fundamentals.strings;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String s = reverseString1(str);
        System.out.println(s);
    }

    public static String reverseString(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    public static String reverseString1(String str) {
        String reversedString = "";
        for (int i = 0; i < str.length(); i++) {
            reversedString = str.charAt(i) + reversedString;
        }
        return reversedString;
    }
}
