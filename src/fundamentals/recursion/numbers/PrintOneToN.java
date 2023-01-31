package fundamentals.recursion.numbers;

public class PrintOneToN {
    static void printNToOne(int i,int n){
        if (i>n) return;

        printNToOne(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printNToOne(1,3);
    }
}
