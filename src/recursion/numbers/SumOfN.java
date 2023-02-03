package recursion.numbers;

public class SumOfN {
    public static void main(String[] args) {
        int sum = 0;
        int n = 4;
        sum = sumOfNParameter(n, sum);
        System.out.println("sum from parameter "  + sum);
        sum = sumOfNFunctional(n);
        System.out.println("sum from Functional " + sum);
    }

    private static int sumOfNFunctional(int n) {
        if (n == 0) return 0;
        return n + sumOfNFunctional(n - 1);
    }

    private static int sumOfNParameter(int n, int sum) {
        if (n < 1) return sum;
        return sumOfNParameter(n - 1, sum + n);
    }
}