package fundamentals.loops.forloop;

import java.util.Scanner;

public class IncreasingSequence1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prev = scanner.nextInt();
        boolean isDec = false;
        boolean isInc = false;
        boolean result = true;

        for (int i = 1; i < n; i++) {
            int curr = scanner.nextInt();
            if (curr == prev) {
                result = false;
                break;
            } else if (curr > prev) {
                isInc = true;
            } else if (curr < prev) {
                if (isInc && isDec) {
                    result = false;
                    break;
                } else isDec = true;
            }
            prev = curr;
        }
        System.out.println(result);
    }
}
