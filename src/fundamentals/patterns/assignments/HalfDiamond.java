package fundamentals.patterns.assignments;

import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        int i = 1;
        int n = new Scanner(System.in).nextInt();

        System.out.println("*");
        while (i <= n) {
            int numbers = 1;
            System.out.print("*");
            int p = 1;
            while (numbers <= 1 + 2 * (i - 1)) {
                if (numbers < (1 + 2 * (i - 1) / 2))
                    System.out.print(p++);
                else System.out.print(p--);
                numbers++;
            }
            System.out.println("*");
            i++;
        }
        i = 1;
        while (i <= n - 1) {
            int numbers = 1;
            System.out.print("*");
            int p = 1;
            while (numbers <= 2 * (n - i) - 1) {
                if (numbers <= (2 * (n - i) - 1) / 2)
                    System.out.print(p++);
                else System.out.print(p--);
                numbers++;
            }
            System.out.println("*");
            i++;
        }
        System.out.println("*");
    }
}
