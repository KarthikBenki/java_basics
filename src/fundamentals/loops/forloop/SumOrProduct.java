package fundamentals.loops.forloop;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = 0;
        int prod = 1;
        int reusult = 0;

        if (n >= 1 && n <= 12) {
            if (c > 2 || c < 1) {
                System.out.println(-1);
                return;
            }
            for (int i = 1; i <= n; i++) {
                if (c == 1) {
                    sum += i;
                    reusult = sum;
                } else {
                    prod *= i;
                    reusult = prod;
                }
            }
        }

        System.out.println(reusult);

    }
}
