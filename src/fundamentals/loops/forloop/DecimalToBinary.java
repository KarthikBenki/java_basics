package fundamentals.loops.forloop;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        long binary = 0;

        int num = new Scanner(System.in).nextInt();

        for (int i = 31; i >= 0; i--) {
//            System.out.print((num >> i & 1) + " ");
            binary = binary * 10 + (num >> i & 1);
        }

        System.out.println(binary);
    }
}
