package fundamentals.patterns.square;

public class Pattern1 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(i+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
