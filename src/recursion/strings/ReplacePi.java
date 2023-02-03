package recursion.strings;

public class ReplacePi {
    public static void main(String[] args) {
        String s = replacePi("apiapipiaapi");//a3.14a3.143.14aa3.14
        System.out.println(s);
    }

    private static String replacePi(String s) {
        if (s.length() == 0) return s;

        if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
            String smallOutput = replacePi(s.substring(2));
            return 3.14 + smallOutput;
        } else {
            String smallOutput = replacePi(s.substring(1));
            return s.charAt(0) + smallOutput;
        }

    }
}
