package fundamentals.patterns.characters;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        int i = 1;
        int n = new Scanner(System.in).nextInt();
        char ch = (char) ('A' + n);
        if (n >= 0 && n <= 26)
            while (i <= n) {
                int j = 1;
                ch = (char) (ch - i);
                while (j <= i) {
                    System.out.print(ch++);
                    j++;
                }
                i++;
                System.out.println();
            }
    }
}
