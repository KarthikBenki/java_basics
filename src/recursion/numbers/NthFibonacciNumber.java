package recursion.numbers;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        int ans = nthFibonacciNumber(4);

        System.out.println(ans);

    }


    private static int  nthFibonacciNumber(int n) {
        if (n<=1) return n;

        return nthFibonacciNumber(n-1)+nthFibonacciNumber(n-2);
    }
}
