package fundamentals.loops.forloop;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();

        for (int i = 1, j = 1; i <= x; j++) {

            if ((3 * j + 2) % 4 != 0) {
                System.out.print((3 * j + 2) + " ");
                i++;
            }

        }

    }
}
