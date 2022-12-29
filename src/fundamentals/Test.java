package fundamentals;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 0 && n <= 10000) {
            int i = 1;
            while (i <= 10) {
                System.out.println(n*i);
                i++;
            }
        }
    }
}
