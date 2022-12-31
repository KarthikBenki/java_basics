package fundamentals;

import java.util.Scanner;

public class ArithmeticProgression {


    public static void main(String[] args) {
        int d = 0;
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prev = scanner.nextInt();
        int curr = scanner.nextInt();
        d = curr - prev;
        for (int i = 2; i < n; i++) {
            prev = curr;
            curr = scanner.nextInt();
          if(curr - prev != d) {
              result = false;
              break;
          }
          prev = curr;
        }

        System.out.println(result);

    }
}
