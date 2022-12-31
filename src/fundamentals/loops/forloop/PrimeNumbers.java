package fundamentals.loops.forloop;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int max = new Scanner(System.in).nextInt();
        if (max >= 0 && max <= 100)
            for (int num = 1; num <= max; num++) {
                boolean isPrime = true;
                for (int i = 2; i <= num / 2; i++) {

                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (num != 1)
                    if (isPrime) {
                        System.out.println(num);
                    }
            }
    }
}
