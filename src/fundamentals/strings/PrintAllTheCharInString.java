package fundamentals.strings;

import java.util.Scanner;

public class PrintAllTheCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printChars(str);
    }

    public static void printChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
