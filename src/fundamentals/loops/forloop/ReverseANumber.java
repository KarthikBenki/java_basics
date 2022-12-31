package fundamentals.loops.forloop;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int rev = 0;
        if(n>=0 && n<Math.pow(10, 8))
            for(;n!=0;n=n/10){
                int rem = n%10;
                rev = rev*10+rem;
            }

        System.out.println(rev);
    }
}
