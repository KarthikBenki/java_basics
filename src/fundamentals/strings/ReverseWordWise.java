package fundamentals.strings;

public class ReverseWordWise {
    public static String reverseWordWise(String input) {
        int endIndex = input.length();
        String ans = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ') {
                int startIndex = i + 1;
                String str = "";
                for (int j = startIndex; j < endIndex; j++) {
                    str += input.charAt(j);
                }
                ans += str + " ";
                endIndex = startIndex - 1;
            }
            if (i == 0) {
                int startIndex = i;
                String str = "";
                for (int j = startIndex; j < endIndex; j++) {
                    str += input.charAt(j);
                }
                ans += str;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "Always indent your code";
        String s = reverseWordWise(str);
        System.out.println(s);
    }
}
