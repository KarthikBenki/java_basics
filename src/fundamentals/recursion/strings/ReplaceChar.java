package fundamentals.recursion.strings;

public class ReplaceChar {
    public static void main(String[] args) {
        String s = replaceChar("abcabcabc", 'b', 'x');
        System.out.println(s);
    }

    private static String replaceChar(String s, char a, char b) {
        if (s.length() == 0) return s;

        String smallOutput = replaceChar(s.substring(1), a, b);

        if (s.charAt(0) == a) {
            return b + smallOutput;
        } else return s.charAt(0) + smallOutput;
    }

    public static String replaceChar1(String s, char a, char b) {
        if (s.length() == 0) return s;

        String smallOutput = replaceChar(s.substring(1), a, b);

        if (s.charAt(0) == a) return b + smallOutput;
        else return s.charAt(0) + smallOutput;


    }
}
