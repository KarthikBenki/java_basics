package recursion.numbers;

public class SumOfN {
    public static void main(String[] args) {
        int sum = 1;
        int n = 4;
        sum = factorial_Functional(n);
        System.out.println("factorial from functional " + sum);
//        sum = sumOfNFunctional(n);
//        System.out.println("sum from Functional " + sum);
    }

    private static int sumOfNFunctional(int n) {
        if (n == 0) return 0;
        return n + sumOfNFunctional(n - 1);
    }

    private static int factorial_Functional(int n) {
        if (n == 0) return 1;
        return n * sumOfNFunctional(n - 1);
    }

    private static int sumOfNParameter(int n, int sum) {
        if (n < 1) return sum;
        return sumOfNParameter(n - 1, sum + n);
    }

    private static int factorial_Parameter(int n, int prod) {
        if (n < 1) return prod;
        return factorial_Parameter(n - 1, prod * n);
    }
}
