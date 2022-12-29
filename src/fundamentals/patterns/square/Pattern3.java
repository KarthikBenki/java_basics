package fundamentals.patterns.square;

public class Pattern3 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        while(i<=n){
            int j=1;
//            int k = 5;
            int k = 4;
            while(j<=n){
//                System.out.print(k-j + " ");
                System.out.print(k-- + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
