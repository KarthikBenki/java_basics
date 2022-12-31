package fundamentals;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int num = n;
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(rev==num);
    }
}
