package recursion.numbers;

public class PowerToN {
    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        int smallOutPut = power(x, n - 1);
        int output = x * smallOutPut;

        return output;

    }

    public static void main(String[] args) {
        int power = power(2,4);

        System.out.println(power);
    }
}
