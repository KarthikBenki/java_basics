package fundamentals.strings;

import java.util.Scanner;

public class StringPermutation1 {
    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        if (str1.equals(str2)) return true;

        String arranged = "";
        int j = 0;
        while (!str1.equals(arranged)) {
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(j) == str2.charAt(i)) {
                    j++;
                    arranged += str2.charAt(i);
                    if (j >= str1.length()) break;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        boolean permutation = isPermutation(str1, str2);
        System.out.println(permutation);
    }
}
