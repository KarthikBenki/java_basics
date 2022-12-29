package fundamentals.patterns.characters;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        int i = 1;
        int n = new Scanner(System.in).nextInt();
        if(n>=0 && n<=13)
        while (i <= n) {
            int j = 1;
            char ch = (char) ('A' + i - 1);
            while (j <= i) {
                System.out.print(ch++);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
