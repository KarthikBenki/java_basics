package fundamentals.patterns;

import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int i = 1;
        while (i <= n) {
            int j = n;
            int p = n;
            while (j>=1) {
                if (i == j) {
                    System.out.print("*");
                    p--;
                } else
                    System.out.print(p--);
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
