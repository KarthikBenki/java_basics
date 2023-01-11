package fundamentals.strings;

import java.util.Scanner;

public class RemoveDuplicatesConnectives {
    public static String removeConsecutiveDuplicates(String str) {
        String updatedString = "";
        updatedString += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                updatedString+=str.charAt(i);
            }
        }
        return updatedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String s = removeConsecutiveDuplicates(str);
        System.out.println(s);
    }
}
