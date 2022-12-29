package fundamentals;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        int rem = 0;

        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            if (rem % 2 == 0) {
                evenSum += rem;
            } else {
                oddSum += rem;
            }
        }
        System.out.println(evenSum + " " + oddSum);
    }
}
