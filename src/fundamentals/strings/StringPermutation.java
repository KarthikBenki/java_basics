package fundamentals.strings;

import java.util.Scanner;

public class StringPermutation {
    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        if (str1.equals(str2)) return true;

        int arr[] = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            arr[str2.charAt(i)]--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
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
