package fundamentals.patterns.assignments;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        int i = 1;
        int n = new Scanner(System.in).nextInt();
        while (i <= n) {
            int j = 1;
            int sum = 0;
            while (j <= i) {
                System.out.print(j++);
                if (j <= i) System.out.print("+");
                sum = sum + j - 1;
            }
            System.out.println("=" + sum);
            i++;
        }
    }
}
