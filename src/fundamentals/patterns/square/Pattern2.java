package fundamentals.patterns.square;

public class Pattern2 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
