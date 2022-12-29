package fundamentals.patterns.triangle.isosceles;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int inc = 1;
            int p = i;
            while (inc <= i) {
                System.out.print(p++);
                inc++;
            }
            int dec = i - 1;
            p = p - 2;
            while (dec >= 1) {
                System.out.print(p--);
                dec--;
            }
            i++;
            System.out.println();
        }
    }

}
