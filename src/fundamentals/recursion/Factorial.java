package fundamentals.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = factorial(5);
        System.out.println(n);
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        int smallOutPut = factorial(n - 1);
        int outPut = n * smallOutPut;
        return outPut;
    }
}
