package fundamentals;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        int i = n;
        while (i > 0) {
            int j = 1;
            while (j <= n) {
                if (i < j) System.out.print("*");
                else
                    System.out.print(j);
                j++;
            }
            j--;
            while (j > 0) {
                if (i < j) System.out.print("*");
                else
                    System.out.print(j);
                j--;
            }
            i--;
            System.out.println();
        }
    }


}
