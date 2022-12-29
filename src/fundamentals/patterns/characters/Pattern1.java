package fundamentals.patterns.characters;

public class Pattern1 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;

        while (i <= n) {
            int j = 1;
            char ch = 'A';
            while (j <= n) {
                System.out.print(ch++);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
