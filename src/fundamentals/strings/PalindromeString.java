package fundamentals.strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        boolean b = checkPalindrome(str);
        System.out.println(b);
    }

    public static boolean checkPalindrome(String str) {
        String reversedString = "";
        for (int i = 0; i < str.length(); i++) {
            reversedString = str.charAt(i)+reversedString;
        }

        return reversedString.equals(str);
    }
}
