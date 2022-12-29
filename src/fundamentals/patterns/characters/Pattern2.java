package fundamentals.patterns.characters;

public class Pattern2 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print((char) ('A' + i - 1));
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
