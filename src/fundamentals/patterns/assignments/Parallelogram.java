package fundamentals.patterns.assignments;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        int i = 1;
        int n = new Scanner(System.in).nextInt();

        while (i <= n) {
            int spaces = 1;
            while (spaces <= i - 1) {
                System.out.print(" ");
                spaces++;
            }

            int stars = 1;
            while (stars <= n) {
                System.out.print("*");
                stars++;
            }
            i++;
            System.out.println();
        }
    }
}
