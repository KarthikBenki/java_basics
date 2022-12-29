package fundamentals;

import java.util.Scanner;

public class PrintAllFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 0 && n <= 10000) {
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    System.out.print(i+" ");
                }
                i++;
            }
        }


    }
}
