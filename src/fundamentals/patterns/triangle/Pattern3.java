package fundamentals.patterns.triangle;

public class Pattern3 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        int k = 0;
        while (i <= n) {
            int j = 1;
            k = i;
            while (j <= i) {
                System.out.print(k++ + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
