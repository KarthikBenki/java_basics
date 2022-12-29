package fundamentals.patterns.mirror;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int numbers = 1;
            while (numbers <= i) {
                System.out.print(numbers);
                numbers++;
            }
            i++;
            System.out.println();
        }
    }

}
