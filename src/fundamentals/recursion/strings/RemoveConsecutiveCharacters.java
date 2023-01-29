package fundamentals.recursion.strings;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String s = removeConsecutiveDuplicates("xxxyyyzwwzzz");//xyzwz
        System.out.println(s);
    }

    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() == 0) return s;

        String smallOutput = removeConsecutiveDuplicates(s.substring(1));

        if (smallOutput.length()>0 &&  s.charAt(0) == smallOutput.charAt(0)) return smallOutput;
        else return s.charAt(0) + smallOutput;
    }
}
