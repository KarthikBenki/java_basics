package fundamentals.patterns.characters;

public class Pattern3 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        while (i <= n) {
            int j = 1;
            char ch = (char) ('A' + i - 1);
            while (j <= n) {
                System.out.print(ch++);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
