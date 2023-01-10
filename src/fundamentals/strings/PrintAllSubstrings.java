package fundamentals.strings;

import java.util.Scanner;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        printAllSubstrings1(str);
    }

    public static void printAllSubstrings(String str) {
        for (int startIndex = 0; startIndex < str.length(); startIndex++) {
            for (int endIndex = startIndex; endIndex < str.length(); endIndex++) {
                String subString = "";
                for (int k = startIndex; k <= endIndex; k++) {
                    subString += str.charAt(k);
                }
                System.out.println(subString);
            }
        }
    }

    public static void printAllSubstrings1(String str) {
        for (int length = 1; length <= str.length(); length++) {
            for (int startIndex = 0; startIndex <= str.length() - length; startIndex++) {
                int endIndex = startIndex + length - 1;
                System.out.println(str.substring(startIndex, endIndex + 1));
            }
        }


    }
}
