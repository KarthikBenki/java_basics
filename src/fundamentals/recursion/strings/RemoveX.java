package fundamentals.recursion.strings;

public class RemoveX {
    public static void main(String[] args) {
        String s = removeX("xaxb");
        System.out.println(s);
    }

    public static String removeX(String input) {
        if (input.length() == 0) return "";

        String smallOutput = removeX(input.substring(1));

        if (input.charAt(0) == 'x') return smallOutput;
        else return input.charAt(0) + smallOutput;
    }
}
