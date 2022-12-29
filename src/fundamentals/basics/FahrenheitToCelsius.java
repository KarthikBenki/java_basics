package fundamentals.basics;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        int s, e, w;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextInt();
        e = scanner.nextInt();
        w = scanner.nextInt();
        int i = s;
        while (i <= e) {
            System.out.println(i + " " + (int)((i-32)*(5/9f)));
            i = i + w;
        }
    }
}
