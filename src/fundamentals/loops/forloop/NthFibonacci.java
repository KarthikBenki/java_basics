package fundamentals.loops.forloop;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        int n = 0;
        int n_1  = 1;
        int n_2 = 1;

        for (int i = 2; i < num; i++) {
            n = n_1 + n_2;
            n_1 = n_2;
            n_2 = n;
        }

        System.out.println(n);
    }
}
