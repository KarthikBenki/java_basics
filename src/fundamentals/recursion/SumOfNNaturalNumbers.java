package fundamentals.recursion;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int sum = sumOfN(10);
        System.out.println(sum);
    }

    private static int sumOfN(int n) {
        if (n==0) return 0;
        int smallOutPut = sumOfN(n-1);
        int outPut = n+smallOutPut;
        return outPut;
    }
}
