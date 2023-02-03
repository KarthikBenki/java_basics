package recursion;

public class TowerOfHannoi {
    public static void main(String[] args) {
        int n = 3;

        towerOfHanoi(n,'a','b','c');
    }

    private static void towerOfHanoi(int n, char a, char b, char c) {
        if (n==0) return;
        if (n==1) {
            System.out.println(a+" "+c);
            return;
        }

        towerOfHanoi(n-1,a,c,b);
        System.out.println(a+" "+c);
        towerOfHanoi(n-1,b,a,c);
    }
}
