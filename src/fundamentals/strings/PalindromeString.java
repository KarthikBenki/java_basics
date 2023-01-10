package fundamentals.strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        boolean b = checkPalindrome1(str);
        System.out.println(b);
    }

    public static boolean checkPalindrome(String str) {
        String reversedString = "";
        for (int i = 0; i < str.length(); i++) {
            reversedString = str.charAt(i)+reversedString;
        }

        return reversedString.equals(str);
    }

    public static boolean checkPalindrome1(String str) {
        boolean isPalindrome = true;
        for (int i = 0,j = str.length()-1; i < str.length(); i++,j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
