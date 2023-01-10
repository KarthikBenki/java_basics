package fundamentals.strings;

import java.util.Scanner;

public class StringsDemo {
    public static void main(String[] args) {
//        String str1 = "Coding";
//        String str2 = "Ninjas";
////        str1 = str1+str2;
//        str1 = str1.concat(str2);
//        System.out.println(str1);
//        System.out.println(str1.equals(str2));
//
//        String s2 = "Hello";
//        String s1 = new String("Hello");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);
//        System.out.println(s1.compareTo(s2));
//        System.out.println(str1.contains("ing"));
//        String a ="abcd";
//        String b="abcda";
//        System.out.println(a.compareTo(b));
//
//        System.out.println(str1.length());
//        System.out.println(str1.substring(12));
//        System.out.println(str1.substring(1,5).length());


        Scanner s=new Scanner(System.in);
        String str1=s.next();
        String str2=s.nextLine();
        String str3=str2+str1;
        System.out.println(str3);
    }
}
