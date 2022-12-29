package fundamentals.basics;

import java.util.*;

public class AverageOfThree {
    public static void main(String[] args) {
        char ch;
        int m1,m2,m3,avg;

        Scanner s = new Scanner(System.in);
        ch = s.next().charAt(0);
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();

        avg = (m1+m2+m3)/3;

        System.out.println(ch);
        System.out.println(avg);


    }
}
