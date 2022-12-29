package fundamentals.patterns.assignments;

import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        int i = 1;
        int n = new Scanner(System.in).nextInt();
        int oddMax = 2 * n - 1;

        while (i <= n) {
            int valueToPrint = 2 * i - 1;
            int j = 1;
            while (j <= n) {
                System.out.print(valueToPrint);
                valueToPrint += 2;
                if (valueToPrint > oddMax) valueToPrint = 1;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
