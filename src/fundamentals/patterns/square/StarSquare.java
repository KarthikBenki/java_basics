package fundamentals.patterns.square;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print("*");
                j = j + 1;
            }
            System.out.println();
            i += 1;
        }
    }
}
