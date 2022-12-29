package fundamentals.patterns.triangle.isosceles;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        n = n / 2 + 1;

        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int stars = 1;
            while (stars <= (1 + (2 * (i - 1)))) {
                System.out.print("*");
                stars++;
            }
            i++;
            System.out.println();
        }
        i = 1;

        while (i <= n - 1) {
            int spaces = 1;
            while (spaces <= i) {
                System.out.print(" ");
                spaces++;
            }
            int stars = 1;
            while (stars < (2 * (n - i))) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}
