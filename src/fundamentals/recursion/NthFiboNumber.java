package fundamentals.recursion;

import java.util.Scanner;


public class NthFiboNumber {
    static long fibonacciCache[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        fibonacciCache = new long[x + 1];
        long n = fiboNumber(x);
        System.out.println(n);
    }

    private static long fiboNumber(int n) {
        if (n == 0 || n == 1) return n;

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long smallOutput1 = fiboNumber(n - 1);
        long smallOutput2 = fiboNumber(n - 2);
        long output = smallOutput1 + smallOutput2;
        fibonacciCache[n] = output;
        return output;
    }

}
