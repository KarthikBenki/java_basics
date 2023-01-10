package fundamentals.strings;

public class StringsDemo {
    public static void main(String[] args) {
        String str1 = "Coding";
        String str2 = "Ninjas";
//        str1 = str1+str2;
        str1 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str1.equals(str2));

        String s1 = new String("Hello");
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.compareTo(s2));
        System.out.println(str1.contains("ing"));
        String a ="abcd";
        String b="abcda";
        System.out.println(a.compareTo(b));
    }
}
