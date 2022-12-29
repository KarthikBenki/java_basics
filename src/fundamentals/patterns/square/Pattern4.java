package fundamentals.patterns.square;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 0 && n <= 50) {
            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= n) {
                    System.out.print(n);
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
