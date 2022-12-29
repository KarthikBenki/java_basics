package fundamentals.bitwise;

public class BitwiseOperators {


    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        int c = a & b;//bitwise and
        System.out.println(c);
        c = a | b;//bitwise or
        System.out.println(c);
        c = a ^ b;//bitwise xor
        System.out.println(c);
        c = ~a;//bitwise not
        System.out.println(c);

    }
}
