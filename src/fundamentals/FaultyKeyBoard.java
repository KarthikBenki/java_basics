package fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class FaultyKeyBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for (int test = 0; test < testCases; test++) {
            String status = "true";

            String s = scanner.next();
            String faulty = scanner.next();

            int arr1[] = new int[256];
            int arr2[] = new int[256];

            for (int i = 0; i < s.length(); i++) {
                arr1[s.charAt(i)]++;
            }
            for (int i = 0; i < faulty.length(); i++) {
                arr2[faulty.charAt(i)]++;
            }
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] < arr1[i]) {
                    status = "false";
                    break;
                }
            }
            list.add(status);
        }

        list.forEach(ele-> System.out.println(ele));
    }
}
