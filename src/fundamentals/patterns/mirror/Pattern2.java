package fundamentals.patterns.mirror;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int i = 1;
        int n = new Scanner(System.in).nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
