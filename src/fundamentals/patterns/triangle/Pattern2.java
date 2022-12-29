package fundamentals.patterns.triangle;

public class Pattern2 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        int k = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(k++ + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
