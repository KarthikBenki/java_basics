package fundamentals.patterns.triangle;

public class Pattern1 {
    public static void main(String[] args) {
        int n =4;
        int i = 1;
        while (i<=n){
            int j =1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
