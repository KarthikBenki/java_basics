package fundamentals.loops.forloop;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // Write your code here
        int decimal = 0;
        int num = new Scanner(System.in).nextInt();
        int i = 0;
        while (num != 0) {
            int rem = num % 10;
            decimal += rem * pow(2, i);
            i++;
            num = num/10;
        }
        System.out.println(decimal);
    }

    public static int pow(int a, int b) {
        int pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }
}
