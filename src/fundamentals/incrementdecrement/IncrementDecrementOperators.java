package fundamentals.incrementdecrement;

public class IncrementDecrementOperators {
    public static void main (String[] args) {
        int a=10,b=50;
        a++;
        --b;
        int c=a--+b--;
        System.out.print(++c);
    }
}
