package fundamentals;

import java.util.Scanner;

public class MaxThreeDigitFromFourDigits {
    public static int max_number(int n) {
        double a = n % 1 + n / 10 * 1;
        double b = n % 10 + n / 100 * 10;
        double c = n % 100 + n / 1000 * 100;
        double d = n % 1000 + n / 10000 * 1000;
        return (int) Math.max(a,Math.max(b,Math.max(c,d)));
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(max_number(n));
    }
}
